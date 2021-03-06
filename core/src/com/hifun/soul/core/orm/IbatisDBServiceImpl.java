package com.hifun.soul.core.orm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hifun.soul.common.constants.CommonErrorLogInfo;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

/**
 * 基于Ibatis实现的DBService
 * 
 * Ibatis定义实体类sql操作名的命名规范为 [操作前缀] + [类名] ，涉及方法如下
 * 
 * save delete update get saveOrUpdate saveOrUpdateAll
 * 
 * 非实体类操作以 queryName 为准
 * 
 * 
 */
@SuppressWarnings("unchecked")
public class IbatisDBServiceImpl implements IDBService {
	/** 日志 */
	private static final Logger logger = LoggerFactory
			.getLogger("lzr.db.ibatis");

	/** Ibatis操作名前缀 ：新增数据 */
	public static final String ENTITY_PREFIX_INSERT = "insert";
	/** Ibatis操作名前缀 ：删除数据 */
	public static final String ENTITY_PREFIX_DELETE = "delete";
	/** Ibatis操作名前缀 ：以主键获取数据 */
	public static final String ENTITY_PREFIX_GET_OBJ_BY_ID = "getById";
	/** Ibatis操作名前缀 ：更新数据 */
	public static final String ENTITY_PREFIX_UPDATE = "update";
	/** Ibatis 主键名 */
	public static final String PRIMARY_KEY = "id";
	/** SqlMap */
	private SqlMapClient sqlMap;

	/**
	 * 初始化Ibatis
	 * 
	 * @param file
	 *            Ibatis的配置文件
	 * @param eventListenter
	 *            事件监听器
	 */
	public IbatisDBServiceImpl(File file) {
		this.buildSqlMap(file);
	}

	public IbatisDBServiceImpl(URL url) {
		this.buildSqlMap(url);
	}

	/**
	 * 通过 File 初始化 sqlMap
	 * 
	 * @param file
	 */
	private void buildSqlMap(File file) throws DataAccessException {
		InputStream _is = null;
		try {
			_is = new FileInputStream(file);
			sqlMap = SqlMapClientBuilder.buildSqlMapClient(_is);
		} catch (Exception e) {
			if (logger.isErrorEnabled()) {
				logger.error(CommonErrorLogInfo.DB_IBATIS_CONNECT_FAIL, e);
			}
			throw new DataAccessException(e);
		} finally {
			if (_is != null) {
				try {
					_is.close();
				} catch (IOException e) {
				}
			}
		}
	}

	/**
	 * 通过 url 初始化 sqlMap
	 * 
	 * @param url
	 */
	private void buildSqlMap(URL url) throws DataAccessException {
		try {
			InputStream _is = url.openStream();
			sqlMap = SqlMapClientBuilder.buildSqlMapClient(_is);
		} catch (Exception e) {
			if (logger.isErrorEnabled()) {
				logger.error(CommonErrorLogInfo.DB_IBATIS_CONNECT_FAIL, e);
			}
			throw new DataAccessException(e);
		}
	}

	@Override
	public Serializable insert(final IEntity entity) throws DataAccessException {
		try {
			return this.sqlMap.update(
					generateSqlName(ENTITY_PREFIX_INSERT, entity), entity);
		} catch (Exception e) {
			this.trigerEventOnFail(e);
			throw new DataAccessException(e);
		}
	}

	@Override
	public void delete(final IEntity entity) throws DataAccessException {
		try {
			this.sqlMap.update(generateSqlName(ENTITY_PREFIX_DELETE, entity),
					entity);
		} catch (Exception e) {
			this.trigerEventOnFail(e);
			throw new DataAccessException(e);
		}
	}

	@Override
	public void update(final IEntity entity) throws DataAccessException {
		try {
			this.sqlMap.update(generateSqlName(ENTITY_PREFIX_UPDATE, entity),
					entity);
		} catch (Exception e) {
			this.trigerEventOnFail(e);
			throw new DataAccessException(e);
		}
	}

	@Override
	public <T extends IEntity> T get(final Class<T> entityClass,
			final Serializable id) throws DataAccessException {
		try {
			Map<String, Object> _param = new HashMap<String, Object>(1);
			_param.put(PRIMARY_KEY, id);
			return (T) this.sqlMap.queryForObject(ENTITY_PREFIX_GET_OBJ_BY_ID
					+ entityClass.getSimpleName(), _param);
		} catch (Exception e) {
			this.trigerEventOnFail(e);
			throw new DataAccessException(e);
		}
	}

	@Override
	public List<?> findByNamedQuery(final String queryName)
			throws DataAccessException {
		return findByNamedQueryAndNamedParam(queryName, null, null);
	}

	@Override
	public List<?> findByNamedQueryAndNamedParam(final String queryName,
			final String[] paramNames, final Object[] values)
			throws DataAccessException {
		return findByNamedQueryAndNamedParam(queryName, paramNames, values, -1,
				-1);
	}

	@Override
	public List<?> findByNamedQueryAndNamedParam(final String queryName,
			final String[] paramNames, final Object[] values,
			final int maxResult, final int start) throws DataAccessException {
		try {
			Map<String, Object> _param = prepareParams(paramNames, values);
			if (maxResult > -1 && start > -1) {
				return this.sqlMap.queryForList(queryName, _param, start,
						maxResult);
			} else {
				return this.sqlMap.queryForList(queryName, _param);
			}
		} catch (Exception e) {
			this.trigerEventOnFail(e);
			throw new DataAccessException(e);
		}
	}

	@Override
	public int queryForUpdate(String queryName, String[] paramNames,
			Object[] values) throws DataAccessException {
		throw new UnsupportedOperationException();
	}

	/**
	 * 构建Sql名： 前缀 + 实体类名
	 * 
	 * @param entity
	 * @param prefix
	 * @return
	 */
	private String generateSqlName(final String prefix, final IEntity entity) {
		return prefix + entity.getClass().getSimpleName();
	}

	/**
	 * 构建参数集合
	 * 
	 * @param paramNames
	 * @param values
	 * @return
	 */
	private Map<String, Object> prepareParams(final String[] paramNames,
			final Object[] values) {
		if (arrayLength(paramNames) != arrayLength(values)) {
			throw new IllegalArgumentException(
					"The paramNames length != values length");
		}
		Map<String, Object> _param = new HashMap<String, Object>();
		for (int i = 0; paramNames != null && i < paramNames.length; i++) {
			_param.put(paramNames[i], values[i]);
		}
		return _param;
	}

	/**
	 * 取得数组的长度
	 * 
	 * @param arrays
	 * @return
	 */
	private int arrayLength(Object[] arrays) {
		return arrays == null ? -1 : arrays.length;
	}

	/**
	 * DB操作失败触发数据库访问的失败日志
	 * 
	 * @param e
	 */
	private void trigerEventOnFail(Exception e) {
		// TODO
	}

	@Override
	public void softDelete(SoftDeleteEntity entity) throws DataAccessException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void softDeleteById(Class<? extends SoftDeleteEntity> entityClass,
			Serializable id) throws DataAccessException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void deleteById(Class<? extends IEntity> entityClass, Serializable id) {

		throw new UnsupportedOperationException();

	}

	@Override
	public void saveOrUpdate(IEntity entity) throws DataAccessException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void check() {

	}

	@Override
	public void checkDbVersion(String version) {
		// TODO Auto-generated method stub
		
	}

}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Horoscope.proto

package com.hifun.soul.proto.common;

public final class Horoscopes {
  private Horoscopes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface HoroscopeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 bagType = 1;
    boolean hasBagType();
    int getBagType();
    
    // required int32 bagIndex = 2;
    boolean hasBagIndex();
    int getBagIndex();
    
    // required int32 horoscopeId = 3;
    boolean hasHoroscopeId();
    int getHoroscopeId();
    
    // required int32 experience = 4;
    boolean hasExperience();
    int getExperience();
    
    // required string horoscopeKey = 5;
    boolean hasHoroscopeKey();
    String getHoroscopeKey();
  }
  public static final class Horoscope extends
      com.google.protobuf.GeneratedMessage
      implements HoroscopeOrBuilder {
    // Use Horoscope.newBuilder() to construct.
    private Horoscope(Builder builder) {
      super(builder);
    }
    private Horoscope(boolean noInit) {}
    
    private static final Horoscope defaultInstance;
    public static Horoscope getDefaultInstance() {
      return defaultInstance;
    }
    
    public Horoscope getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hifun.soul.proto.common.Horoscopes.internal_static_com_hifun_soul_proto_common_Horoscope_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hifun.soul.proto.common.Horoscopes.internal_static_com_hifun_soul_proto_common_Horoscope_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 bagType = 1;
    public static final int BAGTYPE_FIELD_NUMBER = 1;
    private int bagType_;
    public boolean hasBagType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getBagType() {
      return bagType_;
    }
    
    // required int32 bagIndex = 2;
    public static final int BAGINDEX_FIELD_NUMBER = 2;
    private int bagIndex_;
    public boolean hasBagIndex() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getBagIndex() {
      return bagIndex_;
    }
    
    // required int32 horoscopeId = 3;
    public static final int HOROSCOPEID_FIELD_NUMBER = 3;
    private int horoscopeId_;
    public boolean hasHoroscopeId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getHoroscopeId() {
      return horoscopeId_;
    }
    
    // required int32 experience = 4;
    public static final int EXPERIENCE_FIELD_NUMBER = 4;
    private int experience_;
    public boolean hasExperience() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getExperience() {
      return experience_;
    }
    
    // required string horoscopeKey = 5;
    public static final int HOROSCOPEKEY_FIELD_NUMBER = 5;
    private java.lang.Object horoscopeKey_;
    public boolean hasHoroscopeKey() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public String getHoroscopeKey() {
      java.lang.Object ref = horoscopeKey_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          horoscopeKey_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getHoroscopeKeyBytes() {
      java.lang.Object ref = horoscopeKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        horoscopeKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      bagType_ = 0;
      bagIndex_ = 0;
      horoscopeId_ = 0;
      experience_ = 0;
      horoscopeKey_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasBagType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBagIndex()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasHoroscopeId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasExperience()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasHoroscopeKey()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, bagType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, bagIndex_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, horoscopeId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, experience_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getHoroscopeKeyBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, bagType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, bagIndex_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, horoscopeId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, experience_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getHoroscopeKeyBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.hifun.soul.proto.common.Horoscopes.Horoscope parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hifun.soul.proto.common.Horoscopes.Horoscope parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.Horoscopes.Horoscope parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hifun.soul.proto.common.Horoscopes.Horoscope parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.Horoscopes.Horoscope parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hifun.soul.proto.common.Horoscopes.Horoscope parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.Horoscopes.Horoscope parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.hifun.soul.proto.common.Horoscopes.Horoscope parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.hifun.soul.proto.common.Horoscopes.Horoscope parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hifun.soul.proto.common.Horoscopes.Horoscope parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.hifun.soul.proto.common.Horoscopes.Horoscope prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.hifun.soul.proto.common.Horoscopes.HoroscopeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.hifun.soul.proto.common.Horoscopes.internal_static_com_hifun_soul_proto_common_Horoscope_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.hifun.soul.proto.common.Horoscopes.internal_static_com_hifun_soul_proto_common_Horoscope_fieldAccessorTable;
      }
      
      // Construct using com.hifun.soul.proto.common.Horoscopes.Horoscope.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        bagType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        bagIndex_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        horoscopeId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        experience_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        horoscopeKey_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.hifun.soul.proto.common.Horoscopes.Horoscope.getDescriptor();
      }
      
      public com.hifun.soul.proto.common.Horoscopes.Horoscope getDefaultInstanceForType() {
        return com.hifun.soul.proto.common.Horoscopes.Horoscope.getDefaultInstance();
      }
      
      public com.hifun.soul.proto.common.Horoscopes.Horoscope build() {
        com.hifun.soul.proto.common.Horoscopes.Horoscope result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.hifun.soul.proto.common.Horoscopes.Horoscope buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.hifun.soul.proto.common.Horoscopes.Horoscope result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.hifun.soul.proto.common.Horoscopes.Horoscope buildPartial() {
        com.hifun.soul.proto.common.Horoscopes.Horoscope result = new com.hifun.soul.proto.common.Horoscopes.Horoscope(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.bagType_ = bagType_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.bagIndex_ = bagIndex_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.horoscopeId_ = horoscopeId_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.experience_ = experience_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.horoscopeKey_ = horoscopeKey_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.hifun.soul.proto.common.Horoscopes.Horoscope) {
          return mergeFrom((com.hifun.soul.proto.common.Horoscopes.Horoscope)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.hifun.soul.proto.common.Horoscopes.Horoscope other) {
        if (other == com.hifun.soul.proto.common.Horoscopes.Horoscope.getDefaultInstance()) return this;
        if (other.hasBagType()) {
          setBagType(other.getBagType());
        }
        if (other.hasBagIndex()) {
          setBagIndex(other.getBagIndex());
        }
        if (other.hasHoroscopeId()) {
          setHoroscopeId(other.getHoroscopeId());
        }
        if (other.hasExperience()) {
          setExperience(other.getExperience());
        }
        if (other.hasHoroscopeKey()) {
          setHoroscopeKey(other.getHoroscopeKey());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasBagType()) {
          
          return false;
        }
        if (!hasBagIndex()) {
          
          return false;
        }
        if (!hasHoroscopeId()) {
          
          return false;
        }
        if (!hasExperience()) {
          
          return false;
        }
        if (!hasHoroscopeKey()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              bagType_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              bagIndex_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              horoscopeId_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              experience_ = input.readInt32();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              horoscopeKey_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 bagType = 1;
      private int bagType_ ;
      public boolean hasBagType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getBagType() {
        return bagType_;
      }
      public Builder setBagType(int value) {
        bitField0_ |= 0x00000001;
        bagType_ = value;
        onChanged();
        return this;
      }
      public Builder clearBagType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        bagType_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 bagIndex = 2;
      private int bagIndex_ ;
      public boolean hasBagIndex() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getBagIndex() {
        return bagIndex_;
      }
      public Builder setBagIndex(int value) {
        bitField0_ |= 0x00000002;
        bagIndex_ = value;
        onChanged();
        return this;
      }
      public Builder clearBagIndex() {
        bitField0_ = (bitField0_ & ~0x00000002);
        bagIndex_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 horoscopeId = 3;
      private int horoscopeId_ ;
      public boolean hasHoroscopeId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getHoroscopeId() {
        return horoscopeId_;
      }
      public Builder setHoroscopeId(int value) {
        bitField0_ |= 0x00000004;
        horoscopeId_ = value;
        onChanged();
        return this;
      }
      public Builder clearHoroscopeId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        horoscopeId_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 experience = 4;
      private int experience_ ;
      public boolean hasExperience() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getExperience() {
        return experience_;
      }
      public Builder setExperience(int value) {
        bitField0_ |= 0x00000008;
        experience_ = value;
        onChanged();
        return this;
      }
      public Builder clearExperience() {
        bitField0_ = (bitField0_ & ~0x00000008);
        experience_ = 0;
        onChanged();
        return this;
      }
      
      // required string horoscopeKey = 5;
      private java.lang.Object horoscopeKey_ = "";
      public boolean hasHoroscopeKey() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public String getHoroscopeKey() {
        java.lang.Object ref = horoscopeKey_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          horoscopeKey_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setHoroscopeKey(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        horoscopeKey_ = value;
        onChanged();
        return this;
      }
      public Builder clearHoroscopeKey() {
        bitField0_ = (bitField0_ & ~0x00000010);
        horoscopeKey_ = getDefaultInstance().getHoroscopeKey();
        onChanged();
        return this;
      }
      void setHoroscopeKey(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000010;
        horoscopeKey_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.hifun.soul.proto.common.Horoscope)
    }
    
    static {
      defaultInstance = new Horoscope(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.hifun.soul.proto.common.Horoscope)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hifun_soul_proto_common_Horoscope_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hifun_soul_proto_common_Horoscope_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017Horoscope.proto\022\033com.hifun.soul.proto." +
      "common\"m\n\tHoroscope\022\017\n\007bagType\030\001 \002(\005\022\020\n\010" +
      "bagIndex\030\002 \002(\005\022\023\n\013horoscopeId\030\003 \002(\005\022\022\n\ne" +
      "xperience\030\004 \002(\005\022\024\n\014horoscopeKey\030\005 \002(\tB)\n" +
      "\033com.hifun.soul.proto.commonB\nHoroscopes"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_hifun_soul_proto_common_Horoscope_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_hifun_soul_proto_common_Horoscope_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_hifun_soul_proto_common_Horoscope_descriptor,
              new java.lang.String[] { "BagType", "BagIndex", "HoroscopeId", "Experience", "HoroscopeKey", },
              com.hifun.soul.proto.common.Horoscopes.Horoscope.class,
              com.hifun.soul.proto.common.Horoscopes.Horoscope.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}

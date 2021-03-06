// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Skill.proto

package com.hifun.soul.proto.common;

public final class Skills {
  private Skills() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CarriedSkillOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 skillId = 1;
    boolean hasSkillId();
    int getSkillId();
    
    // required int32 slotIndex = 2;
    boolean hasSlotIndex();
    int getSlotIndex();
    
    // required int32 skillState = 3;
    boolean hasSkillState();
    int getSkillState();
  }
  public static final class CarriedSkill extends
      com.google.protobuf.GeneratedMessage
      implements CarriedSkillOrBuilder {
    // Use CarriedSkill.newBuilder() to construct.
    private CarriedSkill(Builder builder) {
      super(builder);
    }
    private CarriedSkill(boolean noInit) {}
    
    private static final CarriedSkill defaultInstance;
    public static CarriedSkill getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarriedSkill getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hifun.soul.proto.common.Skills.internal_static_com_hifun_soul_proto_common_CarriedSkill_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hifun.soul.proto.common.Skills.internal_static_com_hifun_soul_proto_common_CarriedSkill_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 skillId = 1;
    public static final int SKILLID_FIELD_NUMBER = 1;
    private int skillId_;
    public boolean hasSkillId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getSkillId() {
      return skillId_;
    }
    
    // required int32 slotIndex = 2;
    public static final int SLOTINDEX_FIELD_NUMBER = 2;
    private int slotIndex_;
    public boolean hasSlotIndex() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getSlotIndex() {
      return slotIndex_;
    }
    
    // required int32 skillState = 3;
    public static final int SKILLSTATE_FIELD_NUMBER = 3;
    private int skillState_;
    public boolean hasSkillState() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getSkillState() {
      return skillState_;
    }
    
    private void initFields() {
      skillId_ = 0;
      slotIndex_ = 0;
      skillState_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSkillId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSlotIndex()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSkillState()) {
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
        output.writeInt32(1, skillId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, slotIndex_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, skillState_);
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
          .computeInt32Size(1, skillId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, slotIndex_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, skillState_);
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
    
    public static com.hifun.soul.proto.common.Skills.CarriedSkill parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hifun.soul.proto.common.Skills.CarriedSkill parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.Skills.CarriedSkill parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hifun.soul.proto.common.Skills.CarriedSkill parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.Skills.CarriedSkill parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hifun.soul.proto.common.Skills.CarriedSkill parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.Skills.CarriedSkill parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.hifun.soul.proto.common.Skills.CarriedSkill parseDelimitedFrom(
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
    public static com.hifun.soul.proto.common.Skills.CarriedSkill parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hifun.soul.proto.common.Skills.CarriedSkill parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.hifun.soul.proto.common.Skills.CarriedSkill prototype) {
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
       implements com.hifun.soul.proto.common.Skills.CarriedSkillOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.hifun.soul.proto.common.Skills.internal_static_com_hifun_soul_proto_common_CarriedSkill_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.hifun.soul.proto.common.Skills.internal_static_com_hifun_soul_proto_common_CarriedSkill_fieldAccessorTable;
      }
      
      // Construct using com.hifun.soul.proto.common.Skills.CarriedSkill.newBuilder()
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
        skillId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        slotIndex_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        skillState_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.hifun.soul.proto.common.Skills.CarriedSkill.getDescriptor();
      }
      
      public com.hifun.soul.proto.common.Skills.CarriedSkill getDefaultInstanceForType() {
        return com.hifun.soul.proto.common.Skills.CarriedSkill.getDefaultInstance();
      }
      
      public com.hifun.soul.proto.common.Skills.CarriedSkill build() {
        com.hifun.soul.proto.common.Skills.CarriedSkill result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.hifun.soul.proto.common.Skills.CarriedSkill buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.hifun.soul.proto.common.Skills.CarriedSkill result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.hifun.soul.proto.common.Skills.CarriedSkill buildPartial() {
        com.hifun.soul.proto.common.Skills.CarriedSkill result = new com.hifun.soul.proto.common.Skills.CarriedSkill(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.skillId_ = skillId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.slotIndex_ = slotIndex_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.skillState_ = skillState_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.hifun.soul.proto.common.Skills.CarriedSkill) {
          return mergeFrom((com.hifun.soul.proto.common.Skills.CarriedSkill)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.hifun.soul.proto.common.Skills.CarriedSkill other) {
        if (other == com.hifun.soul.proto.common.Skills.CarriedSkill.getDefaultInstance()) return this;
        if (other.hasSkillId()) {
          setSkillId(other.getSkillId());
        }
        if (other.hasSlotIndex()) {
          setSlotIndex(other.getSlotIndex());
        }
        if (other.hasSkillState()) {
          setSkillState(other.getSkillState());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSkillId()) {
          
          return false;
        }
        if (!hasSlotIndex()) {
          
          return false;
        }
        if (!hasSkillState()) {
          
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
              skillId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              slotIndex_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              skillState_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 skillId = 1;
      private int skillId_ ;
      public boolean hasSkillId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getSkillId() {
        return skillId_;
      }
      public Builder setSkillId(int value) {
        bitField0_ |= 0x00000001;
        skillId_ = value;
        onChanged();
        return this;
      }
      public Builder clearSkillId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        skillId_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 slotIndex = 2;
      private int slotIndex_ ;
      public boolean hasSlotIndex() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getSlotIndex() {
        return slotIndex_;
      }
      public Builder setSlotIndex(int value) {
        bitField0_ |= 0x00000002;
        slotIndex_ = value;
        onChanged();
        return this;
      }
      public Builder clearSlotIndex() {
        bitField0_ = (bitField0_ & ~0x00000002);
        slotIndex_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 skillState = 3;
      private int skillState_ ;
      public boolean hasSkillState() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getSkillState() {
        return skillState_;
      }
      public Builder setSkillState(int value) {
        bitField0_ |= 0x00000004;
        skillState_ = value;
        onChanged();
        return this;
      }
      public Builder clearSkillState() {
        bitField0_ = (bitField0_ & ~0x00000004);
        skillState_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.hifun.soul.proto.common.CarriedSkill)
    }
    
    static {
      defaultInstance = new CarriedSkill(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.hifun.soul.proto.common.CarriedSkill)
  }
  
  public interface SkillSlotOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 slotIndex = 1;
    boolean hasSlotIndex();
    int getSlotIndex();
    
    // required int32 state = 2;
    boolean hasState();
    int getState();
  }
  public static final class SkillSlot extends
      com.google.protobuf.GeneratedMessage
      implements SkillSlotOrBuilder {
    // Use SkillSlot.newBuilder() to construct.
    private SkillSlot(Builder builder) {
      super(builder);
    }
    private SkillSlot(boolean noInit) {}
    
    private static final SkillSlot defaultInstance;
    public static SkillSlot getDefaultInstance() {
      return defaultInstance;
    }
    
    public SkillSlot getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hifun.soul.proto.common.Skills.internal_static_com_hifun_soul_proto_common_SkillSlot_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hifun.soul.proto.common.Skills.internal_static_com_hifun_soul_proto_common_SkillSlot_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 slotIndex = 1;
    public static final int SLOTINDEX_FIELD_NUMBER = 1;
    private int slotIndex_;
    public boolean hasSlotIndex() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getSlotIndex() {
      return slotIndex_;
    }
    
    // required int32 state = 2;
    public static final int STATE_FIELD_NUMBER = 2;
    private int state_;
    public boolean hasState() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getState() {
      return state_;
    }
    
    private void initFields() {
      slotIndex_ = 0;
      state_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSlotIndex()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasState()) {
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
        output.writeInt32(1, slotIndex_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, state_);
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
          .computeInt32Size(1, slotIndex_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, state_);
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
    
    public static com.hifun.soul.proto.common.Skills.SkillSlot parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hifun.soul.proto.common.Skills.SkillSlot parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.Skills.SkillSlot parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hifun.soul.proto.common.Skills.SkillSlot parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.Skills.SkillSlot parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hifun.soul.proto.common.Skills.SkillSlot parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.Skills.SkillSlot parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.hifun.soul.proto.common.Skills.SkillSlot parseDelimitedFrom(
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
    public static com.hifun.soul.proto.common.Skills.SkillSlot parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hifun.soul.proto.common.Skills.SkillSlot parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.hifun.soul.proto.common.Skills.SkillSlot prototype) {
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
       implements com.hifun.soul.proto.common.Skills.SkillSlotOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.hifun.soul.proto.common.Skills.internal_static_com_hifun_soul_proto_common_SkillSlot_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.hifun.soul.proto.common.Skills.internal_static_com_hifun_soul_proto_common_SkillSlot_fieldAccessorTable;
      }
      
      // Construct using com.hifun.soul.proto.common.Skills.SkillSlot.newBuilder()
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
        slotIndex_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        state_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.hifun.soul.proto.common.Skills.SkillSlot.getDescriptor();
      }
      
      public com.hifun.soul.proto.common.Skills.SkillSlot getDefaultInstanceForType() {
        return com.hifun.soul.proto.common.Skills.SkillSlot.getDefaultInstance();
      }
      
      public com.hifun.soul.proto.common.Skills.SkillSlot build() {
        com.hifun.soul.proto.common.Skills.SkillSlot result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.hifun.soul.proto.common.Skills.SkillSlot buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.hifun.soul.proto.common.Skills.SkillSlot result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.hifun.soul.proto.common.Skills.SkillSlot buildPartial() {
        com.hifun.soul.proto.common.Skills.SkillSlot result = new com.hifun.soul.proto.common.Skills.SkillSlot(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.slotIndex_ = slotIndex_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.state_ = state_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.hifun.soul.proto.common.Skills.SkillSlot) {
          return mergeFrom((com.hifun.soul.proto.common.Skills.SkillSlot)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.hifun.soul.proto.common.Skills.SkillSlot other) {
        if (other == com.hifun.soul.proto.common.Skills.SkillSlot.getDefaultInstance()) return this;
        if (other.hasSlotIndex()) {
          setSlotIndex(other.getSlotIndex());
        }
        if (other.hasState()) {
          setState(other.getState());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSlotIndex()) {
          
          return false;
        }
        if (!hasState()) {
          
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
              slotIndex_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              state_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 slotIndex = 1;
      private int slotIndex_ ;
      public boolean hasSlotIndex() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getSlotIndex() {
        return slotIndex_;
      }
      public Builder setSlotIndex(int value) {
        bitField0_ |= 0x00000001;
        slotIndex_ = value;
        onChanged();
        return this;
      }
      public Builder clearSlotIndex() {
        bitField0_ = (bitField0_ & ~0x00000001);
        slotIndex_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 state = 2;
      private int state_ ;
      public boolean hasState() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getState() {
        return state_;
      }
      public Builder setState(int value) {
        bitField0_ |= 0x00000002;
        state_ = value;
        onChanged();
        return this;
      }
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000002);
        state_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.hifun.soul.proto.common.SkillSlot)
    }
    
    static {
      defaultInstance = new SkillSlot(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.hifun.soul.proto.common.SkillSlot)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hifun_soul_proto_common_CarriedSkill_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hifun_soul_proto_common_CarriedSkill_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hifun_soul_proto_common_SkillSlot_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hifun_soul_proto_common_SkillSlot_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Skill.proto\022\033com.hifun.soul.proto.comm" +
      "on\"F\n\014CarriedSkill\022\017\n\007skillId\030\001 \002(\005\022\021\n\ts" +
      "lotIndex\030\002 \002(\005\022\022\n\nskillState\030\003 \002(\005\"-\n\tSk" +
      "illSlot\022\021\n\tslotIndex\030\001 \002(\005\022\r\n\005state\030\002 \002(" +
      "\005B%\n\033com.hifun.soul.proto.commonB\006Skills"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_hifun_soul_proto_common_CarriedSkill_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_hifun_soul_proto_common_CarriedSkill_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_hifun_soul_proto_common_CarriedSkill_descriptor,
              new java.lang.String[] { "SkillId", "SlotIndex", "SkillState", },
              com.hifun.soul.proto.common.Skills.CarriedSkill.class,
              com.hifun.soul.proto.common.Skills.CarriedSkill.Builder.class);
          internal_static_com_hifun_soul_proto_common_SkillSlot_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_com_hifun_soul_proto_common_SkillSlot_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_hifun_soul_proto_common_SkillSlot_descriptor,
              new java.lang.String[] { "SlotIndex", "State", },
              com.hifun.soul.proto.common.Skills.SkillSlot.class,
              com.hifun.soul.proto.common.Skills.SkillSlot.Builder.class);
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

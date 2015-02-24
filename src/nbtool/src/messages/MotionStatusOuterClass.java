// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MotionStatus.proto

package messages;

public final class MotionStatusOuterClass {
  private MotionStatusOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MotionStatusOrBuilder extends
      // @@protoc_insertion_point(interface_extends:messages.MotionStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bool standing = 1;</code>
     */
    boolean hasStanding();
    /**
     * <code>optional bool standing = 1;</code>
     */
    boolean getStanding();

    /**
     * <code>optional bool body_is_active = 2;</code>
     */
    boolean hasBodyIsActive();
    /**
     * <code>optional bool body_is_active = 2;</code>
     */
    boolean getBodyIsActive();

    /**
     * <code>optional bool walk_is_active = 3;</code>
     */
    boolean hasWalkIsActive();
    /**
     * <code>optional bool walk_is_active = 3;</code>
     */
    boolean getWalkIsActive();

    /**
     * <code>optional bool head_is_active = 4;</code>
     */
    boolean hasHeadIsActive();
    /**
     * <code>optional bool head_is_active = 4;</code>
     */
    boolean getHeadIsActive();

    /**
     * <code>optional bool calibrated = 5;</code>
     */
    boolean hasCalibrated();
    /**
     * <code>optional bool calibrated = 5;</code>
     */
    boolean getCalibrated();

    /**
     * <code>optional bool upright = 6;</code>
     */
    boolean hasUpright();
    /**
     * <code>optional bool upright = 6;</code>
     */
    boolean getUpright();
  }
  /**
   * Protobuf type {@code messages.MotionStatus}
   */
  public static final class MotionStatus extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:messages.MotionStatus)
      MotionStatusOrBuilder {
    // Use MotionStatus.newBuilder() to construct.
    private MotionStatus(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private MotionStatus(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final MotionStatus defaultInstance;
    public static MotionStatus getDefaultInstance() {
      return defaultInstance;
    }

    public MotionStatus getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private MotionStatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              standing_ = input.readBool();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              bodyIsActive_ = input.readBool();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              walkIsActive_ = input.readBool();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              headIsActive_ = input.readBool();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              calibrated_ = input.readBool();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              upright_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return messages.MotionStatusOuterClass.internal_static_messages_MotionStatus_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return messages.MotionStatusOuterClass.internal_static_messages_MotionStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              messages.MotionStatusOuterClass.MotionStatus.class, messages.MotionStatusOuterClass.MotionStatus.Builder.class);
    }

    public static com.google.protobuf.Parser<MotionStatus> PARSER =
        new com.google.protobuf.AbstractParser<MotionStatus>() {
      public MotionStatus parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MotionStatus(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<MotionStatus> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int STANDING_FIELD_NUMBER = 1;
    private boolean standing_;
    /**
     * <code>optional bool standing = 1;</code>
     */
    public boolean hasStanding() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bool standing = 1;</code>
     */
    public boolean getStanding() {
      return standing_;
    }

    public static final int BODY_IS_ACTIVE_FIELD_NUMBER = 2;
    private boolean bodyIsActive_;
    /**
     * <code>optional bool body_is_active = 2;</code>
     */
    public boolean hasBodyIsActive() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bool body_is_active = 2;</code>
     */
    public boolean getBodyIsActive() {
      return bodyIsActive_;
    }

    public static final int WALK_IS_ACTIVE_FIELD_NUMBER = 3;
    private boolean walkIsActive_;
    /**
     * <code>optional bool walk_is_active = 3;</code>
     */
    public boolean hasWalkIsActive() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bool walk_is_active = 3;</code>
     */
    public boolean getWalkIsActive() {
      return walkIsActive_;
    }

    public static final int HEAD_IS_ACTIVE_FIELD_NUMBER = 4;
    private boolean headIsActive_;
    /**
     * <code>optional bool head_is_active = 4;</code>
     */
    public boolean hasHeadIsActive() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bool head_is_active = 4;</code>
     */
    public boolean getHeadIsActive() {
      return headIsActive_;
    }

    public static final int CALIBRATED_FIELD_NUMBER = 5;
    private boolean calibrated_;
    /**
     * <code>optional bool calibrated = 5;</code>
     */
    public boolean hasCalibrated() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional bool calibrated = 5;</code>
     */
    public boolean getCalibrated() {
      return calibrated_;
    }

    public static final int UPRIGHT_FIELD_NUMBER = 6;
    private boolean upright_;
    /**
     * <code>optional bool upright = 6;</code>
     */
    public boolean hasUpright() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional bool upright = 6;</code>
     */
    public boolean getUpright() {
      return upright_;
    }

    private void initFields() {
      standing_ = false;
      bodyIsActive_ = false;
      walkIsActive_ = false;
      headIsActive_ = false;
      calibrated_ = false;
      upright_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, standing_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, bodyIsActive_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, walkIsActive_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBool(4, headIsActive_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBool(5, calibrated_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBool(6, upright_);
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
          .computeBoolSize(1, standing_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, bodyIsActive_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, walkIsActive_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, headIsActive_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, calibrated_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, upright_);
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

    public static messages.MotionStatusOuterClass.MotionStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messages.MotionStatusOuterClass.MotionStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messages.MotionStatusOuterClass.MotionStatus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messages.MotionStatusOuterClass.MotionStatus parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messages.MotionStatusOuterClass.MotionStatus parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static messages.MotionStatusOuterClass.MotionStatus parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static messages.MotionStatusOuterClass.MotionStatus parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static messages.MotionStatusOuterClass.MotionStatus parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static messages.MotionStatusOuterClass.MotionStatus parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static messages.MotionStatusOuterClass.MotionStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(messages.MotionStatusOuterClass.MotionStatus prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code messages.MotionStatus}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:messages.MotionStatus)
        messages.MotionStatusOuterClass.MotionStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return messages.MotionStatusOuterClass.internal_static_messages_MotionStatus_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return messages.MotionStatusOuterClass.internal_static_messages_MotionStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                messages.MotionStatusOuterClass.MotionStatus.class, messages.MotionStatusOuterClass.MotionStatus.Builder.class);
      }

      // Construct using messages.MotionStatusOuterClass.MotionStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
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
        standing_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        bodyIsActive_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        walkIsActive_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        headIsActive_ = false;
        bitField0_ = (bitField0_ & ~0x00000008);
        calibrated_ = false;
        bitField0_ = (bitField0_ & ~0x00000010);
        upright_ = false;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return messages.MotionStatusOuterClass.internal_static_messages_MotionStatus_descriptor;
      }

      public messages.MotionStatusOuterClass.MotionStatus getDefaultInstanceForType() {
        return messages.MotionStatusOuterClass.MotionStatus.getDefaultInstance();
      }

      public messages.MotionStatusOuterClass.MotionStatus build() {
        messages.MotionStatusOuterClass.MotionStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public messages.MotionStatusOuterClass.MotionStatus buildPartial() {
        messages.MotionStatusOuterClass.MotionStatus result = new messages.MotionStatusOuterClass.MotionStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.standing_ = standing_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.bodyIsActive_ = bodyIsActive_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.walkIsActive_ = walkIsActive_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.headIsActive_ = headIsActive_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.calibrated_ = calibrated_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.upright_ = upright_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof messages.MotionStatusOuterClass.MotionStatus) {
          return mergeFrom((messages.MotionStatusOuterClass.MotionStatus)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(messages.MotionStatusOuterClass.MotionStatus other) {
        if (other == messages.MotionStatusOuterClass.MotionStatus.getDefaultInstance()) return this;
        if (other.hasStanding()) {
          setStanding(other.getStanding());
        }
        if (other.hasBodyIsActive()) {
          setBodyIsActive(other.getBodyIsActive());
        }
        if (other.hasWalkIsActive()) {
          setWalkIsActive(other.getWalkIsActive());
        }
        if (other.hasHeadIsActive()) {
          setHeadIsActive(other.getHeadIsActive());
        }
        if (other.hasCalibrated()) {
          setCalibrated(other.getCalibrated());
        }
        if (other.hasUpright()) {
          setUpright(other.getUpright());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        messages.MotionStatusOuterClass.MotionStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (messages.MotionStatusOuterClass.MotionStatus) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean standing_ ;
      /**
       * <code>optional bool standing = 1;</code>
       */
      public boolean hasStanding() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional bool standing = 1;</code>
       */
      public boolean getStanding() {
        return standing_;
      }
      /**
       * <code>optional bool standing = 1;</code>
       */
      public Builder setStanding(boolean value) {
        bitField0_ |= 0x00000001;
        standing_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool standing = 1;</code>
       */
      public Builder clearStanding() {
        bitField0_ = (bitField0_ & ~0x00000001);
        standing_ = false;
        onChanged();
        return this;
      }

      private boolean bodyIsActive_ ;
      /**
       * <code>optional bool body_is_active = 2;</code>
       */
      public boolean hasBodyIsActive() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bool body_is_active = 2;</code>
       */
      public boolean getBodyIsActive() {
        return bodyIsActive_;
      }
      /**
       * <code>optional bool body_is_active = 2;</code>
       */
      public Builder setBodyIsActive(boolean value) {
        bitField0_ |= 0x00000002;
        bodyIsActive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool body_is_active = 2;</code>
       */
      public Builder clearBodyIsActive() {
        bitField0_ = (bitField0_ & ~0x00000002);
        bodyIsActive_ = false;
        onChanged();
        return this;
      }

      private boolean walkIsActive_ ;
      /**
       * <code>optional bool walk_is_active = 3;</code>
       */
      public boolean hasWalkIsActive() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bool walk_is_active = 3;</code>
       */
      public boolean getWalkIsActive() {
        return walkIsActive_;
      }
      /**
       * <code>optional bool walk_is_active = 3;</code>
       */
      public Builder setWalkIsActive(boolean value) {
        bitField0_ |= 0x00000004;
        walkIsActive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool walk_is_active = 3;</code>
       */
      public Builder clearWalkIsActive() {
        bitField0_ = (bitField0_ & ~0x00000004);
        walkIsActive_ = false;
        onChanged();
        return this;
      }

      private boolean headIsActive_ ;
      /**
       * <code>optional bool head_is_active = 4;</code>
       */
      public boolean hasHeadIsActive() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional bool head_is_active = 4;</code>
       */
      public boolean getHeadIsActive() {
        return headIsActive_;
      }
      /**
       * <code>optional bool head_is_active = 4;</code>
       */
      public Builder setHeadIsActive(boolean value) {
        bitField0_ |= 0x00000008;
        headIsActive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool head_is_active = 4;</code>
       */
      public Builder clearHeadIsActive() {
        bitField0_ = (bitField0_ & ~0x00000008);
        headIsActive_ = false;
        onChanged();
        return this;
      }

      private boolean calibrated_ ;
      /**
       * <code>optional bool calibrated = 5;</code>
       */
      public boolean hasCalibrated() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional bool calibrated = 5;</code>
       */
      public boolean getCalibrated() {
        return calibrated_;
      }
      /**
       * <code>optional bool calibrated = 5;</code>
       */
      public Builder setCalibrated(boolean value) {
        bitField0_ |= 0x00000010;
        calibrated_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool calibrated = 5;</code>
       */
      public Builder clearCalibrated() {
        bitField0_ = (bitField0_ & ~0x00000010);
        calibrated_ = false;
        onChanged();
        return this;
      }

      private boolean upright_ ;
      /**
       * <code>optional bool upright = 6;</code>
       */
      public boolean hasUpright() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional bool upright = 6;</code>
       */
      public boolean getUpright() {
        return upright_;
      }
      /**
       * <code>optional bool upright = 6;</code>
       */
      public Builder setUpright(boolean value) {
        bitField0_ |= 0x00000020;
        upright_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool upright = 6;</code>
       */
      public Builder clearUpright() {
        bitField0_ = (bitField0_ & ~0x00000020);
        upright_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:messages.MotionStatus)
    }

    static {
      defaultInstance = new MotionStatus(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:messages.MotionStatus)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_MotionStatus_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_messages_MotionStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022MotionStatus.proto\022\010messages\"\215\001\n\014Motio" +
      "nStatus\022\020\n\010standing\030\001 \001(\010\022\026\n\016body_is_act" +
      "ive\030\002 \001(\010\022\026\n\016walk_is_active\030\003 \001(\010\022\026\n\016hea" +
      "d_is_active\030\004 \001(\010\022\022\n\ncalibrated\030\005 \001(\010\022\017\n" +
      "\007upright\030\006 \001(\010"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_messages_MotionStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_messages_MotionStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_messages_MotionStatus_descriptor,
        new java.lang.String[] { "Standing", "BodyIsActive", "WalkIsActive", "HeadIsActive", "Calibrated", "Upright", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
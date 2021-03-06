// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JarInfo.proto

package com.t2r.common.models.refactorings;

public final class JarInfoOuterClass {
  private JarInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JarInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JarInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string artifactID = 1;</code>
     * @return The artifactID.
     */
    java.lang.String getArtifactID();
    /**
     * <code>string artifactID = 1;</code>
     * @return The bytes for artifactID.
     */
    com.google.protobuf.ByteString
        getArtifactIDBytes();

    /**
     * <code>string groupID = 3;</code>
     * @return The groupID.
     */
    java.lang.String getGroupID();
    /**
     * <code>string groupID = 3;</code>
     * @return The bytes for groupID.
     */
    com.google.protobuf.ByteString
        getGroupIDBytes();

    /**
     * <code>string version = 2;</code>
     * @return The version.
     */
    java.lang.String getVersion();
    /**
     * <code>string version = 2;</code>
     * @return The bytes for version.
     */
    com.google.protobuf.ByteString
        getVersionBytes();
  }
  /**
   * Protobuf type {@code JarInfo}
   */
  public  static final class JarInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JarInfo)
      JarInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JarInfo.newBuilder() to construct.
    private JarInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JarInfo() {
      artifactID_ = "";
      groupID_ = "";
      version_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JarInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private JarInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              artifactID_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              version_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              groupID_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.t2r.common.models.refactorings.JarInfoOuterClass.internal_static_JarInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.t2r.common.models.refactorings.JarInfoOuterClass.internal_static_JarInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo.class, com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo.Builder.class);
    }

    public static final int ARTIFACTID_FIELD_NUMBER = 1;
    private volatile java.lang.Object artifactID_;
    /**
     * <code>string artifactID = 1;</code>
     * @return The artifactID.
     */
    public java.lang.String getArtifactID() {
      java.lang.Object ref = artifactID_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        artifactID_ = s;
        return s;
      }
    }
    /**
     * <code>string artifactID = 1;</code>
     * @return The bytes for artifactID.
     */
    public com.google.protobuf.ByteString
        getArtifactIDBytes() {
      java.lang.Object ref = artifactID_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        artifactID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GROUPID_FIELD_NUMBER = 3;
    private volatile java.lang.Object groupID_;
    /**
     * <code>string groupID = 3;</code>
     * @return The groupID.
     */
    public java.lang.String getGroupID() {
      java.lang.Object ref = groupID_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        groupID_ = s;
        return s;
      }
    }
    /**
     * <code>string groupID = 3;</code>
     * @return The bytes for groupID.
     */
    public com.google.protobuf.ByteString
        getGroupIDBytes() {
      java.lang.Object ref = groupID_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VERSION_FIELD_NUMBER = 2;
    private volatile java.lang.Object version_;
    /**
     * <code>string version = 2;</code>
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      }
    }
    /**
     * <code>string version = 2;</code>
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getArtifactIDBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, artifactID_);
      }
      if (!getVersionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
      }
      if (!getGroupIDBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, groupID_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getArtifactIDBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, artifactID_);
      }
      if (!getVersionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
      }
      if (!getGroupIDBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, groupID_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo)) {
        return super.equals(obj);
      }
      com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo other = (com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo) obj;

      if (!getArtifactID()
          .equals(other.getArtifactID())) return false;
      if (!getGroupID()
          .equals(other.getGroupID())) return false;
      if (!getVersion()
          .equals(other.getVersion())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ARTIFACTID_FIELD_NUMBER;
      hash = (53 * hash) + getArtifactID().hashCode();
      hash = (37 * hash) + GROUPID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupID().hashCode();
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code JarInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JarInfo)
        com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.t2r.common.models.refactorings.JarInfoOuterClass.internal_static_JarInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.t2r.common.models.refactorings.JarInfoOuterClass.internal_static_JarInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo.class, com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo.Builder.class);
      }

      // Construct using com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        artifactID_ = "";

        groupID_ = "";

        version_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.t2r.common.models.refactorings.JarInfoOuterClass.internal_static_JarInfo_descriptor;
      }

      @java.lang.Override
      public com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo getDefaultInstanceForType() {
        return com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo.getDefaultInstance();
      }

      @java.lang.Override
      public com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo build() {
        com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo buildPartial() {
        com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo result = new com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo(this);
        result.artifactID_ = artifactID_;
        result.groupID_ = groupID_;
        result.version_ = version_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo) {
          return mergeFrom((com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo other) {
        if (other == com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo.getDefaultInstance()) return this;
        if (!other.getArtifactID().isEmpty()) {
          artifactID_ = other.artifactID_;
          onChanged();
        }
        if (!other.getGroupID().isEmpty()) {
          groupID_ = other.groupID_;
          onChanged();
        }
        if (!other.getVersion().isEmpty()) {
          version_ = other.version_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object artifactID_ = "";
      /**
       * <code>string artifactID = 1;</code>
       * @return The artifactID.
       */
      public java.lang.String getArtifactID() {
        java.lang.Object ref = artifactID_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          artifactID_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string artifactID = 1;</code>
       * @return The bytes for artifactID.
       */
      public com.google.protobuf.ByteString
          getArtifactIDBytes() {
        java.lang.Object ref = artifactID_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          artifactID_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string artifactID = 1;</code>
       * @param value The artifactID to set.
       * @return This builder for chaining.
       */
      public Builder setArtifactID(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        artifactID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string artifactID = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearArtifactID() {
        
        artifactID_ = getDefaultInstance().getArtifactID();
        onChanged();
        return this;
      }
      /**
       * <code>string artifactID = 1;</code>
       * @param value The bytes for artifactID to set.
       * @return This builder for chaining.
       */
      public Builder setArtifactIDBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        artifactID_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object groupID_ = "";
      /**
       * <code>string groupID = 3;</code>
       * @return The groupID.
       */
      public java.lang.String getGroupID() {
        java.lang.Object ref = groupID_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          groupID_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string groupID = 3;</code>
       * @return The bytes for groupID.
       */
      public com.google.protobuf.ByteString
          getGroupIDBytes() {
        java.lang.Object ref = groupID_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          groupID_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string groupID = 3;</code>
       * @param value The groupID to set.
       * @return This builder for chaining.
       */
      public Builder setGroupID(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        groupID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string groupID = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupID() {
        
        groupID_ = getDefaultInstance().getGroupID();
        onChanged();
        return this;
      }
      /**
       * <code>string groupID = 3;</code>
       * @param value The bytes for groupID to set.
       * @return This builder for chaining.
       */
      public Builder setGroupIDBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        groupID_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object version_ = "";
      /**
       * <code>string version = 2;</code>
       * @return The version.
       */
      public java.lang.String getVersion() {
        java.lang.Object ref = version_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          version_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string version = 2;</code>
       * @return The bytes for version.
       */
      public com.google.protobuf.ByteString
          getVersionBytes() {
        java.lang.Object ref = version_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          version_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string version = 2;</code>
       * @param value The version to set.
       * @return This builder for chaining.
       */
      public Builder setVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        version_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string version = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearVersion() {
        
        version_ = getDefaultInstance().getVersion();
        onChanged();
        return this;
      }
      /**
       * <code>string version = 2;</code>
       * @param value The bytes for version to set.
       * @return This builder for chaining.
       */
      public Builder setVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        version_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:JarInfo)
    }

    // @@protoc_insertion_point(class_scope:JarInfo)
    private static final com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo();
    }

    public static com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JarInfo>
        PARSER = new com.google.protobuf.AbstractParser<JarInfo>() {
      @java.lang.Override
      public JarInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JarInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<JarInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JarInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.t2r.common.models.refactorings.JarInfoOuterClass.JarInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JarInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JarInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rJarInfo.proto\"?\n\007JarInfo\022\022\n\nartifactID" +
      "\030\001 \001(\t\022\017\n\007groupID\030\003 \001(\t\022\017\n\007version\030\002 \001(\t" +
      "B$\n\"com.t2r.common.models.refactoringsb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_JarInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JarInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JarInfo_descriptor,
        new java.lang.String[] { "ArtifactID", "GroupID", "Version", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

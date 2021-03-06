// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FileDiff.proto

package com.t2r.common.models.refactorings;

public final class FileDiffOuterClass {
  private FileDiffOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FileDiffOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FileDiff)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 filesModified = 1;</code>
     * @return The filesModified.
     */
    long getFilesModified();

    /**
     * <code>int64 filesAdded = 2;</code>
     * @return The filesAdded.
     */
    long getFilesAdded();

    /**
     * <code>int64 filesRemoved = 3;</code>
     * @return The filesRemoved.
     */
    long getFilesRemoved();

    /**
     * <code>int64 filesRenamed = 4;</code>
     * @return The filesRenamed.
     */
    long getFilesRenamed();
  }
  /**
   * Protobuf type {@code FileDiff}
   */
  public  static final class FileDiff extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FileDiff)
      FileDiffOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FileDiff.newBuilder() to construct.
    private FileDiff(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FileDiff() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FileDiff();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FileDiff(
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
            case 8: {

              filesModified_ = input.readInt64();
              break;
            }
            case 16: {

              filesAdded_ = input.readInt64();
              break;
            }
            case 24: {

              filesRemoved_ = input.readInt64();
              break;
            }
            case 32: {

              filesRenamed_ = input.readInt64();
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
      return com.t2r.common.models.refactorings.FileDiffOuterClass.internal_static_FileDiff_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.t2r.common.models.refactorings.FileDiffOuterClass.internal_static_FileDiff_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff.class, com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff.Builder.class);
    }

    public static final int FILESMODIFIED_FIELD_NUMBER = 1;
    private long filesModified_;
    /**
     * <code>int64 filesModified = 1;</code>
     * @return The filesModified.
     */
    public long getFilesModified() {
      return filesModified_;
    }

    public static final int FILESADDED_FIELD_NUMBER = 2;
    private long filesAdded_;
    /**
     * <code>int64 filesAdded = 2;</code>
     * @return The filesAdded.
     */
    public long getFilesAdded() {
      return filesAdded_;
    }

    public static final int FILESREMOVED_FIELD_NUMBER = 3;
    private long filesRemoved_;
    /**
     * <code>int64 filesRemoved = 3;</code>
     * @return The filesRemoved.
     */
    public long getFilesRemoved() {
      return filesRemoved_;
    }

    public static final int FILESRENAMED_FIELD_NUMBER = 4;
    private long filesRenamed_;
    /**
     * <code>int64 filesRenamed = 4;</code>
     * @return The filesRenamed.
     */
    public long getFilesRenamed() {
      return filesRenamed_;
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
      if (filesModified_ != 0L) {
        output.writeInt64(1, filesModified_);
      }
      if (filesAdded_ != 0L) {
        output.writeInt64(2, filesAdded_);
      }
      if (filesRemoved_ != 0L) {
        output.writeInt64(3, filesRemoved_);
      }
      if (filesRenamed_ != 0L) {
        output.writeInt64(4, filesRenamed_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (filesModified_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, filesModified_);
      }
      if (filesAdded_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, filesAdded_);
      }
      if (filesRemoved_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, filesRemoved_);
      }
      if (filesRenamed_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, filesRenamed_);
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
      if (!(obj instanceof com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff)) {
        return super.equals(obj);
      }
      com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff other = (com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff) obj;

      if (getFilesModified()
          != other.getFilesModified()) return false;
      if (getFilesAdded()
          != other.getFilesAdded()) return false;
      if (getFilesRemoved()
          != other.getFilesRemoved()) return false;
      if (getFilesRenamed()
          != other.getFilesRenamed()) return false;
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
      hash = (37 * hash) + FILESMODIFIED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getFilesModified());
      hash = (37 * hash) + FILESADDED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getFilesAdded());
      hash = (37 * hash) + FILESREMOVED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getFilesRemoved());
      hash = (37 * hash) + FILESRENAMED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getFilesRenamed());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff parseFrom(
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
    public static Builder newBuilder(com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff prototype) {
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
     * Protobuf type {@code FileDiff}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FileDiff)
        com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiffOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.t2r.common.models.refactorings.FileDiffOuterClass.internal_static_FileDiff_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.t2r.common.models.refactorings.FileDiffOuterClass.internal_static_FileDiff_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff.class, com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff.Builder.class);
      }

      // Construct using com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff.newBuilder()
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
        filesModified_ = 0L;

        filesAdded_ = 0L;

        filesRemoved_ = 0L;

        filesRenamed_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.t2r.common.models.refactorings.FileDiffOuterClass.internal_static_FileDiff_descriptor;
      }

      @java.lang.Override
      public com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff getDefaultInstanceForType() {
        return com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff.getDefaultInstance();
      }

      @java.lang.Override
      public com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff build() {
        com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff buildPartial() {
        com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff result = new com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff(this);
        result.filesModified_ = filesModified_;
        result.filesAdded_ = filesAdded_;
        result.filesRemoved_ = filesRemoved_;
        result.filesRenamed_ = filesRenamed_;
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
        if (other instanceof com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff) {
          return mergeFrom((com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff other) {
        if (other == com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff.getDefaultInstance()) return this;
        if (other.getFilesModified() != 0L) {
          setFilesModified(other.getFilesModified());
        }
        if (other.getFilesAdded() != 0L) {
          setFilesAdded(other.getFilesAdded());
        }
        if (other.getFilesRemoved() != 0L) {
          setFilesRemoved(other.getFilesRemoved());
        }
        if (other.getFilesRenamed() != 0L) {
          setFilesRenamed(other.getFilesRenamed());
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
        com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long filesModified_ ;
      /**
       * <code>int64 filesModified = 1;</code>
       * @return The filesModified.
       */
      public long getFilesModified() {
        return filesModified_;
      }
      /**
       * <code>int64 filesModified = 1;</code>
       * @param value The filesModified to set.
       * @return This builder for chaining.
       */
      public Builder setFilesModified(long value) {
        
        filesModified_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 filesModified = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFilesModified() {
        
        filesModified_ = 0L;
        onChanged();
        return this;
      }

      private long filesAdded_ ;
      /**
       * <code>int64 filesAdded = 2;</code>
       * @return The filesAdded.
       */
      public long getFilesAdded() {
        return filesAdded_;
      }
      /**
       * <code>int64 filesAdded = 2;</code>
       * @param value The filesAdded to set.
       * @return This builder for chaining.
       */
      public Builder setFilesAdded(long value) {
        
        filesAdded_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 filesAdded = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFilesAdded() {
        
        filesAdded_ = 0L;
        onChanged();
        return this;
      }

      private long filesRemoved_ ;
      /**
       * <code>int64 filesRemoved = 3;</code>
       * @return The filesRemoved.
       */
      public long getFilesRemoved() {
        return filesRemoved_;
      }
      /**
       * <code>int64 filesRemoved = 3;</code>
       * @param value The filesRemoved to set.
       * @return This builder for chaining.
       */
      public Builder setFilesRemoved(long value) {
        
        filesRemoved_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 filesRemoved = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearFilesRemoved() {
        
        filesRemoved_ = 0L;
        onChanged();
        return this;
      }

      private long filesRenamed_ ;
      /**
       * <code>int64 filesRenamed = 4;</code>
       * @return The filesRenamed.
       */
      public long getFilesRenamed() {
        return filesRenamed_;
      }
      /**
       * <code>int64 filesRenamed = 4;</code>
       * @param value The filesRenamed to set.
       * @return This builder for chaining.
       */
      public Builder setFilesRenamed(long value) {
        
        filesRenamed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 filesRenamed = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearFilesRenamed() {
        
        filesRenamed_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:FileDiff)
    }

    // @@protoc_insertion_point(class_scope:FileDiff)
    private static final com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff();
    }

    public static com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FileDiff>
        PARSER = new com.google.protobuf.AbstractParser<FileDiff>() {
      @java.lang.Override
      public FileDiff parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FileDiff(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FileDiff> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FileDiff> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.t2r.common.models.refactorings.FileDiffOuterClass.FileDiff getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FileDiff_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FileDiff_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016FileDiff.proto\"a\n\010FileDiff\022\025\n\rfilesMod" +
      "ified\030\001 \001(\003\022\022\n\nfilesAdded\030\002 \001(\003\022\024\n\014files" +
      "Removed\030\003 \001(\003\022\024\n\014filesRenamed\030\004 \001(\003B$\n\"c" +
      "om.t2r.common.models.refactoringsb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FileDiff_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FileDiff_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FileDiff_descriptor,
        new java.lang.String[] { "FilesModified", "FilesAdded", "FilesRemoved", "FilesRenamed", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TypeGraph.proto

package com.t2r.common.models.ast;

public final class TypeGraphOuterClass {
  private TypeGraphOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TypeGraphOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Models.TypeGraph)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .Models.TypeNode root = 1;</code>
     * @return Whether the root field is set.
     */
    boolean hasRoot();
    /**
     * <code>required .Models.TypeNode root = 1;</code>
     * @return The root.
     */
    com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode getRoot();
    /**
     * <code>required .Models.TypeNode root = 1;</code>
     */
    com.t2r.common.models.ast.TypeNodeOuterClass.TypeNodeOrBuilder getRootOrBuilder();

    /**
     * <code>map&lt;string, .Models.TypeGraph&gt; edges = 2;</code>
     */
    int getEdgesCount();
    /**
     * <code>map&lt;string, .Models.TypeGraph&gt; edges = 2;</code>
     */
    boolean containsEdges(
        java.lang.String key);
    /**
     * Use {@link #getEdgesMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph>
    getEdges();
    /**
     * <code>map&lt;string, .Models.TypeGraph&gt; edges = 2;</code>
     */
    java.util.Map<java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph>
    getEdgesMap();
    /**
     * <code>map&lt;string, .Models.TypeGraph&gt; edges = 2;</code>
     */

    com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph getEdgesOrDefault(
        java.lang.String key,
        com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph defaultValue);
    /**
     * <code>map&lt;string, .Models.TypeGraph&gt; edges = 2;</code>
     */

    com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph getEdgesOrThrow(
        java.lang.String key);
  }
  /**
   * Protobuf type {@code Models.TypeGraph}
   */
  public  static final class TypeGraph extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Models.TypeGraph)
      TypeGraphOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TypeGraph.newBuilder() to construct.
    private TypeGraph(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TypeGraph() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TypeGraph();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TypeGraph(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 10: {
              com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = root_.toBuilder();
              }
              root_ = input.readMessage(com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(root_);
                root_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                edges_ = com.google.protobuf.MapField.newMapField(
                    EdgesDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000002;
              }
              com.google.protobuf.MapEntry<java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph>
              edges__ = input.readMessage(
                  EdgesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              edges_.getMutableMap().put(
                  edges__.getKey(), edges__.getValue());
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
      return com.t2r.common.models.ast.TypeGraphOuterClass.internal_static_Models_TypeGraph_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetEdges();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.t2r.common.models.ast.TypeGraphOuterClass.internal_static_Models_TypeGraph_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph.class, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph.Builder.class);
    }

    private int bitField0_;
    public static final int ROOT_FIELD_NUMBER = 1;
    private com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode root_;
    /**
     * <code>required .Models.TypeNode root = 1;</code>
     * @return Whether the root field is set.
     */
    public boolean hasRoot() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .Models.TypeNode root = 1;</code>
     * @return The root.
     */
    public com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode getRoot() {
      return root_ == null ? com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode.getDefaultInstance() : root_;
    }
    /**
     * <code>required .Models.TypeNode root = 1;</code>
     */
    public com.t2r.common.models.ast.TypeNodeOuterClass.TypeNodeOrBuilder getRootOrBuilder() {
      return root_ == null ? com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode.getDefaultInstance() : root_;
    }

    public static final int EDGES_FIELD_NUMBER = 2;
    private static final class EdgesDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph>newDefaultInstance(
                  com.t2r.common.models.ast.TypeGraphOuterClass.internal_static_Models_TypeGraph_EdgesEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "",
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph> edges_;
    private com.google.protobuf.MapField<java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph>
    internalGetEdges() {
      if (edges_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            EdgesDefaultEntryHolder.defaultEntry);
      }
      return edges_;
    }

    public int getEdgesCount() {
      return internalGetEdges().getMap().size();
    }
    /**
     * <code>map&lt;string, .Models.TypeGraph&gt; edges = 2;</code>
     */

    public boolean containsEdges(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetEdges().getMap().containsKey(key);
    }
    /**
     * Use {@link #getEdgesMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph> getEdges() {
      return getEdgesMap();
    }
    /**
     * <code>map&lt;string, .Models.TypeGraph&gt; edges = 2;</code>
     */

    public java.util.Map<java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph> getEdgesMap() {
      return internalGetEdges().getMap();
    }
    /**
     * <code>map&lt;string, .Models.TypeGraph&gt; edges = 2;</code>
     */

    public com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph getEdgesOrDefault(
        java.lang.String key,
        com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph> map =
          internalGetEdges().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .Models.TypeGraph&gt; edges = 2;</code>
     */

    public com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph getEdgesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph> map =
          internalGetEdges().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasRoot()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getRoot().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph item : getEdgesMap().values()) {
        if (!item.isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getRoot());
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeStringMapTo(
          output,
          internalGetEdges(),
          EdgesDefaultEntryHolder.defaultEntry,
          2);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getRoot());
      }
      for (java.util.Map.Entry<java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph> entry
           : internalGetEdges().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph>
        edges__ = EdgesDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(2, edges__);
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
      if (!(obj instanceof com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph)) {
        return super.equals(obj);
      }
      com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph other = (com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph) obj;

      if (hasRoot() != other.hasRoot()) return false;
      if (hasRoot()) {
        if (!getRoot()
            .equals(other.getRoot())) return false;
      }
      if (!internalGetEdges().equals(
          other.internalGetEdges())) return false;
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
      if (hasRoot()) {
        hash = (37 * hash) + ROOT_FIELD_NUMBER;
        hash = (53 * hash) + getRoot().hashCode();
      }
      if (!internalGetEdges().getMap().isEmpty()) {
        hash = (37 * hash) + EDGES_FIELD_NUMBER;
        hash = (53 * hash) + internalGetEdges().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph parseFrom(
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
    public static Builder newBuilder(com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph prototype) {
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
     * Protobuf type {@code Models.TypeGraph}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Models.TypeGraph)
        com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraphOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.t2r.common.models.ast.TypeGraphOuterClass.internal_static_Models_TypeGraph_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetEdges();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetMutableEdges();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.t2r.common.models.ast.TypeGraphOuterClass.internal_static_Models_TypeGraph_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph.class, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph.Builder.class);
      }

      // Construct using com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph.newBuilder()
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
          getRootFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (rootBuilder_ == null) {
          root_ = null;
        } else {
          rootBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        internalGetMutableEdges().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.t2r.common.models.ast.TypeGraphOuterClass.internal_static_Models_TypeGraph_descriptor;
      }

      @java.lang.Override
      public com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph getDefaultInstanceForType() {
        return com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph.getDefaultInstance();
      }

      @java.lang.Override
      public com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph build() {
        com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph buildPartial() {
        com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph result = new com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (rootBuilder_ == null) {
            result.root_ = root_;
          } else {
            result.root_ = rootBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
        }
        result.edges_ = internalGetEdges();
        result.edges_.makeImmutable();
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph) {
          return mergeFrom((com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph other) {
        if (other == com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph.getDefaultInstance()) return this;
        if (other.hasRoot()) {
          mergeRoot(other.getRoot());
        }
        internalGetMutableEdges().mergeFrom(
            other.internalGetEdges());
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasRoot()) {
          return false;
        }
        if (!getRoot().isInitialized()) {
          return false;
        }
        for (com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph item : getEdgesMap().values()) {
          if (!item.isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode root_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode, com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode.Builder, com.t2r.common.models.ast.TypeNodeOuterClass.TypeNodeOrBuilder> rootBuilder_;
      /**
       * <code>required .Models.TypeNode root = 1;</code>
       * @return Whether the root field is set.
       */
      public boolean hasRoot() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .Models.TypeNode root = 1;</code>
       * @return The root.
       */
      public com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode getRoot() {
        if (rootBuilder_ == null) {
          return root_ == null ? com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode.getDefaultInstance() : root_;
        } else {
          return rootBuilder_.getMessage();
        }
      }
      /**
       * <code>required .Models.TypeNode root = 1;</code>
       */
      public Builder setRoot(com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode value) {
        if (rootBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          root_ = value;
          onChanged();
        } else {
          rootBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .Models.TypeNode root = 1;</code>
       */
      public Builder setRoot(
          com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode.Builder builderForValue) {
        if (rootBuilder_ == null) {
          root_ = builderForValue.build();
          onChanged();
        } else {
          rootBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .Models.TypeNode root = 1;</code>
       */
      public Builder mergeRoot(com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode value) {
        if (rootBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              root_ != null &&
              root_ != com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode.getDefaultInstance()) {
            root_ =
              com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode.newBuilder(root_).mergeFrom(value).buildPartial();
          } else {
            root_ = value;
          }
          onChanged();
        } else {
          rootBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .Models.TypeNode root = 1;</code>
       */
      public Builder clearRoot() {
        if (rootBuilder_ == null) {
          root_ = null;
          onChanged();
        } else {
          rootBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .Models.TypeNode root = 1;</code>
       */
      public com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode.Builder getRootBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getRootFieldBuilder().getBuilder();
      }
      /**
       * <code>required .Models.TypeNode root = 1;</code>
       */
      public com.t2r.common.models.ast.TypeNodeOuterClass.TypeNodeOrBuilder getRootOrBuilder() {
        if (rootBuilder_ != null) {
          return rootBuilder_.getMessageOrBuilder();
        } else {
          return root_ == null ?
              com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode.getDefaultInstance() : root_;
        }
      }
      /**
       * <code>required .Models.TypeNode root = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode, com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode.Builder, com.t2r.common.models.ast.TypeNodeOuterClass.TypeNodeOrBuilder> 
          getRootFieldBuilder() {
        if (rootBuilder_ == null) {
          rootBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode, com.t2r.common.models.ast.TypeNodeOuterClass.TypeNode.Builder, com.t2r.common.models.ast.TypeNodeOuterClass.TypeNodeOrBuilder>(
                  getRoot(),
                  getParentForChildren(),
                  isClean());
          root_ = null;
        }
        return rootBuilder_;
      }

      private com.google.protobuf.MapField<
          java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph> edges_;
      private com.google.protobuf.MapField<java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph>
      internalGetEdges() {
        if (edges_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              EdgesDefaultEntryHolder.defaultEntry);
        }
        return edges_;
      }
      private com.google.protobuf.MapField<java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph>
      internalGetMutableEdges() {
        onChanged();;
        if (edges_ == null) {
          edges_ = com.google.protobuf.MapField.newMapField(
              EdgesDefaultEntryHolder.defaultEntry);
        }
        if (!edges_.isMutable()) {
          edges_ = edges_.copy();
        }
        return edges_;
      }

      public int getEdgesCount() {
        return internalGetEdges().getMap().size();
      }
      /**
       * <code>map&lt;string, .Models.TypeGraph&gt; edges = 2;</code>
       */

      public boolean containsEdges(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        return internalGetEdges().getMap().containsKey(key);
      }
      /**
       * Use {@link #getEdgesMap()} instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph> getEdges() {
        return getEdgesMap();
      }
      /**
       * <code>map&lt;string, .Models.TypeGraph&gt; edges = 2;</code>
       */

      public java.util.Map<java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph> getEdgesMap() {
        return internalGetEdges().getMap();
      }
      /**
       * <code>map&lt;string, .Models.TypeGraph&gt; edges = 2;</code>
       */

      public com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph getEdgesOrDefault(
          java.lang.String key,
          com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph defaultValue) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph> map =
            internalGetEdges().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;string, .Models.TypeGraph&gt; edges = 2;</code>
       */

      public com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph getEdgesOrThrow(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph> map =
            internalGetEdges().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearEdges() {
        internalGetMutableEdges().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;string, .Models.TypeGraph&gt; edges = 2;</code>
       */

      public Builder removeEdges(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableEdges().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph>
      getMutableEdges() {
        return internalGetMutableEdges().getMutableMap();
      }
      /**
       * <code>map&lt;string, .Models.TypeGraph&gt; edges = 2;</code>
       */
      public Builder putEdges(
          java.lang.String key,
          com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph value) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableEdges().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;string, .Models.TypeGraph&gt; edges = 2;</code>
       */

      public Builder putAllEdges(
          java.util.Map<java.lang.String, com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph> values) {
        internalGetMutableEdges().getMutableMap()
            .putAll(values);
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


      // @@protoc_insertion_point(builder_scope:Models.TypeGraph)
    }

    // @@protoc_insertion_point(class_scope:Models.TypeGraph)
    private static final com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph();
    }

    public static com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<TypeGraph>
        PARSER = new com.google.protobuf.AbstractParser<TypeGraph>() {
      @java.lang.Override
      public TypeGraph parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TypeGraph(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TypeGraph> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TypeGraph> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.t2r.common.models.ast.TypeGraphOuterClass.TypeGraph getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Models_TypeGraph_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Models_TypeGraph_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Models_TypeGraph_EdgesEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Models_TypeGraph_EdgesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017TypeGraph.proto\022\006Models\032\016TypeNode.prot" +
      "o\"\231\001\n\tTypeGraph\022\036\n\004root\030\001 \002(\0132\020.Models.T" +
      "ypeNode\022+\n\005edges\030\002 \003(\0132\034.Models.TypeGrap" +
      "h.EdgesEntry\032?\n\nEdgesEntry\022\013\n\003key\030\001 \001(\t\022" +
      " \n\005value\030\002 \001(\0132\021.Models.TypeGraph:\0028\001B\033\n" +
      "\031com.t2r.common.models.ast"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.t2r.common.models.ast.TypeNodeOuterClass.getDescriptor(),
        });
    internal_static_Models_TypeGraph_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Models_TypeGraph_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Models_TypeGraph_descriptor,
        new java.lang.String[] { "Root", "Edges", });
    internal_static_Models_TypeGraph_EdgesEntry_descriptor =
      internal_static_Models_TypeGraph_descriptor.getNestedTypes().get(0);
    internal_static_Models_TypeGraph_EdgesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Models_TypeGraph_EdgesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.t2r.common.models.ast.TypeNodeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
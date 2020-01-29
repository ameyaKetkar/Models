// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TypeSem.proto

package com.t2r.common.models.refactorings;

public final class TypeSemOuterClass {
  private TypeSemOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code TypeSem}
   */
  public enum TypeSem
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Object = 0;</code>
     */
    Object(0),
    /**
     * <code>Enum = 2;</code>
     */
    Enum(2),
    /**
     * <code>PrimitiveType = 3;</code>
     */
    PrimitiveType(3),
    /**
     * <code>Dont_Know = 4;</code>
     */
    Dont_Know(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>Object = 0;</code>
     */
    public static final int Object_VALUE = 0;
    /**
     * <code>Enum = 2;</code>
     */
    public static final int Enum_VALUE = 2;
    /**
     * <code>PrimitiveType = 3;</code>
     */
    public static final int PrimitiveType_VALUE = 3;
    /**
     * <code>Dont_Know = 4;</code>
     */
    public static final int Dont_Know_VALUE = 4;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeSem valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TypeSem forNumber(int value) {
      switch (value) {
        case 0: return Object;
        case 2: return Enum;
        case 3: return PrimitiveType;
        case 4: return Dont_Know;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TypeSem>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        TypeSem> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TypeSem>() {
            public TypeSem findValueByNumber(int number) {
              return TypeSem.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.t2r.common.models.refactorings.TypeSemOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final TypeSem[] VALUES = values();

    public static TypeSem valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TypeSem(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:TypeSem)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rTypeSem.proto*A\n\007TypeSem\022\n\n\006Object\020\000\022\010" +
      "\n\004Enum\020\002\022\021\n\rPrimitiveType\020\003\022\r\n\tDont_Know" +
      "\020\004B$\n\"com.t2r.common.models.refactorings" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

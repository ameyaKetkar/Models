# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: TypeSem.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='TypeSem.proto',
  package='',
  syntax='proto3',
  serialized_options=b'\n\"com.t2r.common.models.refactorings',
  serialized_pb=b'\n\rTypeSem.proto*A\n\x07TypeSem\x12\n\n\x06Object\x10\x00\x12\x08\n\x04\x45num\x10\x02\x12\x11\n\rPrimitiveType\x10\x03\x12\r\n\tDont_Know\x10\x04\x42$\n\"com.t2r.common.models.refactoringsb\x06proto3'
)

_TYPESEM = _descriptor.EnumDescriptor(
  name='TypeSem',
  full_name='TypeSem',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='Object', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='Enum', index=1, number=2,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='PrimitiveType', index=2, number=3,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='Dont_Know', index=3, number=4,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=17,
  serialized_end=82,
)
_sym_db.RegisterEnumDescriptor(_TYPESEM)

TypeSem = enum_type_wrapper.EnumTypeWrapper(_TYPESEM)
Object = 0
Enum = 2
PrimitiveType = 3
Dont_Know = 4


DESCRIPTOR.enum_types_by_name['TypeSem'] = _TYPESEM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)

# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ElementKind.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='ElementKind.proto',
  package='',
  syntax='proto3',
  serialized_options=b'\n\"com.t2r.common.models.refactorings',
  serialized_pb=b'\n\x11\x45lementKind.proto*F\n\x0b\x45lementKind\x12\t\n\x05\x46ield\x10\x00\x12\x11\n\rLocalVariable\x10\x02\x12\r\n\tParameter\x10\x03\x12\n\n\x06Return\x10\x04\x42$\n\"com.t2r.common.models.refactoringsb\x06proto3'
)

_ELEMENTKIND = _descriptor.EnumDescriptor(
  name='ElementKind',
  full_name='ElementKind',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='Field', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='LocalVariable', index=1, number=2,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='Parameter', index=2, number=3,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='Return', index=3, number=4,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=21,
  serialized_end=91,
)
_sym_db.RegisterEnumDescriptor(_ELEMENTKIND)

ElementKind = enum_type_wrapper.EnumTypeWrapper(_ELEMENTKIND)
Field = 0
LocalVariable = 2
Parameter = 3
Return = 4


DESCRIPTOR.enum_types_by_name['ElementKind'] = _ELEMENTKIND
_sym_db.RegisterFileDescriptor(DESCRIPTOR)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)

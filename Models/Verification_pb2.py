# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Verification.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import Models.Models.TypeGraph_pb2 as TypeGraph__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='Verification.proto',
  package='',
  syntax='proto3',
  serialized_options=b'\n\"com.t2r.common.models.refactorings',
  serialized_pb=b'\n\x12Verification.proto\x1a\x0fTypeGraph.proto\"Z\n\x0cVerification\x12\x18\n\x04type\x18\x01 \x01(\x0b\x32\n.TypeGraph\x12\x0f\n\x07project\x18\x02 \x01(\t\x12\x0f\n\x07matched\x18\x03 \x01(\x08\x12\x0e\n\x06\x66\x61iled\x18\x04 \x01(\x08\x42$\n\"com.t2r.common.models.refactoringsb\x06proto3'
  ,
  dependencies=[TypeGraph__pb2.DESCRIPTOR,])




_VERIFICATION = _descriptor.Descriptor(
  name='Verification',
  full_name='Verification',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='type', full_name='Verification.type', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='project', full_name='Verification.project', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='matched', full_name='Verification.matched', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='failed', full_name='Verification.failed', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=39,
  serialized_end=129,
)

_VERIFICATION.fields_by_name['type'].message_type = TypeGraph__pb2._TYPEGRAPH
DESCRIPTOR.message_types_by_name['Verification'] = _VERIFICATION
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Verification = _reflection.GeneratedProtocolMessageType('Verification', (_message.Message,), {
  'DESCRIPTOR' : _VERIFICATION,
  '__module__' : 'Verification_pb2'
  # @@protoc_insertion_point(class_scope:Verification)
  })
_sym_db.RegisterMessage(Verification)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)

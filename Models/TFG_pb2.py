# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: TFG.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import Identification_pb2 as Identification__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='TFG.proto',
  package='',
  syntax='proto3',
  serialized_options=b'\n\031com.t2r.common.models.ast',
  serialized_pb=b'\n\tTFG.proto\x1a\x14Identification.proto\"t\n\x03TFG\x12\x1e\n\x05nodes\x18\x01 \x03(\x0b\x32\x0f.Identification\x12\x18\n\x05\x65\x64ges\x18\x02 \x03(\x0b\x32\t.TFG.Edge\x1a\x33\n\x04\x45\x64ge\x12\x0b\n\x03\x66st\x18\x01 \x01(\x05\x12\x0b\n\x03snd\x18\x02 \x01(\x05\x12\x11\n\tedgeValue\x18\x03 \x01(\tB\x1b\n\x19\x63om.t2r.common.models.astb\x06proto3'
  ,
  dependencies=[Identification__pb2.DESCRIPTOR,])




_TFG_EDGE = _descriptor.Descriptor(
  name='Edge',
  full_name='TFG.Edge',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='fst', full_name='TFG.Edge.fst', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='snd', full_name='TFG.Edge.snd', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='edgeValue', full_name='TFG.Edge.edgeValue', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_start=100,
  serialized_end=151,
)

_TFG = _descriptor.Descriptor(
  name='TFG',
  full_name='TFG',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='nodes', full_name='TFG.nodes', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='edges', full_name='TFG.edges', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[_TFG_EDGE, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=35,
  serialized_end=151,
)

_TFG_EDGE.containing_type = _TFG
_TFG.fields_by_name['nodes'].message_type = Identification__pb2._IDENTIFICATION
_TFG.fields_by_name['edges'].message_type = _TFG_EDGE
DESCRIPTOR.message_types_by_name['TFG'] = _TFG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TFG = _reflection.GeneratedProtocolMessageType('TFG', (_message.Message,), {

  'Edge' : _reflection.GeneratedProtocolMessageType('Edge', (_message.Message,), {
    'DESCRIPTOR' : _TFG_EDGE,
    '__module__' : 'TFG_pb2'
    # @@protoc_insertion_point(class_scope:TFG.Edge)
    })
  ,
  'DESCRIPTOR' : _TFG,
  '__module__' : 'TFG_pb2'
  # @@protoc_insertion_point(class_scope:TFG)
  })
_sym_db.RegisterMessage(TFG)
_sym_db.RegisterMessage(TFG.Edge)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
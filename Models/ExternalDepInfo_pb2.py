# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ExternalDepInfo.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='ExternalDepInfo.proto',
  package='',
  syntax='proto3',
  serialized_options=b'\n\"com.t2r.common.models.refactorings',
  serialized_pb=b'\n\x15\x45xternalDepInfo.proto\"\x83\x03\n\x0f\x45xternalDepInfo\x12)\n\x05\x65nums\x18\x03 \x01(\x0b\x32\x1a.ExternalDepInfo.TypeNames\x12@\n\x10hierarchicalInfo\x18\x01 \x03(\x0b\x32&.ExternalDepInfo.HierarchicalInfoEntry\x12>\n\x0f\x63ompositionInfo\x18\x02 \x03(\x0b\x32%.ExternalDepInfo.CompositionInfoEntry\x1aS\n\x15HierarchicalInfoEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12)\n\x05value\x18\x02 \x01(\x0b\x32\x1a.ExternalDepInfo.TypeNames:\x02\x38\x01\x1aR\n\x14\x43ompositionInfoEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12)\n\x05value\x18\x02 \x01(\x0b\x32\x1a.ExternalDepInfo.TypeNames:\x02\x38\x01\x1a\x1a\n\tTypeNames\x12\r\n\x05names\x18\x01 \x03(\tB$\n\"com.t2r.common.models.refactoringsb\x06proto3'
)




_EXTERNALDEPINFO_HIERARCHICALINFOENTRY = _descriptor.Descriptor(
  name='HierarchicalInfoEntry',
  full_name='ExternalDepInfo.HierarchicalInfoEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='ExternalDepInfo.HierarchicalInfoEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='value', full_name='ExternalDepInfo.HierarchicalInfoEntry.value', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=218,
  serialized_end=301,
)

_EXTERNALDEPINFO_COMPOSITIONINFOENTRY = _descriptor.Descriptor(
  name='CompositionInfoEntry',
  full_name='ExternalDepInfo.CompositionInfoEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='ExternalDepInfo.CompositionInfoEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='value', full_name='ExternalDepInfo.CompositionInfoEntry.value', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=303,
  serialized_end=385,
)

_EXTERNALDEPINFO_TYPENAMES = _descriptor.Descriptor(
  name='TypeNames',
  full_name='ExternalDepInfo.TypeNames',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='names', full_name='ExternalDepInfo.TypeNames.names', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=387,
  serialized_end=413,
)

_EXTERNALDEPINFO = _descriptor.Descriptor(
  name='ExternalDepInfo',
  full_name='ExternalDepInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='enums', full_name='ExternalDepInfo.enums', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='hierarchicalInfo', full_name='ExternalDepInfo.hierarchicalInfo', index=1,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='compositionInfo', full_name='ExternalDepInfo.compositionInfo', index=2,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[_EXTERNALDEPINFO_HIERARCHICALINFOENTRY, _EXTERNALDEPINFO_COMPOSITIONINFOENTRY, _EXTERNALDEPINFO_TYPENAMES, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=26,
  serialized_end=413,
)

_EXTERNALDEPINFO_HIERARCHICALINFOENTRY.fields_by_name['value'].message_type = _EXTERNALDEPINFO_TYPENAMES
_EXTERNALDEPINFO_HIERARCHICALINFOENTRY.containing_type = _EXTERNALDEPINFO
_EXTERNALDEPINFO_COMPOSITIONINFOENTRY.fields_by_name['value'].message_type = _EXTERNALDEPINFO_TYPENAMES
_EXTERNALDEPINFO_COMPOSITIONINFOENTRY.containing_type = _EXTERNALDEPINFO
_EXTERNALDEPINFO_TYPENAMES.containing_type = _EXTERNALDEPINFO
_EXTERNALDEPINFO.fields_by_name['enums'].message_type = _EXTERNALDEPINFO_TYPENAMES
_EXTERNALDEPINFO.fields_by_name['hierarchicalInfo'].message_type = _EXTERNALDEPINFO_HIERARCHICALINFOENTRY
_EXTERNALDEPINFO.fields_by_name['compositionInfo'].message_type = _EXTERNALDEPINFO_COMPOSITIONINFOENTRY
DESCRIPTOR.message_types_by_name['ExternalDepInfo'] = _EXTERNALDEPINFO
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ExternalDepInfo = _reflection.GeneratedProtocolMessageType('ExternalDepInfo', (_message.Message,), {

  'HierarchicalInfoEntry' : _reflection.GeneratedProtocolMessageType('HierarchicalInfoEntry', (_message.Message,), {
    'DESCRIPTOR' : _EXTERNALDEPINFO_HIERARCHICALINFOENTRY,
    '__module__' : 'ExternalDepInfo_pb2'
    # @@protoc_insertion_point(class_scope:ExternalDepInfo.HierarchicalInfoEntry)
    })
  ,

  'CompositionInfoEntry' : _reflection.GeneratedProtocolMessageType('CompositionInfoEntry', (_message.Message,), {
    'DESCRIPTOR' : _EXTERNALDEPINFO_COMPOSITIONINFOENTRY,
    '__module__' : 'ExternalDepInfo_pb2'
    # @@protoc_insertion_point(class_scope:ExternalDepInfo.CompositionInfoEntry)
    })
  ,

  'TypeNames' : _reflection.GeneratedProtocolMessageType('TypeNames', (_message.Message,), {
    'DESCRIPTOR' : _EXTERNALDEPINFO_TYPENAMES,
    '__module__' : 'ExternalDepInfo_pb2'
    # @@protoc_insertion_point(class_scope:ExternalDepInfo.TypeNames)
    })
  ,
  'DESCRIPTOR' : _EXTERNALDEPINFO,
  '__module__' : 'ExternalDepInfo_pb2'
  # @@protoc_insertion_point(class_scope:ExternalDepInfo)
  })
_sym_db.RegisterMessage(ExternalDepInfo)
_sym_db.RegisterMessage(ExternalDepInfo.HierarchicalInfoEntry)
_sym_db.RegisterMessage(ExternalDepInfo.CompositionInfoEntry)
_sym_db.RegisterMessage(ExternalDepInfo.TypeNames)


DESCRIPTOR._options = None
_EXTERNALDEPINFO_HIERARCHICALINFOENTRY._options = None
_EXTERNALDEPINFO_COMPOSITIONINFOENTRY._options = None
# @@protoc_insertion_point(module_scope)

# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: TypeChangeCommit.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import TypeChangeAnalysis_pb2 as TypeChangeAnalysis__pb2
import DependencyUpdate_pb2 as DependencyUpdate__pb2
import FileDiff_pb2 as FileDiff__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='TypeChangeCommit.proto',
  package='',
  syntax='proto3',
  serialized_options=b'\n\"com.t2r.common.models.refactorings',
  serialized_pb=b'\n\x16TypeChangeCommit.proto\x1a\x18TypeChangeAnalysis.proto\x1a\x16\x44\x65pendencyUpdate.proto\x1a\x0e\x46ileDiff.proto\"\x98\x04\n\x10TypeChangeCommit\x12(\n\x0btypeChanges\x18\x01 \x03(\x0b\x32\x13.TypeChangeAnalysis\x12\x0b\n\x03sha\x18\x03 \x01(\t\x12+\n\x10\x64\x65pendencyUpdate\x18\x04 \x01(\x0b\x32\x11.DependencyUpdate\x12\x39\n\x0crefactorings\x18\x05 \x03(\x0b\x32#.TypeChangeCommit.RefactoringsEntry\x12\x1b\n\x08\x66ileDiff\x18\x06 \x01(\x0b\x32\t.FileDiff\x12H\n\x16\x64\x65pendencyUpdateImpact\x18\x08 \x03(\x0b\x32(.TypeChangeCommit.DependencyUpdateImpact\x12>\n\x11migrationAnalysis\x18\t \x03(\x0b\x32#.TypeChangeCommit.MigrationAnalysis\x1a\x33\n\x11RefactoringsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\x03:\x02\x38\x01\x1aR\n\x11MigrationAnalysis\x12\x0c\n\x04type\x18\x01 \x01(\t\x12\x1a\n\x12typeMigrationLevel\x18\x02 \x01(\t\x12\x13\n\x0bisB4Removed\x18\x04 \x01(\x08\x1a\x35\n\x16\x44\x65pendencyUpdateImpact\x12\x0c\n\x04kind\x18\x01 \x01(\t\x12\r\n\x05types\x18\x02 \x03(\tB$\n\"com.t2r.common.models.refactoringsb\x06proto3'
  ,
  dependencies=[TypeChangeAnalysis__pb2.DESCRIPTOR,DependencyUpdate__pb2.DESCRIPTOR,FileDiff__pb2.DESCRIPTOR,])




_TYPECHANGECOMMIT_REFACTORINGSENTRY = _descriptor.Descriptor(
  name='RefactoringsEntry',
  full_name='TypeChangeCommit.RefactoringsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='TypeChangeCommit.RefactoringsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='value', full_name='TypeChangeCommit.RefactoringsEntry.value', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
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
  serialized_start=439,
  serialized_end=490,
)

_TYPECHANGECOMMIT_MIGRATIONANALYSIS = _descriptor.Descriptor(
  name='MigrationAnalysis',
  full_name='TypeChangeCommit.MigrationAnalysis',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='type', full_name='TypeChangeCommit.MigrationAnalysis.type', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='typeMigrationLevel', full_name='TypeChangeCommit.MigrationAnalysis.typeMigrationLevel', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='isB4Removed', full_name='TypeChangeCommit.MigrationAnalysis.isB4Removed', index=2,
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
  serialized_start=492,
  serialized_end=574,
)

_TYPECHANGECOMMIT_DEPENDENCYUPDATEIMPACT = _descriptor.Descriptor(
  name='DependencyUpdateImpact',
  full_name='TypeChangeCommit.DependencyUpdateImpact',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='kind', full_name='TypeChangeCommit.DependencyUpdateImpact.kind', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='types', full_name='TypeChangeCommit.DependencyUpdateImpact.types', index=1,
      number=2, type=9, cpp_type=9, label=3,
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
  serialized_start=576,
  serialized_end=629,
)

_TYPECHANGECOMMIT = _descriptor.Descriptor(
  name='TypeChangeCommit',
  full_name='TypeChangeCommit',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='typeChanges', full_name='TypeChangeCommit.typeChanges', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='sha', full_name='TypeChangeCommit.sha', index=1,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='dependencyUpdate', full_name='TypeChangeCommit.dependencyUpdate', index=2,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='refactorings', full_name='TypeChangeCommit.refactorings', index=3,
      number=5, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='fileDiff', full_name='TypeChangeCommit.fileDiff', index=4,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='dependencyUpdateImpact', full_name='TypeChangeCommit.dependencyUpdateImpact', index=5,
      number=8, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='migrationAnalysis', full_name='TypeChangeCommit.migrationAnalysis', index=6,
      number=9, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[_TYPECHANGECOMMIT_REFACTORINGSENTRY, _TYPECHANGECOMMIT_MIGRATIONANALYSIS, _TYPECHANGECOMMIT_DEPENDENCYUPDATEIMPACT, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=93,
  serialized_end=629,
)

_TYPECHANGECOMMIT_REFACTORINGSENTRY.containing_type = _TYPECHANGECOMMIT
_TYPECHANGECOMMIT_MIGRATIONANALYSIS.containing_type = _TYPECHANGECOMMIT
_TYPECHANGECOMMIT_DEPENDENCYUPDATEIMPACT.containing_type = _TYPECHANGECOMMIT
_TYPECHANGECOMMIT.fields_by_name['typeChanges'].message_type = TypeChangeAnalysis__pb2._TYPECHANGEANALYSIS
_TYPECHANGECOMMIT.fields_by_name['dependencyUpdate'].message_type = DependencyUpdate__pb2._DEPENDENCYUPDATE
_TYPECHANGECOMMIT.fields_by_name['refactorings'].message_type = _TYPECHANGECOMMIT_REFACTORINGSENTRY
_TYPECHANGECOMMIT.fields_by_name['fileDiff'].message_type = FileDiff__pb2._FILEDIFF
_TYPECHANGECOMMIT.fields_by_name['dependencyUpdateImpact'].message_type = _TYPECHANGECOMMIT_DEPENDENCYUPDATEIMPACT
_TYPECHANGECOMMIT.fields_by_name['migrationAnalysis'].message_type = _TYPECHANGECOMMIT_MIGRATIONANALYSIS
DESCRIPTOR.message_types_by_name['TypeChangeCommit'] = _TYPECHANGECOMMIT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TypeChangeCommit = _reflection.GeneratedProtocolMessageType('TypeChangeCommit', (_message.Message,), {

  'RefactoringsEntry' : _reflection.GeneratedProtocolMessageType('RefactoringsEntry', (_message.Message,), {
    'DESCRIPTOR' : _TYPECHANGECOMMIT_REFACTORINGSENTRY,
    '__module__' : 'TypeChangeCommit_pb2'
    # @@protoc_insertion_point(class_scope:TypeChangeCommit.RefactoringsEntry)
    })
  ,

  'MigrationAnalysis' : _reflection.GeneratedProtocolMessageType('MigrationAnalysis', (_message.Message,), {
    'DESCRIPTOR' : _TYPECHANGECOMMIT_MIGRATIONANALYSIS,
    '__module__' : 'TypeChangeCommit_pb2'
    # @@protoc_insertion_point(class_scope:TypeChangeCommit.MigrationAnalysis)
    })
  ,

  'DependencyUpdateImpact' : _reflection.GeneratedProtocolMessageType('DependencyUpdateImpact', (_message.Message,), {
    'DESCRIPTOR' : _TYPECHANGECOMMIT_DEPENDENCYUPDATEIMPACT,
    '__module__' : 'TypeChangeCommit_pb2'
    # @@protoc_insertion_point(class_scope:TypeChangeCommit.DependencyUpdateImpact)
    })
  ,
  'DESCRIPTOR' : _TYPECHANGECOMMIT,
  '__module__' : 'TypeChangeCommit_pb2'
  # @@protoc_insertion_point(class_scope:TypeChangeCommit)
  })
_sym_db.RegisterMessage(TypeChangeCommit)
_sym_db.RegisterMessage(TypeChangeCommit.RefactoringsEntry)
_sym_db.RegisterMessage(TypeChangeCommit.MigrationAnalysis)
_sym_db.RegisterMessage(TypeChangeCommit.DependencyUpdateImpact)


DESCRIPTOR._options = None
_TYPECHANGECOMMIT_REFACTORINGSENTRY._options = None
# @@protoc_insertion_point(module_scope)
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lab2_Poll.proto

package io.grpc.examples.lab2;

public final class PollServiceProto {
  private PollServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_example_lab2_PollRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_grpc_example_lab2_PollRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_example_lab2_PollResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_grpc_example_lab2_PollResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017lab2_Poll.proto\022\021grpc.example.lab2\"j\n\013" +
      "PollRequest\022\023\n\013moderatorId\030\001 \001(\t\022\020\n\010ques" +
      "tion\030\002 \001(\t\022\021\n\tstartedAt\030\003 \001(\t\022\021\n\texpired" +
      "At\030\004 \001(\t\022\016\n\006choice\030\005 \003(\t\"\032\n\014PollResponse" +
      "\022\n\n\002id\030\001 \001(\t2^\n\013PollService\022O\n\nCreatePol" +
      "l\022\036.grpc.example.lab2.PollRequest\032\037.grpc" +
      ".example.lab2.PollResponse\"\000B+\n\025io.grpc." +
      "examples.lab2B\020PollServiceProtoP\001b\006proto" +
      "3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_grpc_example_lab2_PollRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_example_lab2_PollRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_grpc_example_lab2_PollRequest_descriptor,
        new java.lang.String[] { "ModeratorId", "Question", "StartedAt", "ExpiredAt", "Choice", });
    internal_static_grpc_example_lab2_PollResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpc_example_lab2_PollResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_grpc_example_lab2_PollResponse_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

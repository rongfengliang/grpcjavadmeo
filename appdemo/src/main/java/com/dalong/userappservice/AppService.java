// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userservice.proto

package com.dalong.userappservice;

public final class AppService {
  private AppService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_userservice_MessageInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_userservice_MessageInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_userservice_MessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_userservice_MessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_userservice_UserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_userservice_UserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_userservice_PersonRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_userservice_PersonRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_userservice_PlatformRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_userservice_PlatformRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_userservice_UserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_userservice_UserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_userservice_Project_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_userservice_Project_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_userservice_AppDemo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_userservice_AppDemo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_userservice_AppDemo_ProjectsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_userservice_AppDemo_ProjectsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_userservice_MixInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_userservice_MixInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021userservice.proto\022\013userservice\"!\n\013Mess" +
      "ageInfo\022\022\n\nmessageoid\030\001 \001(\t\"6\n\017MessageRe" +
      "sponse\022\025\n\rmessageresult\030\001 \001(\t\022\014\n\004code\030\002 " +
      "\001(\t\"\035\n\013UserRequest\022\016\n\006userid\030\001 \001(\t\"!\n\rPe" +
      "rsonRequest\022\020\n\010personid\030\001 \001(\t\"%\n\017Platfor" +
      "mRequest\022\022\n\nplatformid\030\001 \001(\t\"S\n\014UserResp" +
      "onse\022\014\n\004code\030\001 \001(\005\022\017\n\007message\030\002 \001(\t\022$\n\006r" +
      "esult\030\003 \001(\0132\024.userservice.MixInfo\"F\n\007Pro" +
      "ject\022\021\n\tprojectid\030\001 \001(\t\022\023\n\013projectname\030\002" +
      " \001(\t\022\023\n\013projecttype\030\003 \001(\t\"\260\002\n\007AppDemo\0224\n" +
      "\010projects\030\004 \003(\0132\".userservice.AppDemo.Pr" +
      "ojectsEntry\022/\n\013userrequest\030\001 \001(\0132\030.users" +
      "ervice.UserRequestH\000\0223\n\rpersonrequest\030\002 " +
      "\001(\0132\032.userservice.PersonRequestH\000\0227\n\017pla" +
      "tformrequest\030\003 \001(\0132\034.userservice.Platfor" +
      "mRequestH\000\032E\n\rProjectsEntry\022\013\n\003key\030\001 \001(\t" +
      "\022#\n\005value\030\002 \001(\0132\024.userservice.Project:\0028" +
      "\001B\t\n\007Request\"e\n\007MixInfo\022\020\n\010username\030\001 \001(" +
      "\t\022\017\n\007orgname\030\002 \001(\t\022\r\n\005orgid\030\003 \001(\t\022\022\n\nent" +
      "erprise\030\004 \001(\t\022\024\n\014enterpriseid\030\005 \001(\t2\230\001\n\013" +
      "UserService\022?\n\010UserInfo\022\030.userservice.Us" +
      "erRequest\032\031.userservice.UserResponse\022H\n\014" +
      "WatchMessage\022\030.userservice.MessageInfo\032\034" +
      ".userservice.MessageResponse0\001B6\n\031com.da" +
      "long.userappserviceB\nAppServiceP\001Z\013users" +
      "erviceb\006proto3"
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
    internal_static_userservice_MessageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_userservice_MessageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_userservice_MessageInfo_descriptor,
        new java.lang.String[] { "Messageoid", });
    internal_static_userservice_MessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_userservice_MessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_userservice_MessageResponse_descriptor,
        new java.lang.String[] { "Messageresult", "Code", });
    internal_static_userservice_UserRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_userservice_UserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_userservice_UserRequest_descriptor,
        new java.lang.String[] { "Userid", });
    internal_static_userservice_PersonRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_userservice_PersonRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_userservice_PersonRequest_descriptor,
        new java.lang.String[] { "Personid", });
    internal_static_userservice_PlatformRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_userservice_PlatformRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_userservice_PlatformRequest_descriptor,
        new java.lang.String[] { "Platformid", });
    internal_static_userservice_UserResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_userservice_UserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_userservice_UserResponse_descriptor,
        new java.lang.String[] { "Code", "Message", "Result", });
    internal_static_userservice_Project_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_userservice_Project_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_userservice_Project_descriptor,
        new java.lang.String[] { "Projectid", "Projectname", "Projecttype", });
    internal_static_userservice_AppDemo_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_userservice_AppDemo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_userservice_AppDemo_descriptor,
        new java.lang.String[] { "Projects", "Userrequest", "Personrequest", "Platformrequest", "Request", });
    internal_static_userservice_AppDemo_ProjectsEntry_descriptor =
      internal_static_userservice_AppDemo_descriptor.getNestedTypes().get(0);
    internal_static_userservice_AppDemo_ProjectsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_userservice_AppDemo_ProjectsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_userservice_MixInfo_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_userservice_MixInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_userservice_MixInfo_descriptor,
        new java.lang.String[] { "Username", "Orgname", "Orgid", "Enterprise", "Enterpriseid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

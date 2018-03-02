// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userservice.proto

package com.dalong.userappservice;

/**
 * Protobuf type {@code userservice.Project}
 */
public  final class Project extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:userservice.Project)
    ProjectOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Project.newBuilder() to construct.
  private Project(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Project() {
    projectid_ = "";
    projectname_ = "";
    projecttype_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Project(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            projectid_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            projectname_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            projecttype_ = s;
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
    return com.dalong.userappservice.AppService.internal_static_userservice_Project_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dalong.userappservice.AppService.internal_static_userservice_Project_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dalong.userappservice.Project.class, com.dalong.userappservice.Project.Builder.class);
  }

  public static final int PROJECTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object projectid_;
  /**
   * <code>string projectid = 1;</code>
   */
  public java.lang.String getProjectid() {
    java.lang.Object ref = projectid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectid_ = s;
      return s;
    }
  }
  /**
   * <code>string projectid = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProjectidBytes() {
    java.lang.Object ref = projectid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROJECTNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object projectname_;
  /**
   * <code>string projectname = 2;</code>
   */
  public java.lang.String getProjectname() {
    java.lang.Object ref = projectname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectname_ = s;
      return s;
    }
  }
  /**
   * <code>string projectname = 2;</code>
   */
  public com.google.protobuf.ByteString
      getProjectnameBytes() {
    java.lang.Object ref = projectname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROJECTTYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object projecttype_;
  /**
   * <code>string projecttype = 3;</code>
   */
  public java.lang.String getProjecttype() {
    java.lang.Object ref = projecttype_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projecttype_ = s;
      return s;
    }
  }
  /**
   * <code>string projecttype = 3;</code>
   */
  public com.google.protobuf.ByteString
      getProjecttypeBytes() {
    java.lang.Object ref = projecttype_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projecttype_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getProjectidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectid_);
    }
    if (!getProjectnameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, projectname_);
    }
    if (!getProjecttypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, projecttype_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProjectidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectid_);
    }
    if (!getProjectnameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, projectname_);
    }
    if (!getProjecttypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, projecttype_);
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
    if (!(obj instanceof com.dalong.userappservice.Project)) {
      return super.equals(obj);
    }
    com.dalong.userappservice.Project other = (com.dalong.userappservice.Project) obj;

    boolean result = true;
    result = result && getProjectid()
        .equals(other.getProjectid());
    result = result && getProjectname()
        .equals(other.getProjectname());
    result = result && getProjecttype()
        .equals(other.getProjecttype());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PROJECTID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectid().hashCode();
    hash = (37 * hash) + PROJECTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getProjectname().hashCode();
    hash = (37 * hash) + PROJECTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getProjecttype().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dalong.userappservice.Project parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dalong.userappservice.Project parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dalong.userappservice.Project parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dalong.userappservice.Project parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dalong.userappservice.Project parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dalong.userappservice.Project parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dalong.userappservice.Project parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dalong.userappservice.Project parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dalong.userappservice.Project parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dalong.userappservice.Project parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dalong.userappservice.Project parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dalong.userappservice.Project parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.dalong.userappservice.Project prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code userservice.Project}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:userservice.Project)
      com.dalong.userappservice.ProjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dalong.userappservice.AppService.internal_static_userservice_Project_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dalong.userappservice.AppService.internal_static_userservice_Project_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dalong.userappservice.Project.class, com.dalong.userappservice.Project.Builder.class);
    }

    // Construct using com.dalong.userappservice.Project.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      projectid_ = "";

      projectname_ = "";

      projecttype_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dalong.userappservice.AppService.internal_static_userservice_Project_descriptor;
    }

    public com.dalong.userappservice.Project getDefaultInstanceForType() {
      return com.dalong.userappservice.Project.getDefaultInstance();
    }

    public com.dalong.userappservice.Project build() {
      com.dalong.userappservice.Project result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.dalong.userappservice.Project buildPartial() {
      com.dalong.userappservice.Project result = new com.dalong.userappservice.Project(this);
      result.projectid_ = projectid_;
      result.projectname_ = projectname_;
      result.projecttype_ = projecttype_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.dalong.userappservice.Project) {
        return mergeFrom((com.dalong.userappservice.Project)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dalong.userappservice.Project other) {
      if (other == com.dalong.userappservice.Project.getDefaultInstance()) return this;
      if (!other.getProjectid().isEmpty()) {
        projectid_ = other.projectid_;
        onChanged();
      }
      if (!other.getProjectname().isEmpty()) {
        projectname_ = other.projectname_;
        onChanged();
      }
      if (!other.getProjecttype().isEmpty()) {
        projecttype_ = other.projecttype_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.dalong.userappservice.Project parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dalong.userappservice.Project) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object projectid_ = "";
    /**
     * <code>string projectid = 1;</code>
     */
    public java.lang.String getProjectid() {
      java.lang.Object ref = projectid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string projectid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProjectidBytes() {
      java.lang.Object ref = projectid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string projectid = 1;</code>
     */
    public Builder setProjectid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string projectid = 1;</code>
     */
    public Builder clearProjectid() {
      
      projectid_ = getDefaultInstance().getProjectid();
      onChanged();
      return this;
    }
    /**
     * <code>string projectid = 1;</code>
     */
    public Builder setProjectidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object projectname_ = "";
    /**
     * <code>string projectname = 2;</code>
     */
    public java.lang.String getProjectname() {
      java.lang.Object ref = projectname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string projectname = 2;</code>
     */
    public com.google.protobuf.ByteString
        getProjectnameBytes() {
      java.lang.Object ref = projectname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string projectname = 2;</code>
     */
    public Builder setProjectname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectname_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string projectname = 2;</code>
     */
    public Builder clearProjectname() {
      
      projectname_ = getDefaultInstance().getProjectname();
      onChanged();
      return this;
    }
    /**
     * <code>string projectname = 2;</code>
     */
    public Builder setProjectnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectname_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object projecttype_ = "";
    /**
     * <code>string projecttype = 3;</code>
     */
    public java.lang.String getProjecttype() {
      java.lang.Object ref = projecttype_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projecttype_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string projecttype = 3;</code>
     */
    public com.google.protobuf.ByteString
        getProjecttypeBytes() {
      java.lang.Object ref = projecttype_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projecttype_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string projecttype = 3;</code>
     */
    public Builder setProjecttype(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projecttype_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string projecttype = 3;</code>
     */
    public Builder clearProjecttype() {
      
      projecttype_ = getDefaultInstance().getProjecttype();
      onChanged();
      return this;
    }
    /**
     * <code>string projecttype = 3;</code>
     */
    public Builder setProjecttypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projecttype_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:userservice.Project)
  }

  // @@protoc_insertion_point(class_scope:userservice.Project)
  private static final com.dalong.userappservice.Project DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dalong.userappservice.Project();
  }

  public static com.dalong.userappservice.Project getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Project>
      PARSER = new com.google.protobuf.AbstractParser<Project>() {
    public Project parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Project(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Project> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Project> getParserForType() {
    return PARSER;
  }

  public com.dalong.userappservice.Project getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

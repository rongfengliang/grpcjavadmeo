// Code generated by protoc-gen-go. DO NOT EDIT.
// source: proto/userservice.proto

/*
Package userservice is a generated protocol buffer package.

It is generated from these files:
	proto/userservice.proto

It has these top-level messages:
	MessageInfo
	MessageResponse
	UserRequest
	PersonRequest
	PlatformRequest
	UserResponse
	Project
	AppDemo
	MixInfo
*/
package userservice

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"

import (
	context "golang.org/x/net/context"
	grpc "google.golang.org/grpc"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

type MessageInfo struct {
	Messageoid string `protobuf:"bytes,1,opt,name=messageoid" json:"messageoid,omitempty"`
}

func (m *MessageInfo) Reset()                    { *m = MessageInfo{} }
func (m *MessageInfo) String() string            { return proto.CompactTextString(m) }
func (*MessageInfo) ProtoMessage()               {}
func (*MessageInfo) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{0} }

func (m *MessageInfo) GetMessageoid() string {
	if m != nil {
		return m.Messageoid
	}
	return ""
}

type MessageResponse struct {
	Messageresult string `protobuf:"bytes,1,opt,name=messageresult" json:"messageresult,omitempty"`
	Code          string `protobuf:"bytes,2,opt,name=code" json:"code,omitempty"`
}

func (m *MessageResponse) Reset()                    { *m = MessageResponse{} }
func (m *MessageResponse) String() string            { return proto.CompactTextString(m) }
func (*MessageResponse) ProtoMessage()               {}
func (*MessageResponse) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{1} }

func (m *MessageResponse) GetMessageresult() string {
	if m != nil {
		return m.Messageresult
	}
	return ""
}

func (m *MessageResponse) GetCode() string {
	if m != nil {
		return m.Code
	}
	return ""
}

type UserRequest struct {
	Userid string `protobuf:"bytes,1,opt,name=userid" json:"userid,omitempty"`
}

func (m *UserRequest) Reset()                    { *m = UserRequest{} }
func (m *UserRequest) String() string            { return proto.CompactTextString(m) }
func (*UserRequest) ProtoMessage()               {}
func (*UserRequest) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{2} }

func (m *UserRequest) GetUserid() string {
	if m != nil {
		return m.Userid
	}
	return ""
}

type PersonRequest struct {
	Personid string `protobuf:"bytes,1,opt,name=personid" json:"personid,omitempty"`
}

func (m *PersonRequest) Reset()                    { *m = PersonRequest{} }
func (m *PersonRequest) String() string            { return proto.CompactTextString(m) }
func (*PersonRequest) ProtoMessage()               {}
func (*PersonRequest) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{3} }

func (m *PersonRequest) GetPersonid() string {
	if m != nil {
		return m.Personid
	}
	return ""
}

type PlatformRequest struct {
	Platformid string `protobuf:"bytes,1,opt,name=platformid" json:"platformid,omitempty"`
}

func (m *PlatformRequest) Reset()                    { *m = PlatformRequest{} }
func (m *PlatformRequest) String() string            { return proto.CompactTextString(m) }
func (*PlatformRequest) ProtoMessage()               {}
func (*PlatformRequest) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{4} }

func (m *PlatformRequest) GetPlatformid() string {
	if m != nil {
		return m.Platformid
	}
	return ""
}

type UserResponse struct {
	Code    int32    `protobuf:"varint,1,opt,name=code" json:"code,omitempty"`
	Message string   `protobuf:"bytes,2,opt,name=message" json:"message,omitempty"`
	Result  *MixInfo `protobuf:"bytes,3,opt,name=result" json:"result,omitempty"`
}

func (m *UserResponse) Reset()                    { *m = UserResponse{} }
func (m *UserResponse) String() string            { return proto.CompactTextString(m) }
func (*UserResponse) ProtoMessage()               {}
func (*UserResponse) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{5} }

func (m *UserResponse) GetCode() int32 {
	if m != nil {
		return m.Code
	}
	return 0
}

func (m *UserResponse) GetMessage() string {
	if m != nil {
		return m.Message
	}
	return ""
}

func (m *UserResponse) GetResult() *MixInfo {
	if m != nil {
		return m.Result
	}
	return nil
}

type Project struct {
	Projectid   string `protobuf:"bytes,1,opt,name=projectid" json:"projectid,omitempty"`
	Projectname string `protobuf:"bytes,2,opt,name=projectname" json:"projectname,omitempty"`
	Projecttype string `protobuf:"bytes,3,opt,name=projecttype" json:"projecttype,omitempty"`
}

func (m *Project) Reset()                    { *m = Project{} }
func (m *Project) String() string            { return proto.CompactTextString(m) }
func (*Project) ProtoMessage()               {}
func (*Project) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{6} }

func (m *Project) GetProjectid() string {
	if m != nil {
		return m.Projectid
	}
	return ""
}

func (m *Project) GetProjectname() string {
	if m != nil {
		return m.Projectname
	}
	return ""
}

func (m *Project) GetProjecttype() string {
	if m != nil {
		return m.Projecttype
	}
	return ""
}

type AppDemo struct {
	Projects map[string]*Project `protobuf:"bytes,4,rep,name=projects" json:"projects,omitempty" protobuf_key:"bytes,1,opt,name=key" protobuf_val:"bytes,2,opt,name=value"`
	// Types that are valid to be assigned to Request:
	//	*AppDemo_Userrequest
	//	*AppDemo_Personrequest
	//	*AppDemo_Platformrequest
	Request isAppDemo_Request `protobuf_oneof:"Request"`
}

func (m *AppDemo) Reset()                    { *m = AppDemo{} }
func (m *AppDemo) String() string            { return proto.CompactTextString(m) }
func (*AppDemo) ProtoMessage()               {}
func (*AppDemo) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{7} }

type isAppDemo_Request interface {
	isAppDemo_Request()
}

type AppDemo_Userrequest struct {
	Userrequest *UserRequest `protobuf:"bytes,1,opt,name=userrequest,oneof"`
}
type AppDemo_Personrequest struct {
	Personrequest *PersonRequest `protobuf:"bytes,2,opt,name=personrequest,oneof"`
}
type AppDemo_Platformrequest struct {
	Platformrequest *PlatformRequest `protobuf:"bytes,3,opt,name=platformrequest,oneof"`
}

func (*AppDemo_Userrequest) isAppDemo_Request()     {}
func (*AppDemo_Personrequest) isAppDemo_Request()   {}
func (*AppDemo_Platformrequest) isAppDemo_Request() {}

func (m *AppDemo) GetRequest() isAppDemo_Request {
	if m != nil {
		return m.Request
	}
	return nil
}

func (m *AppDemo) GetProjects() map[string]*Project {
	if m != nil {
		return m.Projects
	}
	return nil
}

func (m *AppDemo) GetUserrequest() *UserRequest {
	if x, ok := m.GetRequest().(*AppDemo_Userrequest); ok {
		return x.Userrequest
	}
	return nil
}

func (m *AppDemo) GetPersonrequest() *PersonRequest {
	if x, ok := m.GetRequest().(*AppDemo_Personrequest); ok {
		return x.Personrequest
	}
	return nil
}

func (m *AppDemo) GetPlatformrequest() *PlatformRequest {
	if x, ok := m.GetRequest().(*AppDemo_Platformrequest); ok {
		return x.Platformrequest
	}
	return nil
}

// XXX_OneofFuncs is for the internal use of the proto package.
func (*AppDemo) XXX_OneofFuncs() (func(msg proto.Message, b *proto.Buffer) error, func(msg proto.Message, tag, wire int, b *proto.Buffer) (bool, error), func(msg proto.Message) (n int), []interface{}) {
	return _AppDemo_OneofMarshaler, _AppDemo_OneofUnmarshaler, _AppDemo_OneofSizer, []interface{}{
		(*AppDemo_Userrequest)(nil),
		(*AppDemo_Personrequest)(nil),
		(*AppDemo_Platformrequest)(nil),
	}
}

func _AppDemo_OneofMarshaler(msg proto.Message, b *proto.Buffer) error {
	m := msg.(*AppDemo)
	// Request
	switch x := m.Request.(type) {
	case *AppDemo_Userrequest:
		b.EncodeVarint(1<<3 | proto.WireBytes)
		if err := b.EncodeMessage(x.Userrequest); err != nil {
			return err
		}
	case *AppDemo_Personrequest:
		b.EncodeVarint(2<<3 | proto.WireBytes)
		if err := b.EncodeMessage(x.Personrequest); err != nil {
			return err
		}
	case *AppDemo_Platformrequest:
		b.EncodeVarint(3<<3 | proto.WireBytes)
		if err := b.EncodeMessage(x.Platformrequest); err != nil {
			return err
		}
	case nil:
	default:
		return fmt.Errorf("AppDemo.Request has unexpected type %T", x)
	}
	return nil
}

func _AppDemo_OneofUnmarshaler(msg proto.Message, tag, wire int, b *proto.Buffer) (bool, error) {
	m := msg.(*AppDemo)
	switch tag {
	case 1: // Request.userrequest
		if wire != proto.WireBytes {
			return true, proto.ErrInternalBadWireType
		}
		msg := new(UserRequest)
		err := b.DecodeMessage(msg)
		m.Request = &AppDemo_Userrequest{msg}
		return true, err
	case 2: // Request.personrequest
		if wire != proto.WireBytes {
			return true, proto.ErrInternalBadWireType
		}
		msg := new(PersonRequest)
		err := b.DecodeMessage(msg)
		m.Request = &AppDemo_Personrequest{msg}
		return true, err
	case 3: // Request.platformrequest
		if wire != proto.WireBytes {
			return true, proto.ErrInternalBadWireType
		}
		msg := new(PlatformRequest)
		err := b.DecodeMessage(msg)
		m.Request = &AppDemo_Platformrequest{msg}
		return true, err
	default:
		return false, nil
	}
}

func _AppDemo_OneofSizer(msg proto.Message) (n int) {
	m := msg.(*AppDemo)
	// Request
	switch x := m.Request.(type) {
	case *AppDemo_Userrequest:
		s := proto.Size(x.Userrequest)
		n += proto.SizeVarint(1<<3 | proto.WireBytes)
		n += proto.SizeVarint(uint64(s))
		n += s
	case *AppDemo_Personrequest:
		s := proto.Size(x.Personrequest)
		n += proto.SizeVarint(2<<3 | proto.WireBytes)
		n += proto.SizeVarint(uint64(s))
		n += s
	case *AppDemo_Platformrequest:
		s := proto.Size(x.Platformrequest)
		n += proto.SizeVarint(3<<3 | proto.WireBytes)
		n += proto.SizeVarint(uint64(s))
		n += s
	case nil:
	default:
		panic(fmt.Sprintf("proto: unexpected type %T in oneof", x))
	}
	return n
}

type MixInfo struct {
	Username     string `protobuf:"bytes,1,opt,name=username" json:"username,omitempty"`
	Orgname      string `protobuf:"bytes,2,opt,name=orgname" json:"orgname,omitempty"`
	Orgid        string `protobuf:"bytes,3,opt,name=orgid" json:"orgid,omitempty"`
	Enterprise   string `protobuf:"bytes,4,opt,name=enterprise" json:"enterprise,omitempty"`
	Enterpriseid string `protobuf:"bytes,5,opt,name=enterpriseid" json:"enterpriseid,omitempty"`
}

func (m *MixInfo) Reset()                    { *m = MixInfo{} }
func (m *MixInfo) String() string            { return proto.CompactTextString(m) }
func (*MixInfo) ProtoMessage()               {}
func (*MixInfo) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{8} }

func (m *MixInfo) GetUsername() string {
	if m != nil {
		return m.Username
	}
	return ""
}

func (m *MixInfo) GetOrgname() string {
	if m != nil {
		return m.Orgname
	}
	return ""
}

func (m *MixInfo) GetOrgid() string {
	if m != nil {
		return m.Orgid
	}
	return ""
}

func (m *MixInfo) GetEnterprise() string {
	if m != nil {
		return m.Enterprise
	}
	return ""
}

func (m *MixInfo) GetEnterpriseid() string {
	if m != nil {
		return m.Enterpriseid
	}
	return ""
}

func init() {
	proto.RegisterType((*MessageInfo)(nil), "userservice.MessageInfo")
	proto.RegisterType((*MessageResponse)(nil), "userservice.MessageResponse")
	proto.RegisterType((*UserRequest)(nil), "userservice.UserRequest")
	proto.RegisterType((*PersonRequest)(nil), "userservice.PersonRequest")
	proto.RegisterType((*PlatformRequest)(nil), "userservice.PlatformRequest")
	proto.RegisterType((*UserResponse)(nil), "userservice.UserResponse")
	proto.RegisterType((*Project)(nil), "userservice.Project")
	proto.RegisterType((*AppDemo)(nil), "userservice.AppDemo")
	proto.RegisterType((*MixInfo)(nil), "userservice.MixInfo")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// Client API for UserService service

type UserServiceClient interface {
	UserInfo(ctx context.Context, in *UserRequest, opts ...grpc.CallOption) (*UserResponse, error)
	WatchMessage(ctx context.Context, in *MessageInfo, opts ...grpc.CallOption) (UserService_WatchMessageClient, error)
}

type userServiceClient struct {
	cc *grpc.ClientConn
}

func NewUserServiceClient(cc *grpc.ClientConn) UserServiceClient {
	return &userServiceClient{cc}
}

func (c *userServiceClient) UserInfo(ctx context.Context, in *UserRequest, opts ...grpc.CallOption) (*UserResponse, error) {
	out := new(UserResponse)
	err := grpc.Invoke(ctx, "/userservice.UserService/UserInfo", in, out, c.cc, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *userServiceClient) WatchMessage(ctx context.Context, in *MessageInfo, opts ...grpc.CallOption) (UserService_WatchMessageClient, error) {
	stream, err := grpc.NewClientStream(ctx, &_UserService_serviceDesc.Streams[0], c.cc, "/userservice.UserService/WatchMessage", opts...)
	if err != nil {
		return nil, err
	}
	x := &userServiceWatchMessageClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type UserService_WatchMessageClient interface {
	Recv() (*MessageResponse, error)
	grpc.ClientStream
}

type userServiceWatchMessageClient struct {
	grpc.ClientStream
}

func (x *userServiceWatchMessageClient) Recv() (*MessageResponse, error) {
	m := new(MessageResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// Server API for UserService service

type UserServiceServer interface {
	UserInfo(context.Context, *UserRequest) (*UserResponse, error)
	WatchMessage(*MessageInfo, UserService_WatchMessageServer) error
}

func RegisterUserServiceServer(s *grpc.Server, srv UserServiceServer) {
	s.RegisterService(&_UserService_serviceDesc, srv)
}

func _UserService_UserInfo_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UserRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(UserServiceServer).UserInfo(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/userservice.UserService/UserInfo",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(UserServiceServer).UserInfo(ctx, req.(*UserRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _UserService_WatchMessage_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(MessageInfo)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(UserServiceServer).WatchMessage(m, &userServiceWatchMessageServer{stream})
}

type UserService_WatchMessageServer interface {
	Send(*MessageResponse) error
	grpc.ServerStream
}

type userServiceWatchMessageServer struct {
	grpc.ServerStream
}

func (x *userServiceWatchMessageServer) Send(m *MessageResponse) error {
	return x.ServerStream.SendMsg(m)
}

var _UserService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "userservice.UserService",
	HandlerType: (*UserServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "UserInfo",
			Handler:    _UserService_UserInfo_Handler,
		},
	},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "WatchMessage",
			Handler:       _UserService_WatchMessage_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "proto/userservice.proto",
}

func init() { proto.RegisterFile("proto/userservice.proto", fileDescriptor0) }

var fileDescriptor0 = []byte{
	// 560 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x74, 0x54, 0xed, 0x8a, 0xd3, 0x40,
	0x14, 0x6d, 0xfa, 0xdd, 0x9b, 0x96, 0xca, 0xb0, 0x68, 0xb6, 0x94, 0xa5, 0x04, 0x85, 0xe2, 0x47,
	0xd5, 0x0a, 0x22, 0x22, 0xca, 0x16, 0x85, 0x8a, 0x2c, 0xd4, 0x88, 0x08, 0xfe, 0x8b, 0xed, 0xdd,
	0x9a, 0xdd, 0x36, 0x33, 0xce, 0xa4, 0x8b, 0x7d, 0x13, 0x7d, 0x4e, 0x5f, 0x40, 0x32, 0x73, 0xa7,
	0xc9, 0x2c, 0xbb, 0xff, 0x72, 0xce, 0x9c, 0x3b, 0x73, 0xee, 0x9c, 0x9b, 0x81, 0x7b, 0x42, 0xf2,
	0x8c, 0x3f, 0xdd, 0x29, 0x94, 0x0a, 0xe5, 0x55, 0xb2, 0xc4, 0x89, 0x66, 0x98, 0x5f, 0xa2, 0xc2,
	0x27, 0xe0, 0x9f, 0xa1, 0x52, 0xf1, 0x1a, 0x3f, 0xa6, 0xe7, 0x9c, 0x9d, 0x00, 0x6c, 0x0d, 0xe4,
	0xc9, 0x2a, 0xf0, 0x46, 0xde, 0xb8, 0x13, 0x95, 0x98, 0xf0, 0x13, 0xf4, 0x49, 0x1e, 0xa1, 0x12,
	0x3c, 0x55, 0xc8, 0xee, 0x43, 0x8f, 0x04, 0x12, 0xd5, 0x6e, 0x93, 0x51, 0x95, 0x4b, 0x32, 0x06,
	0xf5, 0x25, 0x5f, 0x61, 0x50, 0xd5, 0x8b, 0xfa, 0x3b, 0x7c, 0x00, 0xfe, 0x57, 0x85, 0x32, 0xc2,
	0x5f, 0x3b, 0x54, 0x19, 0xbb, 0x0b, 0xcd, 0xdc, 0xd9, 0xe1, 0x5c, 0x42, 0xe1, 0x23, 0xe8, 0x2d,
	0x50, 0x2a, 0x9e, 0x5a, 0xe1, 0x00, 0xda, 0x42, 0x13, 0x07, 0xe9, 0x01, 0x87, 0xcf, 0xa1, 0xbf,
	0xd8, 0xc4, 0xd9, 0x39, 0x97, 0x5b, 0x2b, 0x3f, 0x01, 0x10, 0x44, 0x15, 0x3d, 0x15, 0x4c, 0x78,
	0x01, 0x5d, 0x63, 0x83, 0x1a, 0xb2, 0x56, 0x73, 0x65, 0xc3, 0x58, 0x65, 0x01, 0xb4, 0xa8, 0x1f,
	0xea, 0xc0, 0x42, 0xf6, 0x18, 0x9a, 0xd4, 0x77, 0x6d, 0xe4, 0x8d, 0xfd, 0xe9, 0xd1, 0xa4, 0x7c,
	0xe3, 0x67, 0xc9, 0xef, 0xfc, 0x5e, 0x23, 0xd2, 0x84, 0x97, 0xd0, 0x5a, 0x48, 0x7e, 0x81, 0xcb,
	0x8c, 0x0d, 0xa1, 0x23, 0xcc, 0xe7, 0xc1, 0x55, 0x41, 0xb0, 0x11, 0xf8, 0x04, 0xd2, 0x78, 0x6b,
	0x0f, 0x2d, 0x53, 0x25, 0x45, 0xb6, 0x17, 0xa8, 0x4f, 0x2f, 0x14, 0x39, 0x15, 0xfe, 0xab, 0x42,
	0xeb, 0x54, 0x88, 0xf7, 0xb8, 0xe5, 0xec, 0x2d, 0xb4, 0x69, 0x49, 0x05, 0xf5, 0x51, 0x6d, 0xec,
	0x4f, 0x43, 0xc7, 0x28, 0xe9, 0x26, 0xe4, 0x4e, 0x7d, 0x48, 0x33, 0xb9, 0x8f, 0x0e, 0x35, 0xec,
	0x0d, 0xe8, 0xb1, 0x91, 0xe6, 0x4e, 0xb5, 0x5f, 0x7f, 0x1a, 0x38, 0x5b, 0x94, 0xb2, 0x9c, 0x57,
	0xa2, 0xb2, 0x9c, 0xcd, 0xa0, 0x67, 0x12, 0xb2, 0xf5, 0x55, 0x5d, 0x3f, 0x70, 0xea, 0x9d, 0x90,
	0xe7, 0x95, 0xc8, 0x2d, 0x61, 0x73, 0xe8, 0xdb, 0xd0, 0xec, 0x2e, 0xe6, 0xc6, 0x87, 0xee, 0x2e,
	0x6e, 0xfa, 0xf3, 0x4a, 0x74, 0xbd, 0x6c, 0xf0, 0x19, 0x7a, 0x4e, 0x9b, 0xec, 0x0e, 0xd4, 0x2e,
	0x71, 0x4f, 0x21, 0xe4, 0x9f, 0xec, 0x21, 0x34, 0xae, 0xe2, 0xcd, 0x0e, 0xc9, 0xa8, 0x1b, 0x2a,
	0x15, 0x47, 0x46, 0xf2, 0xba, 0xfa, 0xca, 0x9b, 0x75, 0xa0, 0x45, 0x07, 0x86, 0x7f, 0x3d, 0x68,
	0x51, 0xec, 0xf9, 0xa4, 0xe6, 0x85, 0x3a, 0x42, 0x9a, 0x54, 0x8b, 0xf3, 0x91, 0xe2, 0x72, 0x5d,
	0x4a, 0xd7, 0x42, 0x76, 0x04, 0x0d, 0x2e, 0xd7, 0xc9, 0x8a, 0x32, 0x35, 0x20, 0x1f, 0x63, 0x4c,
	0x33, 0x94, 0x42, 0x26, 0x0a, 0x83, 0xba, 0x19, 0xe3, 0x82, 0x61, 0x21, 0x74, 0x0b, 0x94, 0xac,
	0x82, 0x86, 0x56, 0x38, 0xdc, 0xf4, 0x8f, 0x67, 0x7e, 0xb9, 0x2f, 0xa6, 0x13, 0xf6, 0x0e, 0xda,
	0x39, 0xd4, 0x5e, 0x6f, 0x0d, 0x73, 0x70, 0x7c, 0xc3, 0x0a, 0xfd, 0x2b, 0x73, 0xe8, 0x7e, 0x8b,
	0xb3, 0xe5, 0x4f, 0x7a, 0x14, 0xae, 0x6d, 0x52, 0x7a, 0x59, 0x06, 0xc3, 0x9b, 0x56, 0xec, 0x3e,
	0xcf, 0xbc, 0xd9, 0x4b, 0x38, 0x5e, 0xf2, 0xed, 0x64, 0x15, 0x6f, 0x78, 0xba, 0xd6, 0xda, 0x58,
	0x08, 0x92, 0xcf, 0xe0, 0x54, 0x08, 0xf2, 0xbc, 0xf0, 0xbe, 0x97, 0x1f, 0xb0, 0x1f, 0x4d, 0xfd,
	0xa8, 0xbd, 0xf8, 0x1f, 0x00, 0x00, 0xff, 0xff, 0xc8, 0x90, 0xfa, 0x0a, 0xef, 0x04, 0x00, 0x00,
}
package main

import (
	"context"
	"log"

	"sync"

	pb "github.com/rongfengliang/grpcjava/golang/proto"
	"google.golang.org/grpc"
	"google.golang.org/grpc/metadata"
)

const (
	address = "127.0.0.1:50051"
)

var wg sync.WaitGroup

func main() {
	wg.Add(2)
	conn, err := grpc.Dial(address, grpc.WithInsecure())
	if err != nil {
		log.Fatalf("did not connect: %v", err)
	}
	defer conn.Close()
	md := metadata.Pairs("authorization", "token dalong")
	c := pb.NewUserServiceClient(conn)
	ctx := metadata.NewOutgoingContext(context.Background(), md)
	result, err := c.UserInfo(ctx, &pb.UserRequest{
		Userid: "dalongdemo",
	})
	if err != nil {
		log.Fatal("some wrong")
	}
	log.Println(result.Result)
	wg.Wait()
}

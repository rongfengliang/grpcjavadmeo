# grpcjavademo

## project 

```bash
├── appdemo  // server java
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── dalong
│       │   │           └── userappservice
│       │   └── resources
│       └── test
│           ├── java
│           └── resources
├── userserviceclientgolang // client with golang call
│   ├── golang
│   │   └── proto
│   └── proto
├── userserviceclientjava // client with java call
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── dalong
│       │   │           └── userappservice
│       │   └── resources
│       └── test
│           ├── java
│           └── resources
└── userserviceproto  // protobuf define
    └── src
        ├── main
        │   ├── java
        │   ├── proto
        │   └── resources
        └── test
            ├── java
            └── resources
```
## how to run
```bash
a. generate protobuf grpc code

cd userserviceproto
mvn clean compile package install

b. start server 

cd appdemo
start appdemo/src/main/java/com/dalong/MyServer.java

c. java client start

start userserviceclientjava/src/main/java/com/ServiceCall.java

d. golang client call 

go get github.com/rongfengliang/grpcjavademo/userserviceclientgolang

cd $GOPATH/src/github.com/rongfengliang/grpcjavademo/userserviceclientgolang

go run main.go

```
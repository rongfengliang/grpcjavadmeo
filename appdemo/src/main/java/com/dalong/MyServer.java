package com.dalong;

import java.io.IOException;

import com.dalong.userappservice.MixInfo;
import com.dalong.userappservice.UserRequest;
import com.dalong.userappservice.UserResponse;
import com.dalong.userappservice.UserServiceGrpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class MyServer {
	  private Server server;

	  private void start() throws IOException {
	    /* The port on which the server should run */
	    int port = 50051;
	    
	    server = ServerBuilder.forPort(port)
	        .addService(new UserServiceimpl())
	        .build()
	        .start();
	    Runtime.getRuntime().addShutdownHook(new Thread() {
	      @Override
	      public void run() {
	        // Use stderr here since the logger may have been reset by its JVM shutdown hook.
	        System.err.println("*** shutting down gRPC server since JVM is shutting down");
	        MyServer.this.stop();
	        System.err.println("*** server shut down");
	      }
	    });
	  }

	  private void stop() {
	    if (server != null) {
	      server.shutdown();
	    }
	  }

	  /**
	   * Await termination on the main thread since the grpc library uses daemon threads.
	   */
	  private void blockUntilShutdown() throws InterruptedException {
	    if (server != null) {
	      server.awaitTermination();
	    }
	  }
	public static void main(String[] args) throws IOException, InterruptedException {
		final MyServer server = new MyServer();
	    server.start();
	    server.blockUntilShutdown();
	}
	
	class UserServiceimpl extends UserServiceGrpc.UserServiceImplBase{
      
		@Override
		public void userInfo(UserRequest request, StreamObserver<UserResponse> responseObserver) {
			// TODO Auto-generated method stub
			MixInfo info=MixInfo.newBuilder()
					.setEnterprise("111")
					.setOrgid("001")
					.setOrgname("dalongdmeo")
					.setUsername("dalong").build();
			UserResponse response =UserResponse.newBuilder()
					.setCode(1)
					.setMessage("ok")
					.setResult(info).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
			
		}
	}

}

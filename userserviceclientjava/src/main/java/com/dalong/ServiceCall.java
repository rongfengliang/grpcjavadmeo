package com.dalong;

import java.util.concurrent.TimeUnit;

import com.dalong.userappservice.UserRequest;
import com.dalong.userappservice.UserResponse;
import com.dalong.userappservice.UserServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class ServiceCall {
	private final ManagedChannel channel;
	  private final UserServiceGrpc.UserServiceBlockingStub blockingStub;

	  /** Construct client connecting to HelloWorld server at {@code host:port}. */
	  public ServiceCall(String host, int port) {
	    this(ManagedChannelBuilder.forAddress(host, port)
	        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
	        // needing certificates.
	        .usePlaintext(true)
	        .build());
	  }

	  /** Construct client for accessing RouteGuide server using the existing channel. */
	  ServiceCall(ManagedChannel channel) {
	    this.channel = channel;
	    blockingStub = UserServiceGrpc.newBlockingStub(channel);
	  }

	  public void shutdown() throws InterruptedException {
	    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	  }

	  /** Say hello to server. */
	  public void userinfo(String userid) {
	    UserRequest request = UserRequest.newBuilder().setUserid(userid).build();
	    UserResponse response;
	    try {
	      response = blockingStub.userInfo(request);
	    } catch (StatusRuntimeException e) {
	       System.out.println(e.toString());
	      return;
	    }
	    System.out.println("userinfo: " + response.getResult().toString());
	  }
	public static void main(String[] args) throws InterruptedException {
		ServiceCall client = new ServiceCall("localhost", 50051);
	    try {
	      /* Access a service running on the local machine on port 50051 */
	      String user = "world";
	      if (args.length > 0) {
	        user = args[0]; /* Use the arg as the name to greet if provided */
	      }
	      client.userinfo(user);
	    } finally {
	      client.shutdown();
	    }
	}

}

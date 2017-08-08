package com.radha.endpoint;

import javax.xml.ws.Endpoint;
import com.radha.ws.HelloWorldImpl;

//Endpoint publisher
public class HelloWorldPublisher{

	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
    }

}

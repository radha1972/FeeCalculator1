package com.radha.endpoint;


import javax.xml.ws.Endpoint;
import com.radha.ws.HelloImpl;

//Endpoint publisher
public class HelloPublisher{

	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9700/hello", new HelloImpl());
    }

}
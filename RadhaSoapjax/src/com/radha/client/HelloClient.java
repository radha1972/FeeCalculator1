package com.radha.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.radha.ws.Hello;



import com.radha.ws.HelloImpl;

public class HelloClient{

	public static void main(String[] args) {

		HelloImpl helloService = new HelloImpl();
		

		System.out.println(helloService.getHelloWorldAsString("radha"));

    }

}
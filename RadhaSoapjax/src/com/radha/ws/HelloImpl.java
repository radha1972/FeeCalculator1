package com.radha.ws;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.radha.ws.Hello")
public class HelloImpl implements Hello{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}
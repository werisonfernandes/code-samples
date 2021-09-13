package br.com.werison.calc.impl;

import javax.jws.WebService;

import br.com.werison.calc.HelloWorldServer;

@WebService(endpointInterface = "br.com.werison.calc.HelloWorldServer")
public class HelloWorldServerImpl implements HelloWorldServer {

	@Override
	public String hello(String message) {
		return "Hello " + message;
	}
}
package br.com.werison.calc;

import javax.xml.ws.Endpoint;

import br.com.werison.calc.impl.CalculadoraServerImpl;
import br.com.werison.calc.impl.HelloWorldServerImpl;

public class CalculadoraServerPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:9876/calc", new CalculadoraServerImpl());
		Endpoint.publish("http://127.0.0.1:9876/hello", new HelloWorldServerImpl());
	}
}
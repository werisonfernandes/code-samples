package br.com.werison.calc.impl;

import javax.jws.WebService;

import br.com.werison.calc.CalculadoraServer;

@WebService(endpointInterface = "br.com.werison.calc.CalculadoraServer")
public class CalculadoraServerImpl implements CalculadoraServer {

  public float soma(float num1, float num2) {
    return num1 + num2;
  }

  public float subtracao(float num1, float num2) {
    return num1 - num2;
  }

  public float multiplicacao(float num1, float num2) {
    return num1 * num2;
  }

  public float divisao(float num1, float num2) {
    return num1 / num2;
  }
}

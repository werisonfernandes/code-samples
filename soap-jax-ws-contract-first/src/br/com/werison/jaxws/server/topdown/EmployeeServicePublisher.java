package br.com.werison.jaxws.server.topdown;

import javax.xml.ws.Endpoint;

public class EmployeeServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish(
          "http://localhost:8080/employeeservicetopdown", 
           new EmployeeServiceTopDownImpl());

        Endpoint.publish("http://localhost:8080/employeeservice", 
          new EmployeeServiceTopDownImpl());
    }
}

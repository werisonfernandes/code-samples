package br.com.werison.jaxws;

import java.util.logging.Logger;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(serviceName = "HelloService", portName = "HelloPort", targetNamespace = "https://igastei.com.br/")
public class HelloPort {

    private static final Logger LOG = Logger.getLogger(HelloPort.class.getName());

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "https://igastei.com.br/",  className = "br.com.werison.jaxws.SayHello")
    @WebMethod(action = "urn:SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "https://igastei.com.br/", className = "br.com.werison.jaxws.SayHelloResponse")
    public java.lang.String sayHello(@WebParam(name = "myname", targetNamespace = "") String myname) {
        try {
            return "Hello, " + myname + "!";

        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}

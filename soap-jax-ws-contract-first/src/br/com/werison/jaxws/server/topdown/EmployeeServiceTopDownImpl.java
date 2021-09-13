package br.com.werison.jaxws.server.topdown;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "EmployeeServiceTopDown", endpointInterface = "br.com.werison.jaxws.server.topdown.EmployeeServiceTopDown", targetNamespace = "http://igastei.com.br/")
public class EmployeeServiceTopDownImpl implements EmployeeServiceTopDown {

	private EmployeeRepository employeeRepositoryImpl = new EmployeeRepository();

	@WebMethod
	public int countEmployees() {
		return employeeRepositoryImpl.count();
	}
}

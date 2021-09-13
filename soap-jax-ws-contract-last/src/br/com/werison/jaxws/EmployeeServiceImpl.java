package br.com.werison.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "br.com.werison.jaxws.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {
 
    //@Inject 
    private EmployeeRepository employeeRepositoryImpl = new EmployeeRepository();

    @WebMethod
    public Employee getEmployee(int id) {
        return employeeRepositoryImpl.getEmployee(id);
    }

    @WebMethod
    public Employee updateEmployee(int id, String name) {
        return employeeRepositoryImpl.updateEmployee(id, name);
    }

    @WebMethod
    public boolean deleteEmployee(int id) {
        return employeeRepositoryImpl.deleteEmployee(id);
    }

    @WebMethod
    public Employee addEmployee(int id, String name) {
        return employeeRepositoryImpl.addEmployee(id, name);
    }
}

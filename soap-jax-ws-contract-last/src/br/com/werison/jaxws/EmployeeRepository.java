package br.com.werison.jaxws;

public class EmployeeRepository {

    public Employee getEmployee(int id) {
        return new Employee();
    }

    public Employee updateEmployee(int id, String name) {
    	 return new Employee(); 
    }

    public boolean deleteEmployee(int id) {
        return id > 0;
    }

    public Employee addEmployee(int id, String name) {
    	 return new Employee();
    }
}

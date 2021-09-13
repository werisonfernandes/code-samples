package br.com.werison.jaxws;

public class Employee {

	private int id;
	private String firstName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + "]";
	}
}

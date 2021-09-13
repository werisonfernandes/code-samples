package br.com.werison.jmsartemis;

import java.io.Serializable;

public class Customer implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
    String surname;

    public Customer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

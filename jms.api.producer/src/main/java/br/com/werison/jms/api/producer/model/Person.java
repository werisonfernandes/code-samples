package br.com.werison.jms.api.producer.model;

import lombok.*;

@Getter
//@Setter
@Builder
//@AllArgsConstructor
//@NoArgsConstructor
public class Person {
	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

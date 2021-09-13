package br.com.werison.jms.api.consumer.jms;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import br.com.werison.jms.api.consumer.model.Person;
import br.com.werison.jms.api.consumer.repository.PersonRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class Consumer {

	private List<Person> persons = new ArrayList<>();

	@Autowired
	private PersonRepository personRepository;

	@JmsListener(destination = "${activemq.name}")
	public void listen(String mensagem) {
		System.out.println(mensagem);
		Person person = new Person();
		try {
			Gson gson = new Gson();
			person = gson.fromJson(mensagem, Person.class);
			personRepository.save(person);
		} catch (Exception e) {

		}
	}

}

package br.com.werison.jms.api.producer.jms;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import com.google.gson.Gson;

import br.com.werison.jms.api.producer.model.Person;

@Component
@RequiredArgsConstructor
public class Producer {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Value("${activemq.name}")
	private String destinationQueue;

	public void send(Person person) {
		Gson gson = new Gson();
		String jsonPerson = gson.toJson(person);
		jmsTemplate.convertAndSend(destinationQueue, jsonPerson);
	}

}

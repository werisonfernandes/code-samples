package br.com.werison.jms.api.producer.rest;

import javax.jms.JMSException;
import javax.naming.NamingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.werison.jms.api.producer.jms.Producer;
import br.com.werison.jms.api.producer.model.Person;

@RestController
public class PersonRestControlller {
	@Autowired
	private Producer producer;

	@PostMapping("/save")
	public String save(@RequestBody Person person) throws JMSException, NamingException {
		producer.send(person);
		return "ok!!!";
	}
}

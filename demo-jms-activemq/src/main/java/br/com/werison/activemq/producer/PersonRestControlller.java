package br.com.werison.activemq.producer;

import javax.jms.JMSException;
import javax.naming.NamingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

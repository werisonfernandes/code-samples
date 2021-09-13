package br.com.werison.jms.api.producer.resource;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.werison.jms.api.producer.jms.Producer;
import br.com.werison.jms.api.producer.model.Person;

import javax.jms.JMSException;
import javax.naming.NamingException;

@RequiredArgsConstructor
@Controller
public class PersonResource {

	@Autowired
	private Producer producer;

	@GetMapping("/")
	public String index() {
		return "index.html";
	}

	@GetMapping("/cadastra-pessoas")
	private String cadastraPessoas(Model model) {
		return "cadastra-pessoas.html";
	}

	@PostMapping(value = "salvar")
	public String save(@RequestParam("name") String name, @RequestParam("age") int age, Model model)
			throws JMSException, NamingException {
		Person person = new Person(0, name, age);
		producer.send(person);
		return "/cadastra-pessoas";
	}

}

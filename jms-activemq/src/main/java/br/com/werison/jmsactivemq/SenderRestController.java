package br.com.werison.jmsactivemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderRestController {

	@Autowired
	private Sender sender;
	
	@GetMapping("/message")
	public String sendMessage(@RequestParam(value = "message", defaultValue = "Olá mundo!!!") String message) {
		sender.send(message);
		return "Mensagem enviada com sucesso!!";
	}
}

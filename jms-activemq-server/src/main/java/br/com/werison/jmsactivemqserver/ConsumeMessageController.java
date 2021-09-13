package br.com.werison.jmsactivemqserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Slf4j
public class ConsumeMessageController {
	
	@Autowired
    JmsConsumer jms;

    @GetMapping(value="/api/employee")
    public Employee sendMessage(){
        jmsConsumer.
        return employee;
    }
}

package br.com.werison.jmsactivemqserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
//@Slf4j
public class JmsProducer {

	Logger log = LoggerFactory.getLogger(JmsProducer.class);
	@Autowired
    JmsTemplate jmsTemplate;

    @Value("${active-mq.topic}")
    private String topic;

    public void sendMessage(Employee message){
        try{
            log.info("Attempting Send message to Topic: "+ topic);
            jmsTemplate.convertAndSend(topic, message);
        } catch(Exception e){
            log.error("Recieved Exception during send Message: ", e);
        }
    }
}

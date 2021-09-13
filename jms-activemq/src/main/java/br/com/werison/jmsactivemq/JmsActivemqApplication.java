package br.com.werison.jmsactivemq;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@ComponentScan(basePackageClasses = {Consumer.class})
@EnableJms
public class JmsActivemqApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JmsActivemqApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(JmsActivemqApplication.class, args);
	}

	@Bean
    public Queue queue() {
		return new ActiveMQQueue("queue");
    }
}

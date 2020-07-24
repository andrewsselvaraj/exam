package com.paypal.payment;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication


@Configuration

@EnableWebMvc
public class PaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
		String s = "https://Reference material attacomsian.com/blog/spring-data-jpa-many-to-many-mapping#:~:text=A%20many%2Dto%2Dmany%20relationship%20between%20two%20entities%20is%20defined,that%20owns%20the%20bidirectional%20relationship.";
		s = s + "\n https://Reference material github.com/attacomsian/code-examples/tree/master/spring-data-jpa/jpa-mappings/src/main/java/com/attacomsian/jpa/many2many/domains";
		System.out.println(s);
	}
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	


}

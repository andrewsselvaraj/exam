package com.paypal.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
		String s = "https://attacomsian.com/blog/spring-data-jpa-many-to-many-mapping#:~:text=A%20many%2Dto%2Dmany%20relationship%20between%20two%20entities%20is%20defined,that%20owns%20the%20bidirectional%20relationship.";
		s = s + "\n https://github.com/attacomsian/code-examples/tree/master/spring-data-jpa/jpa-mappings/src/main/java/com/attacomsian/jpa/many2many/domains";
		System.out.println(s);
	}
	


}

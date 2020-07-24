package com.paypal.dictionary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.paypal.payment.PaymentApplication;

@SpringBootApplication
@Configuration
@EnableWebMvc
public class DictionaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DictionaryApplication.class, args);
		String s = "DictionaryApplication";
		System.out.println(s);

	}

}

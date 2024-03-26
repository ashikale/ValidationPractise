package com.metnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidationPractiseApplication {

	public static void main(String[] args) {
		
		System.setProperty("server.port", "8081");
		SpringApplication.run(ValidationPractiseApplication.class, args);
	}

}

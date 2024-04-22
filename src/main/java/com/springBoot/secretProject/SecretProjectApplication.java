package com.springBoot.secretProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:dbConfig.properties")
public class SecretProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecretProjectApplication.class, args);
	}

}

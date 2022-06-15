package com.sparta.nosleep3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Nosleep3Application {

	public static void main(String[] args) {
		SpringApplication.run(Nosleep3Application.class, args);
	}

}

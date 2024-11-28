package com.trabalho.praticasIot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.trabalho.praticasIot.repository")
public class PraticasIotApplication {

	public static void main(String[] args) {
		SpringApplication.run(PraticasIotApplication.class, args);
	}

}

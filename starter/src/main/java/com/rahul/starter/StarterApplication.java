package com.rahul.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarterApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(StarterApplication.class);
	private PizzaConfig pizzaConfig;

	public StarterApplication(PizzaConfig pizzaConfig){
		this.pizzaConfig = pizzaConfig;
	}

	public static void main(String[] args) {
		SpringApplication.run(StarterApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		log.info(
				String.format("I want %s crust pizza,with %s and %s sauce",
						pizzaConfig.getCrust(),
						pizzaConfig.getTopping(),
						pizzaConfig.getSauce())
		);
	}
}

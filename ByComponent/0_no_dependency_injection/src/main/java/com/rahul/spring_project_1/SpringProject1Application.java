package com.rahul.spring_project_1;

import com.rahul.spring_project_1.BeanByManually.services.ColourPrinter;
import com.rahul.spring_project_1.BeanByManually.services.impl.ColourPrinterImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProject1Application implements CommandLineRunner {

	private ColourPrinter colourPrinter;

	public SpringProject1Application(ColourPrinter colourPrinter) {
		this.colourPrinter = colourPrinter;
	}

	private static final Logger log = LoggerFactory.getLogger(SpringProject1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringProject1Application.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		log.info(colourPrinter.print());
	}
}

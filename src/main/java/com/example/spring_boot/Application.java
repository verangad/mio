package com.example.springboot;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {

		@Autowired
		ItemRepository itemRepo;
		
		List<Proficiencies> itemList = new ArrayList<Proficiencies>();
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");
			itemRepo.save(new Proficiencies("0", "Guitar", "English"));

		};
	}

}
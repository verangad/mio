package com.example.spring_boot;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import com.example.spring_boot.ItemRepository;
import com.example.spring_boot.models.Proficiencies;
import com.example.spring_boot.models.Sheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Autowired
	ItemRepository itemRepo;
	@Autowired
	SheetRepository sheetRepo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		
		List<Proficiencies> itemList = new ArrayList<Proficiencies>();

		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

		};
	}

}
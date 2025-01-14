package com.example.spring_boot.controllers;

import com.example.spring_boot.ItemRepository;
import com.example.spring_boot.SheetRepository;
import com.example.spring_boot.models.Sheet;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	private final ItemRepository repository;
	private final SheetRepository sheetRepository;

	HomeController(ItemRepository repository, SheetRepository sheetRepository)
	{
		this.repository = repository;
		this.sheetRepository = sheetRepository;
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/sheet/{id}")
	public Sheet getSheet(@PathVariable String id) {
		return sheetRepository.getSheetById(id);
	}

}
package com.example.spring_boot.controllers;

import com.example.spring_boot.ItemRepository;
import com.example.spring_boot.SheetRepository;
import com.example.spring_boot.models.Sheet;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

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
	public String index(Model model) {
		model.addAttribute("sheet",  this.sheetRepository.getSheetById("0"));
		return "index";
	}

	@RequestMapping(value = "/sheet", method = RequestMethod.GET)
	public String getSheet(Model model) {
		System.out.println("TESTTTTTTTTTTTTTTTTTTTTTTT");
		model.addAttribute("Sheet", this.sheetRepository.getSheetById("0"));
		return "sheet";
	}

}
package com.example.spring_boot.controllers;

import com.example.spring_boot.ItemRepository;
import com.example.spring_boot.ISheetRepository;
import com.example.spring_boot.models.Proficiencies;
import com.example.spring_boot.models.Sheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.core.*;

@Controller
public class HomeController {
	@Autowired
	MongoTemplate mongoTemplate;

	private final ItemRepository repository;
	private final ISheetRepository sheetRepository;

	HomeController(ItemRepository repository, ISheetRepository sheetRepository)
	{
		this.repository = repository;
		this.sheetRepository = sheetRepository;
	}

	@GetMapping("/")
	public String index(Model model, @AuthenticationPrincipal OidcUser principal) {
		model.addAttribute("sheet",  this.sheetRepository.getSheetById("0"));
		return "index";
	}
}
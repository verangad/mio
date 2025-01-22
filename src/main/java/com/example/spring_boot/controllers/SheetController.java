package com.example.spring_boot.controllers;

import com.example.spring_boot.ItemRepository;
import com.example.spring_boot.SheetRepository;
import com.example.spring_boot.models.Proficiencies;
import com.example.spring_boot.models.Sheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SheetController {

    private final SheetRepository sheetRepository;

    SheetController(SheetRepository sheetRepository) {
        this.sheetRepository = sheetRepository;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Proficiencies updateProficiencies(@RequestBody Proficiencies proficiencies) {
        return proficiencies;
    }
}


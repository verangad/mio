package com.example.spring_boot.controllers;

import com.example.spring_boot.ISheetRepository;
import com.example.spring_boot.models.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SheetController {

    private final ISheetRepository sheetRepository;

    SheetController(ISheetRepository sheetRepository) {
        this.sheetRepository = sheetRepository;
    }

    @RequestMapping(value = "/getSheet/0", method = RequestMethod.GET)
    public Sheet getSheet() {
        return this.sheetRepository.getSheetById("0");
    }

    @RequestMapping(value = "/updateProficiencies", method = RequestMethod.POST)
    public void updateProficiencies(@RequestBody Proficiencies proficiencies) {

        Sheet sheet = sheetRepository.getSheetById("0");

        sheet.setProficiencies(proficiencies);
        Sheet updated = sheetRepository.save(sheet);

        if(updated != null)
            System.out.println("Successfully updated.");
        else
            System.out.println("Failed to update.");
    }

    @RequestMapping(value = "/updateSpellcasting", method = RequestMethod.POST)
    public void updateSpellcasting(@RequestBody Spellcasting spellcasting) {

        Sheet sheet = sheetRepository.getSheetById("0");

        sheet.setSpellcasting(spellcasting);
        Sheet updated = sheetRepository.save(sheet);

        if(updated != null)
            System.out.println("Successfully updated.");
        else
            System.out.println("Failed to update.");
    }

    @RequestMapping(value = "/updateSavingThrows", method = RequestMethod.POST)
    public void updateSavingThrows(@RequestBody SavingThrows savingThrows) {

        Sheet sheet = sheetRepository.getSheetById("0");

        sheet.setSavingThrows(savingThrows);
        Sheet updated = sheetRepository.save(sheet);

        if(updated != null)
            System.out.println("Successfully updated.");
        else
            System.out.println("Failed to update.");

    }

    @RequestMapping(value = "/updateBag", method = RequestMethod.POST)
    public void updateBag(@RequestBody Bag bag) {

        Sheet sheet = sheetRepository.getSheetById("0");

        sheet.setBag(bag);
        Sheet updated = sheetRepository.save(sheet);

        if(updated != null)
            System.out.println("Successfully updated.");
        else
            System.out.println("Failed to update.");

    }
}


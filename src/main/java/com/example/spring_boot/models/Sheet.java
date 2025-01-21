package com.example.spring_boot.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Sheet")
public class Sheet {

    @Id
    private String id;
    private Proficiencies proficiencies;
    private Bag bag;
    private Skills skills;
    private Stats stats;
    private Details details;
    private SavingThrows savingThrows;
    private Spellcasting spellcasting;

    public Sheet(String id)
    {
        this.id = id;
        this.proficiencies = new Proficiencies();
        this.bag = new Bag();
        this.skills = new Skills();
        this.stats = new Stats();
        this.details = new Details();
        this.savingThrows = new SavingThrows();
        this.spellcasting = new Spellcasting();
    }

    public String getId()
    {
        return this.id;
    }
    public Proficiencies getProficiencies() { return this.proficiencies; }
    public Bag getBag()
    {
        return this.bag;
    }
    public Skills getSkills()
    {
        return this.skills;
    }
    public Stats getStats() { return this.stats; }
    public Details getDetails() { return this.details; }
    public SavingThrows getSavingThrows()
    {
        return this.savingThrows;
    }
    public Spellcasting getSpellcasting()
    {
        return this.spellcasting;
    }

    public void setId(String id)
    {
        this.id = id;
    }
    public void setProficiencies(Proficiencies proficiencies)
    {
        this.proficiencies = proficiencies;
    }
    public void setBag(Bag bag) { this.bag = bag; }
    public void setSkills(Skills skills) { this.skills = skills; }
    public void setStats(Stats stats) { this.stats = stats; }
    public void setDetails(Details details) { this.details = details; }
    public void setSavingThrows(SavingThrows savingThrows) { this.savingThrows = savingThrows; }
    public void setSpellcasting(Spellcasting spellcasting) { this.spellcasting = spellcasting; }

    public String toString()
    {
        return this.getId() + "\n" + this.getProficiencies().toString();
    }
}

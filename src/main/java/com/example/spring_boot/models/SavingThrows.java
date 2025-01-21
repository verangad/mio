package com.example.spring_boot.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("SavingThrows")
public class SavingThrows {

    private Tuple<String, Boolean> strength;
    private Tuple<String, Boolean> dexterity;
    private Tuple<String, Boolean> constitution;
    private Tuple<String, Boolean> intelligence;
    private Tuple<String, Boolean> wisdom;
    private Tuple<String, Boolean> charisma;

    public SavingThrows()
    {
        this.strength = new Tuple<>("+0",false);
        this.dexterity = new Tuple<>("+0",false);
        this.constitution = new Tuple<>("+0",false);
        this.intelligence = new Tuple<>("+0",false);
        this.wisdom = new Tuple<>("+0",false);
        this.charisma = new Tuple<>("+0",false);
    }

    public Tuple<String, Boolean> getStrength() { return this.strength; }
    public Tuple<String, Boolean> getDexterity() { return this.dexterity; }
    public Tuple<String, Boolean> getConstitution() { return this.constitution; }
    public Tuple<String, Boolean> getIntelligence() { return this.intelligence; }
    public Tuple<String, Boolean> getWisdom() { return this.wisdom; }
    public Tuple<String, Boolean> getCharisma() { return this.charisma; }

    public void setStrength(Tuple<String, Boolean> strength)
    {
        this.strength = strength;
    }
    public void setDexterity(Tuple<String, Boolean> dexterity)
    {
        this.dexterity = dexterity;
    }
    public void setConstitution(Tuple<String, Boolean> constitution)
    {
        this.constitution = constitution;
    }
    public void setIntelligence(Tuple<String, Boolean> intelligence)
    {
        this.intelligence = intelligence;
    }
    public void setWisdom(Tuple<String, Boolean> wisdom)
    {
        this.wisdom = wisdom;
    }
    public void setCharisma(Tuple<String, Boolean> charisma)
    {
        this.charisma = charisma;
    }
}

package com.example.spring_boot.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Sheet")
public class Stats {

    private String proficiencyBonus;
    private Tuple<String, String> strength;
    private Tuple<String, String> dexterity;
    private Tuple<String, String> constitution;
    private Tuple<String, String> intelligence;
    private Tuple<String, String> wisdom;
    private Tuple<String, String> charisma;

    private String armorClass;
    private String initiative;
    private String speed;
    private Tuple<String, String> hitDice;

    private Tuple<String, String> health;
    private String tempHealth;

    public Stats()
    {
        this.proficiencyBonus = "+0";
        this.strength = new Tuple<>("+0", "0");
        this.dexterity = new Tuple<>("+0", "0");
        this.constitution = new Tuple<>("+0", "0");
        this.intelligence = new Tuple<>("+0", "0");
        this.wisdom = new Tuple<>("+0", "0");
        this.charisma = new Tuple<>("+0", "0");

        this.armorClass = "12";
        this.initiative = "10";
        this.speed = "20ft";
        this.hitDice = new Tuple<>("0", "3d8");

        this.health = new Tuple<>("10", "10");
        this.tempHealth = "0";
    }

    public String getProficiencyBonus() {
        return this.proficiencyBonus;
    }

    public Tuple<String, String> getStrength() {
        return this.strength;
    }
    public Tuple<String, String> getDexterity() {
        return this.dexterity;
    }
    public Tuple<String, String> getConstitution() {
        return this.constitution;
    }
    public Tuple<String, String> getIntelligence() {
        return this.intelligence;
    }
    public Tuple<String, String> getWisdom() {
        return this.wisdom;
    }
    public Tuple<String, String> getCharisma() {
        return this.charisma;
    }

    public String getArmorClass() {
        return this.armorClass;
    }
    public String getInitiative() {
        return this.initiative;
    }
    public String getSpeed() {
        return this.speed;
    }
    public Tuple<String, String> getHitDice() {
        return this.hitDice;
    }

    public Tuple<String, String> getHealth() {
        return this.health;
    }
    public String getTempHealth() {
        return this.tempHealth;
    }

    public void setProficiencyBonus(String proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public void setStrength(Tuple<String, String> strength) {
        this.strength = strength;
    }
    public void setDexterity(Tuple<String, String> dexterity) {
        this.dexterity = dexterity;
    }
    public void setConstitution(Tuple<String, String> constitution) {
        this.constitution = constitution;
    }
    public void setIntelligence(Tuple<String, String> intelligence) {
        this.intelligence = intelligence;
    }
    public void setWisdom(Tuple<String, String> wisdom) {
        this.wisdom = wisdom;
    }
    public void setCharisma(Tuple<String, String> charisma) {
        this.charisma = charisma;
    }

    public void setArmorClass(String armorClass) {
        this.armorClass = armorClass;
    }
    public void setInitiative(String initiative) {
        this.initiative = initiative;
    }
    public void setSpeed(String speed) {
        this.speed = speed;
    }
    public void setHitDice(Tuple<String, String> hitDice) {
        this.hitDice = hitDice;
    }

    public void setHealth(Tuple<String, String> health) {
        this.health = health;
    }
    public void setTempHealth(String tempHealth) {
        this.tempHealth = tempHealth;
    }
}

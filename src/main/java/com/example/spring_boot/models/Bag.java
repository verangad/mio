package com.example.spring_boot.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document("Bag")
public class Bag {

    private String contents;
    private String copper;
    private String silver;
    private String gold;
    private String electrum;
    private String platinum;

    private ArrayList<Weapon> weapons;

    public Bag()
    {
        this.contents = "Default Bag";
        this.copper = "10";
        this.silver = "11";
        this.gold = "12";
        this.electrum = "13";
        this.platinum = "14";
        this.weapons = new ArrayList<Weapon>();
        this.weapons.add(new Weapon());
        this.weapons.add(new Weapon());
    }

    public String getContents() { return this.contents; }
    public String getCopper() { return this.copper; }
    public String getSilver() { return this.silver; }
    public String getGold() { return this.gold; }
    public String getElectrum() { return this.electrum; }
    public String getPlatinum() { return this.platinum; }

    public ArrayList<Weapon> getWeapons() { return this.weapons; }

    public void setContents(String contents)
    {
        this.contents = contents;
    }
    public void setCopper(String copper) { this.copper = copper; }
    public void setSilver(String silver) { this.silver = silver; }
    public void setGold(String gold) { this.gold = gold; }
    public void setElectrum(String electrum) { this.electrum = electrum; }
    public void setPlatinum(String platinum) { this.platinum = platinum; }

    public void setWeapons(ArrayList<Weapon> weapons) { this.weapons = weapons; }
}

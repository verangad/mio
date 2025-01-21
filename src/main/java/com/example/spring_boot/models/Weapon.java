package com.example.spring_boot.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Weapon")
public class Weapon {

    private String name;
    private String attack;
    private String damage;
    private String type;

    public Weapon()
    {
        this.name = "sword";
        this.attack = "4";
        this.damage = "1d4";
        this.type = "slash";
    }

    public String getName() { return this.name; }
    public String getAttack() { return this.attack; }
    public String getDamage() { return this.damage; }
    public String getType() { return this.type; }

    public void setName(String name) { this.name = name; }
    public void setAttack(String attack) { this.attack = attack; }
    public void setDamage(String damage) { this.damage = damage; }
    public void setType(String type) { this.type = type; }
}

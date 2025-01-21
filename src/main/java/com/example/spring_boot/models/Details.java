package com.example.spring_boot.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Details")
public class Details {
    private String characterName;
    private String atName;
    private String age;
    private String height;
    private String weight;

    private String followers;
    private String classType;
    private String level;
    private String race;
    private String alignment;

    public Details()
    {
        this.characterName = "Name";
        this.atName = "random_name";
        this.age = "20";
        this.height = "5' 7\"";
        this.weight = "120lbs";

        this.followers = "10";
        this.classType = "Mage";
        this.level = "5";
        this.race = "Human";
        this.alignment = "Neutral";
    }

    public String getCharacterName() {
        return this.characterName;
    }
    public String getAtName() {
        return this.atName;
    }
    public String getAge() {
        return this.age;
    }
    public String getHeight() {
        return this.height;
    }
    public String getWeight() {
        return this.weight;
    }
    public String getFollowers() {
        return this.followers;
    }
    public String getClassType() {
        return this.classType;
    }
    public String getLevel() {
        return this.level;
    }
    public String getRace() {
        return this.race;
    }
    public String getAlignment() {
        return this.alignment;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
    public void setAtName(String atName) {
        this.atName = atName;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setFollowers(String followers) { this.followers = followers; }
    public void setClassType(String classType) {
        this.classType = classType;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

}

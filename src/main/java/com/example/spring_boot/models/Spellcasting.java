package com.example.spring_boot.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Spellcasting")
public class Spellcasting {

    private Tuple<String, String> scAbility;
    private Tuple<String, String> spellDC;
    private Tuple<String, String> atkBonus;

    public Spellcasting()
    {
        this.scAbility = new Tuple<>("+0","0");
        this.spellDC = new Tuple<>("+0","0");
        this.atkBonus = new Tuple<>("+0","0");
    }

    public Tuple<String, String> getScAbility() { return this.scAbility; }
    public Tuple<String, String> getSpellDC() { return this.spellDC; }
    public Tuple<String, String> getAtkBonus() { return this.atkBonus; }

    public void setStrength(Tuple<String, String> getScAbility)
    {
        this.scAbility = getScAbility;
    }
    public void setDexterity(Tuple<String, String> getSpellDC)
    {
        this.spellDC = getSpellDC;
    }
    public void setConstitution(Tuple<String, String> getAtkBonus)
    {
        this.atkBonus = getAtkBonus;
    }
}

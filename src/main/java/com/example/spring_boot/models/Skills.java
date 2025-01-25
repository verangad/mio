package com.example.spring_boot.models;


public class Skills {
    private Tuple<String, Boolean> acrobatics;
    private Tuple<String, Boolean> animalHandling;
    private Tuple<String, Boolean> arcana;
    private Tuple<String, Boolean> athletics;
    private Tuple<String, Boolean> deception;
    private Tuple<String, Boolean> history;
    private Tuple<String, Boolean> insight;
    private Tuple<String, Boolean> intimidation;
    private Tuple<String, Boolean> investigation;
    private Tuple<String, Boolean> medicine;
    private Tuple<String, Boolean> nature;
    private Tuple<String, Boolean> navigation;
    private Tuple<String, Boolean> perception;
    private Tuple<String, Boolean> performance;
    private Tuple<String, Boolean> persuasion;
    private Tuple<String, Boolean> religion;
    private Tuple<String, Boolean> sleightOfHand;
    private Tuple<String, Boolean> stealth;
    private Tuple<String, Boolean> survival;
    private Tuple<String, Boolean> passiveWisdom;

    public Skills()
    {
        this.acrobatics = new Tuple<>("+1",true);
        this.animalHandling = new Tuple<>("+0",false);
        this.arcana = new Tuple<>("+0",false);
        this.athletics = new Tuple<>("+0",false);
        this.deception = new Tuple<>("+0",false);
        this.history = new Tuple<>("+0",false);
        this.insight = new Tuple<>("+0",false);
        this.intimidation = new Tuple<>("+0",false);
        this.investigation = new Tuple<>("+0",false);
        this.medicine = new Tuple<>("+0",false);
        this.nature = new Tuple<>("+0",false);
        this.navigation = new Tuple<>("+0",false);
        this.perception = new Tuple<>("+0",false);
        this.performance = new Tuple<>("+0",false);
        this.persuasion = new Tuple<>("+0",false);
        this.religion = new Tuple<>("+0",false);
        this.sleightOfHand = new Tuple<>("+0",false);
        this.stealth = new Tuple<>("+0",false);
        this.survival = new Tuple<>("+0",false);
        this.passiveWisdom = new Tuple<>("+0",false);
    }

    public Tuple<String, Boolean> getAcrobatics() { return this.acrobatics; }
    public Tuple<String, Boolean> getAnimalHandling() { return this.animalHandling; }
    public Tuple<String, Boolean> getArcana() { return this.arcana; }
    public Tuple<String, Boolean> getAthletics() { return this.athletics; }
    public Tuple<String, Boolean> getDeception() { return this.deception; }
    public Tuple<String, Boolean> getHistory() { return this.history; }
    public Tuple<String, Boolean> getInsight() { return this.insight; }
    public Tuple<String, Boolean> getIntimidation() { return this.intimidation; }
    public Tuple<String, Boolean> getInvestigation() { return this.investigation; }
    public Tuple<String, Boolean> getMedicine() { return this.medicine; }
    public Tuple<String, Boolean> getNature() { return this.nature; }
    public Tuple<String, Boolean> getNavigation() { return this.navigation; }
    public Tuple<String, Boolean> getPerception() { return this.perception; }
    public Tuple<String, Boolean> getPerformance() { return this.performance; }
    public Tuple<String, Boolean> getPersuasion() { return this.persuasion; }
    public Tuple<String, Boolean> getReligion() { return this.religion; }
    public Tuple<String, Boolean> getSleightOfHand() { return this.sleightOfHand; }
    public Tuple<String, Boolean> getStealth() { return this.stealth; }
    public Tuple<String, Boolean> getSurvival() { return this.survival; }
    public Tuple<String, Boolean> getPassiveWisdom() { return this.passiveWisdom; }

    public void setAcrobatics(Tuple<String, Boolean> acrobatics)
    {
        this.acrobatics = acrobatics;
    }
    public void setAnimalHandling(Tuple<String, Boolean> animalHandling)
    {
        this.animalHandling = animalHandling;
    }
    public void setArcana(Tuple<String, Boolean> arcana)
    {
        this.arcana = arcana;
    }
    public void setAthletics(Tuple<String, Boolean> athletics)
    {
        this.athletics = athletics;
    }
    public void setDeception(Tuple<String, Boolean> deception)
    {
        this.deception = deception;
    }
    public void setHistory(Tuple<String, Boolean> history)
    {
        this.history = history;
    }
    public void setInsight(Tuple<String, Boolean> insight)
    {
        this.insight = insight;
    }
    public void setIntimidation(Tuple<String, Boolean> intimidation)
    {
        this.intimidation = intimidation;
    }
    public void setInvestigation(Tuple<String, Boolean> investigation)
    {
        this.investigation = investigation;
    }
    public void setMedicine(Tuple<String, Boolean> medicine)
    {
        this.medicine = medicine;
    }
    public void setNature(Tuple<String, Boolean> nature)
    {
        this.nature = nature;
    }
    public void setNavigation(Tuple<String, Boolean> navigation)
    {
        this.navigation = navigation;
    }
    public void setPerception(Tuple<String, Boolean> perception)
    {
        this.perception = perception;
    }
    public void setPerformance(Tuple<String, Boolean> performance)
    {
        this.performance = performance;
    }
    public void setPersuasion(Tuple<String, Boolean> persuasion)
    {
        this.persuasion = persuasion;
    }
    public void setReligion(Tuple<String, Boolean> religion)
    {
        this.religion = religion;
    }
    public void setSleightOfHand(Tuple<String, Boolean> sleightOfHand)
    {
        this.sleightOfHand = sleightOfHand;
    }
    public void setStealth(Tuple<String, Boolean> stealth)
    {
        this.stealth = stealth;
    }
    public void setSurvival(Tuple<String, Boolean> survival)
    {
        this.survival = survival;
    }
    public void setPassiveWisdom(Tuple<String, Boolean> passiveWisdom)
    {
        this.passiveWisdom = passiveWisdom;
    }
}

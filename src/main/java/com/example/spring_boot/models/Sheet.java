package com.example.spring_boot.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Sheet")
public class Sheet {

    @Id
    private String id;
    private Proficiencies proficiencies;

    public String getId()
    {
        return this.id;
    }

    public Proficiencies getProficiencies()
    {
        return this.proficiencies;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public void setProficiencies(Proficiencies proficiencies)
    {
        this.proficiencies = proficiencies;
    }
}

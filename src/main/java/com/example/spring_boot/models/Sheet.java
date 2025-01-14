package com.example.spring_boot.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Sheet")
public class Sheet {

    @Id
    private String id;
    private Proficiencies proficiencies;

    public Sheet(String id, Proficiencies proficiencies) {
        super();
        this.id = id;
        this.proficiencies = proficiencies;
    }
}

package com.example.spring_boot.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("User")
public class User {

    @Id
    private String id;
    private Sheet sheet;

    public User(String id, Sheet sheet) {
        super();
        this.id = id;
        this.sheet = sheet;
    }
}
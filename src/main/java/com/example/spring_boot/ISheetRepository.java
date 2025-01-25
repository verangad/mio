package com.example.spring_boot;

import com.example.spring_boot.models.Proficiencies;
import com.example.spring_boot.models.Sheet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ISheetRepository extends MongoRepository<Sheet, String> {

    @Query("{id:'?0'}")
    Sheet getSheetById(String id);

    public long count();
}

package com.example.spring_boot;

import com.example.spring_boot.models.Proficiencies;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ItemRepository extends MongoRepository<Proficiencies, String> {
	
	@Query("{id:'?0'}")
	Proficiencies findItemById(String id);
	
	public long count();
}

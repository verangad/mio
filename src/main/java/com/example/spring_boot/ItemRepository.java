package com.example.spring_boot;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.core.mapping.Query;

public interface ItemRepository extends MongoRepository<Proficiencies, String> {
	
	@Query("{id:'?0'}")
	Proficiencies findItemById(String id);
	
	public long count();
}

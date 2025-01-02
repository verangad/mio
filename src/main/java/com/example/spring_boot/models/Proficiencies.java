package com.example.spring_boot.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Proficiencies")
public class Proficiencies {

		@Id
		private String id;

		private String proficiencies;
		private String languages;
		
		public Proficiencies(String id, String proficiencies, String languages) {
			super();
			this.id = id;
			this.proficiencies = proficiencies;
			this.languages = languages;
		}
}
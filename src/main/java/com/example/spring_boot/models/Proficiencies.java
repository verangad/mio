package com.example.spring_boot.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Proficiencies")
public class Proficiencies {

	@Id
	private String id;

	private String proficiencies;
	private String languages;

	public String getId()
	{
		return this.id;
	}

	public String getProficiencies()
	{
		return this.proficiencies;
	}

	public String getLanguages()
	{
		return this.languages;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public void setProficiencies(String proficiencies)
	{
		this.proficiencies = proficiencies;
	}

	public void setLanguages(String languages)
	{
		this.languages = languages;
	}
}
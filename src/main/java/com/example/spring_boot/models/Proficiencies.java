package com.example.spring_boot.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Proficiencies")
public class Proficiencies {

	private String proficiencies;
	private String languages;

	public Proficiencies()
	{
		this.proficiencies = "Default proficiencies";
		this.languages = "Default languages";
	}

	public String getProficiencies()
	{
		return this.proficiencies;
	}

	public String getLanguages()
	{
		return this.languages;
	}

	public void setProficiencies(String proficiencies)
	{
		this.proficiencies = proficiencies;
	}

	public void setLanguages(String languages)
	{
		this.languages = languages;
	}

	public String toString()
	{
		return this.getProficiencies() + "\n" + this.getLanguages() + "\n";
	}
}
package com.paypal.dictionary.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dictionary")
public class Dictionary {
	
	public Long id;
	public String name;
	public String meaning;
	public String language;
	public Dictionary(Long id, String name, String meaning, String language) {
		super();
		this.id = id;
		this.name = name;
		this.meaning = meaning;
		this.language = language;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

}

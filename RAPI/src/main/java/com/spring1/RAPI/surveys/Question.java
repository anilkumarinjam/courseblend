package com.spring1.RAPI.surveys;

import java.util.List;

public class Question {
	private String id;
	private String description;
	private List<String> options;
	private String correctoption;
	public Question(String id, String description, List<String> options, String correctoption) {
		super();
		this.id = id;
		this.description = description;
		this.options = options;
		this.correctoption = correctoption;
	}
	public Question() {
		
	}
	public String getId() {
		return id;
	}
	public String getDescription() {
		return description;
	}
	public List<String> getOptions() {
		return options;
	}
	public String getCorrectoption() {
		return correctoption;
	}
	
	
}

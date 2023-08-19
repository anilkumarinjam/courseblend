package com.spring1.RAPI.surveys;

import java.util.ArrayList;

public class Survey {
	String id;
	String title;
	String description;
	ArrayList<Question> questions;
	public Survey(String id, String title, String description, ArrayList<Question> questions) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.questions = questions;
	}
	
	public Survey() {
		
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

	@Override
	public String toString() {
		return "Survey [id=" + id + ", title=" + title + ", description=" + description + ", questions=" + questions
				+ "]";
	}
	

}

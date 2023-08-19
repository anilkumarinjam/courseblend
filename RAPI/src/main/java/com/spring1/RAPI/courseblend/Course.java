package com.spring1.RAPI.courseblend;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Course {
	@Id
	private String courseid;
	private String coursename;
	
	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Instructor> instructors;
	
	private String completed;
	
	@ManyToOne
    @JoinColumn(name = "studentid")
	@JsonBackReference
    private Student student;
	
	public Course() {
		
	}

	public Course(String courseid, String coursename, List<Instructor> instructors, String completed, Student student) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.instructors = instructors;
		this.completed = completed;
		this.student = student;
	}

	public String getCourseid() {
		return courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public List<Instructor> getInstructors() {
		return instructors;
	}

	public String getCompleted() {
		return completed;
	}

	public Student getStudent() {
		return student;
	}

	
	
	
}

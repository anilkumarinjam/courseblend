package com.spring1.RAPI.courseblend;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private String studentid;
	private String studentname;
	
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    @JsonManagedReference
	private List<Course> courses;
	
	public Student() {}

	public Student(String studentid, String studentname, ArrayList<Course> courses) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.courses = courses;
	}

	public String getStudentid() {
		return studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
}

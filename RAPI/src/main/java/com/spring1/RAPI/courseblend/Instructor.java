package com.spring1.RAPI.courseblend;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Instructor {

	@Id
	private String iid;
	private String iname;
	
	@ManyToOne
    @JoinColumn(name = "courseid")
	@JsonBackReference
	private Course course;
	
	public Instructor() {}

	public Instructor(String iid, String iname, Course course) {
		super();
		this.iid = iid;
		this.iname = iname;
		this.course = course;
	}

	public String getIid() {
		return iid;
	}

	public String getIname() {
		return iname;
	}

	public Course getCourse() {
		return course;
	}

	public void setIid(String iid) {
		this.iid = iid;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	
}

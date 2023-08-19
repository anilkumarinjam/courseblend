package com.spring1.RAPI.courseblend;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
public class StudentResource {

	@Autowired
	StudentRepository sr;
	@Autowired
	InstructorRepository ir;
	@Autowired
	CourseRepository cr;
	
	@GetMapping("/students")
	public List<Student> students(){
		return sr.findAll();
	}
	
	@GetMapping("/students/{student_id}")
	public Optional<Student> student(@PathVariable String student_id){
		Optional<Student> s=sr.findById(student_id);
		if(s.equals(Optional.empty())) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		else {
			return s;

		}
	}
	
	@PostMapping("/students/{courseid}/addinstructor")
	public void addinstructor(@PathVariable String courseid,@RequestBody Instructor i) {
		Course course=cr.findById(courseid).orElse(null);
		i.setCourse(course);
		ir.save(i);
	}
	
	@DeleteMapping("/students/{studentid}")
	public void deletestudent(@PathVariable String studentid) {
		sr.deleteById(studentid);
	}
	
	@PutMapping("/students/{studentid}/updatestudent")
	public void updatestudent(@PathVariable String studentid,@RequestBody Student updatestudent) {
		Student student=sr.findById(studentid).orElse(null);
		student.setStudentname(updatestudent.getStudentname());
		sr.save(student);
	}
	
}

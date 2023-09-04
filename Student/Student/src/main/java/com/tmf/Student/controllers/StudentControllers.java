package com.tmf.Student.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmf.Student.entities.Student;
import com.tmf.Student.services.StudentService;
@RestController
@RequestMapping("/student")
public class StudentControllers {
	@Autowired
	private StudentService service;
	
	@GetMapping({"/","/Allstudent"})
	public List<Student> getCourses() {
	return service.allStudent();
	}

		@PostMapping("/addstudent")
		public Student addStudent(@RequestBody Student student) {
			return service.addStudent(student);
		}
		
		@GetMapping("/displaystudent/{id}")
		public Student displayStudent(@PathVariable("id")long id) {
			return service.displaystudent(id);
		}
		
		@PutMapping("/updatestudent/{id}")
		public Student updateStudent(@PathVariable("id")long id,@RequestBody Student student) {
			Student s = service.displaystudent(id);
			//s.setStudentName(Student.getStudentName());
			return service.updateStudent(s);
		}
		}
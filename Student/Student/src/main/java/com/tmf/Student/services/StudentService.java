package com.tmf.Student.services;
import java.util.List;

import com.tmf.Student.entities.Student;

public interface StudentService {
	Student addStudent(Student student);
	Student updateStudent(Student student);
	void deleteStudent(Student student);
	List<Student> allStudent();
	Student displaystudent(long StudentId);
	
}

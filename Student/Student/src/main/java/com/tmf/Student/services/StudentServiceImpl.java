package com.tmf.Student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmf.Student.entities.Student;
import com.tmf.Student.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository dao;
	@Override
	public Student addStudent(Student student) {
		return dao.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.save(student);
	}

	@Override
	public void deleteStudent(Student student) {
	 dao.delete(student);
	}

	@Override
	public List<Student> allStudent() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Student displaystudent(long StudentId) {
		// TODO Auto-generated method stub
		return dao.findById(StudentId).get();
	}

}

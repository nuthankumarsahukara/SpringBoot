package com.tmf.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tmf.Student.entities.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long > {
	

}

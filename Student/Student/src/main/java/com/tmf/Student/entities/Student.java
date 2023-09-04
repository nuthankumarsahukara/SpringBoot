package com.tmf.Student.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Student {
	@Id
	@SequenceGenerator(
			name = "sid_seq",
			initialValue = 100001,
			allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long studentId;
	private String studentName;
	private String studentAddress;
	private Date studentDob;
	private long studentPhn;
	public Student() {
		
	}
	public Student(long studentId, String studentName, String studentAddress, Date studentDob, long studentPhn) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentDob = studentDob;
		this.studentPhn = studentPhn;
		
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Date getStudentDob() {
		return studentDob;
	}
	public void setStudentDob(Date studentDob) {
		this.studentDob = studentDob;
	}
	public long getStudentPhn() {
		return studentPhn;
	}
	public void setStudentPhn(long studentPhn) {
		this.studentPhn = studentPhn;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentDob=" + studentDob + ", studentPhn=" + studentPhn + "]";
	}
	
}

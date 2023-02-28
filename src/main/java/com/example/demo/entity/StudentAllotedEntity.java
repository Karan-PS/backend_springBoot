package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="allotted_student")
public class StudentAllotedEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String studentName;
	private String course;
	
	
	
	
	public StudentAllotedEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StudentAllotedEntity(String studentName, String course) {
		super();
		this.studentName = studentName;
		this.course = course;
	}
	
	
	public StudentAllotedEntity(int id, String studentName, String course) {
		super();
		Id = id;
		this.studentName = studentName;
		this.course = course;
	}


	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
}

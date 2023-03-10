package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="notRequired_AE")
public class AllotmentEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String studentName;
	private String course;
	private String marks;
	
	public AllotmentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AllotmentEntity(String studentName, String course, String marks) {
		super();
		this.studentName = studentName;
		this.course = course;
		this.marks = marks;
	}

	public AllotmentEntity(int id, String studentName, String course, String marks) {
		super();
		Id = id;
		this.studentName = studentName;
		this.course = course;
		this.marks = marks;
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

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}
	
	
}

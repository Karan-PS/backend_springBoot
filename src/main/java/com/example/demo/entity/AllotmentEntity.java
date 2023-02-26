package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="allotment")
public class AllotmentEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String course;
	private String marks;
	
	public AllotmentEntity() {
		super();
	}

	public AllotmentEntity(String course, String marks) {
		super();
		this.course = course;
		this.marks = marks;
	}

	public AllotmentEntity(int id, String course, String marks) {
		super();
		Id = id;
		this.course = course;
		this.marks = marks;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

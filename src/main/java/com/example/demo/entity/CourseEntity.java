package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CourseEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	private String course;
	private String college;
	private String availableSeats;
	
	public CourseEntity() {
		super();
	}

	public CourseEntity(String course, String college, String availableSeats) {
		super();
		this.course = course;
		this.college = college;
		this.availableSeats = availableSeats;
	}

	public CourseEntity(int id, String course, String college, String availableSeats) {
		super();
		Id = id;
		this.course = course;
		this.college = college;
		this.availableSeats = availableSeats;
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

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(String availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	
}

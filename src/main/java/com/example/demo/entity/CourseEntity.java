package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class CourseEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	private String course;
	private String college;
	private String availableSeats;
	private String minMarks;
	
	public CourseEntity() {
		super();
	}

	

	public String getMinMarks() {
		return minMarks;
	}



	public void setMinMarks(String minMarks) {
		this.minMarks = minMarks;
	}



	public CourseEntity(String course, String college, String availableSeats, String minMarks) {
		super();
		this.course = course;
		this.college = college;
		this.availableSeats = availableSeats;
		this.minMarks = minMarks;
	}



	public CourseEntity(int id, String course, String college, String availableSeats, String minMarks) {
		super();
		Id = id;
		this.course = course;
		this.college = college;
		this.availableSeats = availableSeats;
		this.minMarks = minMarks;
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

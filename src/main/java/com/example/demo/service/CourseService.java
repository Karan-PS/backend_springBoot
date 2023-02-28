package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CourseEntity;
import com.example.demo.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepository;
	
//	@Autowired
//	AllotmentRepository allotmentRepository;
	
	public CourseEntity saveCourse(CourseEntity course) {
		return courseRepository.save(course);
	}
	
	public List<CourseEntity> displayCourse(){
		return (List<CourseEntity>)courseRepository.findAll();
	}
	
//	public AllotmentEntity saveStudentCourseandMarks(AllotmentEntity allotment) {
//		return allotmentRepository.save(allotment);
//	}

}

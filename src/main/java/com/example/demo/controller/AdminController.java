package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AdminEntity;
import com.example.demo.entity.AllotmentEntity;
import com.example.demo.entity.CourseEntity;
import com.example.demo.service.AdminService;
import com.example.demo.service.CourseService;

@RestController
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@Autowired
	CourseService courseService;
	
	//Admin Registration Function
	@PostMapping("/adminRegistration")
	public boolean registerAdmin(@RequestBody AdminEntity admin) {
		AdminEntity adminObj = null;
		String tempName = admin.getName();
		if(tempName != null && !"".equals(tempName)) {
			adminObj = adminService.fetchByName(tempName);
			if(adminObj != null ) {
				return false;
			}
		}else {
				return false;
			}
			adminObj = adminService.saveAdmin(admin);
			return true;
	}
	
	//Admin Login function
	@PostMapping("/adminLogin")
	public boolean loginAdmin(@RequestBody AdminEntity admin) {
		String tempName = admin.getName();
		String tempPassword = admin.getPassword();
		AdminEntity adminObj = null;
		
		if(tempName != null && tempPassword != null) {
			adminObj = adminService.fetchByNameAndPassword(tempName, tempPassword);
		}
		
		if(adminObj == null) {
			return false;
		}
		return true;
	}
	
	
	//Save Course,College,Available Seat
	@PostMapping("/saveCourse")
	public boolean saveCourse(@RequestBody CourseEntity course) {
		courseService.saveCourse(course);
		return true;
	}
	
	//Display All Courses
	@GetMapping("/getCourse")
	public List<CourseEntity> displayCourse() {
		 List<CourseEntity> list = courseService.displayCourse();
		return list;	
	}
	
	//Allotment save Course,Marks
	@PostMapping("/saveStudentMarks")
	public boolean saveStudentMarks(@RequestBody AllotmentEntity allotment) {
		 courseService.saveStudentCourseandMarks(allotment);
		return true;
	}
		
}

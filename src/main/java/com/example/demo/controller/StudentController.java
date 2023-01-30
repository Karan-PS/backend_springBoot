package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
//	@RequestMapping("/")
//	public String hello() {
//		return "Hello";
//	}
	
	//Student Registration function
	@PostMapping("/studentRegintration")
	public boolean registerStudent(@RequestBody StudentEntity student){
		StudentEntity studentObj = null;
		String tempName = student.getName();
		if(tempName != null && !"".equals(tempName)) {
			studentObj = studentService.fetchByName(tempName);
			if(studentObj != null) {
				return false;
			}
		}else {
			return false;
		}
		studentObj = studentService.saveStudent(student);
		return true;
	}
	
	//Student Login Function
	@PostMapping("/studentLogin")
	public boolean loginStudent(@RequestBody StudentEntity student) {
		String tempName = student.getName();
		String tempPassword = student.getPassword();
		StudentEntity studentObj = null;
		
		if(tempName != null && tempPassword != null) {
			studentObj = studentService.fetchByNameAndPassword(tempName, tempPassword);
		}
		
		if(studentObj == null) {
			return false;
		}
		return true;
		
	}
}

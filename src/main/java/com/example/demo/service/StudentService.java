package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public StudentEntity saveStudent(StudentEntity student) {
		return studentRepository.save(student);
	}
	
	public StudentEntity fetchByName(String name) {
		return studentRepository.findByName(name);
	}
	
	public StudentEntity fetchByNameAndPassword(String name, String password) {
		return studentRepository.findByNameAndPassword(name, password);
	}
}

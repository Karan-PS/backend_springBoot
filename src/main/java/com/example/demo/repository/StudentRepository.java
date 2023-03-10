package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

	public StudentEntity findByName(String name);
	
	public StudentEntity findByNameAndPassword(String name,String Password);
}

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.AdminEntity;

public interface AdminRepository extends JpaRepository<AdminEntity, Integer> {

	public AdminEntity findByName(String name);
	
	public AdminEntity findByNameAndPassword(String name,String Password);
}

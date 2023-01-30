package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AdminEntity;
import com.example.demo.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	public AdminEntity saveAdmin(AdminEntity admin) {
		return adminRepository.save(admin);
	}
	
	public AdminEntity fetchByName(String name) {
		return adminRepository.findByName(name);
	}
	
	public AdminEntity fetchByNameAndPassword(String name,String password) {
		return adminRepository.findByNameAndPassword(name, password);
	}
}

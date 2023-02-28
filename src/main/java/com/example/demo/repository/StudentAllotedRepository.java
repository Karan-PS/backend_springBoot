package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StudentAllotedEntity;

public interface StudentAllotedRepository extends JpaRepository<StudentAllotedEntity, Integer> {

}

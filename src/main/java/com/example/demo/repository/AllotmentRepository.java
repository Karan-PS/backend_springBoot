package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.AllotmentEntity;

public interface AllotmentRepository extends JpaRepository<AllotmentEntity, Integer> {

}

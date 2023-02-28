package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {

	@Query("select minMarks from CourseEntity c where c.course = ?1" )
	public String getMarksByCourse(String courseName);
	
	@Query("select availableSeats from CourseEntity c where c.course = ?1")
	public String getSeats(String courseName);
	
	 @Modifying
	 @Transactional
	 @Query("update CourseEntity c set c.availableSeats = :newSeats WHERE c.course = :courseName")
	 void updateSeatsByCourse(@Param("newSeats") String newSeats,@Param("courseName") String courseName );

}

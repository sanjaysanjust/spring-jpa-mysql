package com.example.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysql.entity.CourseWithManyToOneRealtionship;

public interface CourseRepositoryWithManyToOneRealtionship extends JpaRepository<CourseWithManyToOneRealtionship, Long> {

}

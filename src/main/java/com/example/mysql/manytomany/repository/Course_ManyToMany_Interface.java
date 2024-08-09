package com.example.mysql.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysql.manytomany.CourseManyToMany;

public interface Course_ManyToMany_Interface extends JpaRepository<CourseManyToMany, Long>{

}

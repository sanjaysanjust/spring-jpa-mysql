package com.example.mysql.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysql.manytomany.StudentManyToMany;

public interface Student_ManyToMany_Interface extends JpaRepository<StudentManyToMany, Long> {

}

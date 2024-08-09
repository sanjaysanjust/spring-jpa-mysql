package com.example.mysql.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysql.onetomany.Department;

public interface Department_Interface extends JpaRepository<Department, Long>{

}

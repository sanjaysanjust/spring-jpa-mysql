package com.example.mysql.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysql.onetomany.Employee;

public interface Employee_interface extends JpaRepository<Employee, Long>{

}

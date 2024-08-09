package com.example.mysql.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mysql.mapping.Person;

@Repository
public interface PersonInterface extends JpaRepository<Person, Long>{

}

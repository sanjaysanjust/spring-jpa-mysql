package com.example.mysql.manytomany;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class StudentManyToMany {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@ManyToMany(mappedBy = "students")
	private Set<CourseManyToMany>  courses = new HashSet<>();
	
	
	public Set<CourseManyToMany> getCourses() {
		return courses;
	}
	public void setCourses(Set<CourseManyToMany> courses) {
		this.courses = courses;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		
		return "Student Name:"+this.getName()+" COurses : "+this.getCourses();
	}

}

package com.example.mysql.repository;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mysql.entity.Course;
import com.example.mysql.entity.CourseMaterial;

@SpringBootTest
public class TestCourseMaterialInterface {
	
	@Autowired
	private CourseMaterialRepository courseMaterialRepository;
	
	@Test
	public void SaveCourseMaterial() {
		Course  course = new Course();
		course.setCredit(7);
		course.setTitle(".NEt");
		
		CourseMaterial courseMaterial = new CourseMaterial();
		courseMaterial.setUrl("www.googler.com");
		courseMaterial.setCourse(course);
		
		courseMaterialRepository.save(courseMaterial);
	}

	@Test
	public void printListOfCourseMaterial() {
		List<CourseMaterial> courseMaterialList =courseMaterialRepository.findAll();
		System.out.println("List Of Course Material ===>  "+courseMaterialList);
	}
	
	
}

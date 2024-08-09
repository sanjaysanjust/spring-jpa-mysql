package com.example.mysql.manytomany.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mysql.manytomany.service.StudentService;

@SpringBootTest
public class TestStudent {
	@Autowired
	private StudentService service;

	/**
	 * @Test public void TestSaveStudent() {
	 * 
	 *       service.saveStudent();
	 * 
	 *       }
	 **/

	@Test
	public void TestSaveStudentCourse() {

		service.saveStudentCourse();

	}

}

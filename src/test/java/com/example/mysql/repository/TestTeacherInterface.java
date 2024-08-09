package com.example.mysql.repository;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mysql.entity.Course;
import com.example.mysql.entity.Teacher;

@SpringBootTest
public class TestTeacherInterface {
	
	@Autowired
	private TeacherRepository  repository;
	
	@Test
	public void TestSaveTeacher() {
		Course course = new Course();
		course.setTitle("Java");
		course.setCredit(6);
		List<Course> courses = new ArrayList();
		courses.add(course);
		
		Teacher teacher=new Teacher();
		teacher.setFirstName("AA");
		teacher.setLastName("BB");
		teacher.setCourses(courses);
		
		repository.save(teacher);
	
	}
	
	@Test
	public void TestTeacher() {
		List<Teacher> teacherList = repository.findAll();
		System.out.println("Teachers List ===>"+teacherList);
	}

}

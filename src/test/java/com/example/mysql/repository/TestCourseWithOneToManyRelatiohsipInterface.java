package com.example.mysql.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mysql.entity.Course;
import com.example.mysql.entity.CourseWithManyToOneRealtionship;
import com.example.mysql.entity.Teacher;

@SpringBootTest
public class TestCourseWithOneToManyRelatiohsipInterface {

	@Autowired
	private CourseRepositoryWithManyToOneRealtionship courseRepository;

	
	@Test
	public void saveCourseWithTeacherObject() {
		Teacher teacher = new Teacher();
		teacher.setFirstName("AAA");
		teacher.setLastName("BBB");
		
		CourseWithManyToOneRealtionship course=new CourseWithManyToOneRealtionship();
		course.setCredit(10);
		course.setTitle("Python");
		course.setTeacher(teacher);
		courseRepository.save(course);
	}

}

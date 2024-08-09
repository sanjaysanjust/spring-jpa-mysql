package com.example.mysql.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.mysql.entity.Course;

@SpringBootTest
public class TestCourseInterface {

	@Autowired
	private CourseRepository courseRepository;

	@Test
	public void printListOfCourses() {
		List<Course> courseList = courseRepository.findAll();
		System.out.println("List Of Course Material ===>  " + courseList);
	}
	
	@Test
	public void findPagination() {
		
		Pageable first = PageRequest.of(0, 3);
		Pageable second = PageRequest.of(0, 4);
		
		List<Course> couseList = courseRepository.findAll(second).getContent();
		System.out.println("COurseList ==>"+couseList);
		
		Long totalElements= courseRepository.findAll(second).getTotalElements();
		
		System.out.println("Get Total Elements in the page"+totalElements);
		
		int totalPages= courseRepository.findAll(second).getTotalPages();
		
		System.out.println("Get Total  pages"+totalPages);
	}
	
	@Test
	public void findElementsInSort() {
		
		Pageable first = PageRequest.of(0, 3,Sort.by("title").descending());
		Pageable second = PageRequest.of(0, 4,Sort.by("course_id"));
		
		List<Course> couseList = courseRepository.findAll(first).getContent();
		System.out.println("COurseList ==> "+couseList);
		
		
	}
}

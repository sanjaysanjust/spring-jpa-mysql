package com.example.mysql.manytomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mysql.manytomany.CourseManyToMany;
import com.example.mysql.manytomany.StudentManyToMany;
import com.example.mysql.manytomany.repository.Course_ManyToMany_Interface;
import com.example.mysql.manytomany.repository.Student_ManyToMany_Interface;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {
	@Autowired
	private Student_ManyToMany_Interface student_interface;
	@Autowired
	private Course_ManyToMany_Interface course_interface;
	
	public void saveStudent() {
		StudentManyToMany studenManyToMany = new StudentManyToMany();
		studenManyToMany.setName("Lokesh");
		student_interface.save(studenManyToMany);
	}
	
	public void saveStudentCourse() {
		StudentManyToMany studenManyToMany = new StudentManyToMany();
		studenManyToMany.setName("Lokesh1");
		
		CourseManyToMany courseManyToMany = new CourseManyToMany();
		courseManyToMany.setName("Kannada");
		
		
		courseManyToMany.getStudents().add(studenManyToMany);
		studenManyToMany.getCourses().add(courseManyToMany);
		
		
		student_interface.save(studenManyToMany);
		course_interface.save(courseManyToMany);
	}

}

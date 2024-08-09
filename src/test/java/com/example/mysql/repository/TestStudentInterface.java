package com.example.mysql.repository;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mysql.entity.Guardian;
import com.example.mysql.entity.Student;

@SpringBootTest
public class TestStudentInterface {
	@Autowired
	private StudentRepository repository;

	@Test
	public void save() {
		
		Guardian guardian = new Guardian();
		guardian.setName("Sanjay");
		guardian.setEmail("Sanjay2.com");
		guardian.setMobile("9900990099");

		Student student = new Student();
		student.setEmailId("abcde.com");
		student.setFirstName("Hemanath");
		student.setLastName("Kumar");
		student.setGuardian(guardian);

		repository.save(student);

	}

	@Test
	public void printAllStudent() {
		List<Student> student_list = repository.findAll();
		System.out.println("List of Students ==>" + student_list);
	}
	
	@Test
	public void printStudent() {
		Optional<Student> student = repository.findById(1l);
		
		System.out.println("Student detail ==>" + student);
	}
	
	@Test
	public void printStudentByFirstName() {
		List<Student> student = repository.findByFirstName("Hemanath");
		
		System.out.println("Student detail ==>" + student);
	}
	
	@Test
	public void printStudentByFirstNameConatining() {
		List<Student> student = repository.findByFirstNameContaining("Heman");
		
		System.out.println("Student detail Conatins str ==>" + student);
	}
	
	@Test
	public void printStudentByemail() {
		Student student = repository.getStudentByEmailAddress("abc.com");
		
		System.out.println("Student details By email ==>" + student);
	}
	
	@Test
	public void printStudentNativeQueryByemail() {
		Student student = repository.getStudentByNativeQuery("abcde.com");
		
		System.out.println("Student details By NativeQuery ==>" + student);
	}
	
	@Test
	public void printStudentNativeQueryByParam() {
		Student student = repository.getStudentByNativeQueryByNameparam("abc.com");
		
		System.out.println("Student details By NativeQuery By Name Param==>" + student);
	}
	@Test
	public void updateFirstNameByEmailIdTest() {
		int val = repository.updateFirstNameByEmailId("Heman Sanjay Kumar S.T", "abc.com");
		System.out.println("Student First NAme Updated==>" + val);
	}
}

package com.example.mysql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.mysql.entity.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	// Custom
	public List<Student> findByFirstName(String firstName);

	// Custom
	public List<Student> findByFirstNameContaining(String str);

	// JPQL
	@Query("select s from Student s where s.emailId=?1")
	public Student getStudentByEmailAddress(String emailId);

	// Native SQL Queries.
	@Query(nativeQuery = true, value = "select * from tbl_student s where s.email_address=?1")
	public Student getStudentByNativeQuery(String emailId);

	// Native SQL Queries By Name Param.
	@Query(nativeQuery = true, value = "select * from tbl_student s where s.email_address=:emailId")
	public Student getStudentByNativeQueryByNameparam(@Param("emailId") String emailId);

	
	@Transactional
	@Modifying
	@Query(nativeQuery = true, value = "update tbl_student set first_name=:firstname where email_address=:emailId")
	public int updateFirstNameByEmailId(@Param("firstname") String firstname, @Param("emailId") String emailId);
	
}

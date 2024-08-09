package com.example.mysql.onetomany.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mysql.onetomany.service.EmployeeService;

@SpringBootTest
public class TestEmployee {
	@Autowired
	private EmployeeService employeeService;
	@Test
	public void testSaveEmployee() {
		
		employeeService.saveEmployee();
		
	}

}

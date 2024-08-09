package com.example.mysql.onetomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mysql.onetomany.Employee;
import com.example.mysql.onetomany.repository.Employee_interface;

@Service
public class EmployeeService {
	@Autowired
	private Employee_interface employee_interface;
	
	public void saveEmployee() {
		Employee employee = new Employee();
		employee.setName("E1");
		Employee employee2 = new Employee();
		employee2.setName("E2");
		
		employee_interface.save(employee);
		employee_interface.save(employee2);
	}

}

package com.example.mysql.onetomany.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mysql.onetomany.Department;
import com.example.mysql.onetomany.service.DepartmentService;

@SpringBootTest
public class TestDepartment {
	
	@Autowired
	private DepartmentService departmentService;
	
	/**@Test
	public void testCreateDepartment() {
		Department dept = departmentService.createDepartment("HR");
		System.out.println("Dpartment Added ==>"+dept);
	}**/
	
	/**@Test
	public void testCreateDepartmentWithEmployees() {
		departmentService.createDepartmentWithEmployees();
		
	}**/
	
	/**@Test
	public void testAddEmployeeToDepartmen() {
		Employee employee = new  Employee();
		employee.setName("shashidhara");
		departmentService.addEmployeeToDepartment(1l, employee);
	}**/
	
	/**@Test
	public void testRemoveEmployeeFromDepartment() {
		departmentService.removeEmployeeFromDepartment(4l, 11l);
	}**/
	
	
	@Test
	public void testRemoveDepartment() {
		departmentService.removeDepartment(8l);
	}
	
	/**@Test
	public void printAllDepartment() {
		List<Department> dept_lst = departmentService.getAllDepartment();
		System.out.println("");
		System.out.println(dept_lst);
	}**/
	

}

package com.example.mysql.onetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mysql.onetomany.Department;
import com.example.mysql.onetomany.Employee;
import com.example.mysql.onetomany.repository.Department_Interface;
import com.example.mysql.onetomany.repository.Employee_interface;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DepartmentService {
	@Autowired
	private Department_Interface department_Interface;
	
	@Autowired
	private Employee_interface employee_interface;

	

	public Department createDepartment(String name) {
		Department department = new Department();
		department.setName(name);
		return department_Interface.save(department);
	}
	
	public void createDepartmentWithEmployees() {

		
		Employee employee = new Employee();
		employee.setName("M1");
		Employee employee2 = new Employee();
		employee2.setName("M2");

		Department department = new Department();
		department.setName("Maintenance");
		department.addEmployee(employee2);
		department.addEmployee(employee);
		department_Interface.save(department);
	}

	public void addEmployeeToDepartment(Long departmentId, Employee employee) {
		Department department = department_Interface.findById(departmentId)
				.orElseThrow(() -> new RuntimeException("Department not found"));

		department.addEmployee(employee); // Update both sides of the relationship
		department_Interface.save(department); // This saves the department and cascades to employees
	}
	
	public void removeEmployeeFromDepartment(Long departmentId, Long employeeId) {
        Department department = department_Interface.findById(departmentId)
            .orElseThrow(() -> new RuntimeException("Department not found"));
        System.out.println("Department Befoer removal ===>"+department);
        
        for (Employee e: department.getEmployees()) {
        	System.out.println("====>"+e.getName());
        }

        Employee employee = employee_interface.findById(employeeId)
            .orElseThrow(() -> new RuntimeException("Employee not found"));

        department.removeEmployee(employee);
        System.out.println("Department After removal ===>"+department);
        department_Interface.save(department); // Orphan removal will handle the employee deletion if necessary
    }

	public List<Department> getAllDepartment(){
		//System.out.println("Inside get All Department");
		//System.out.println(department_Interface.findAll());
		return department_Interface.findAll();
	}

	public void removeDepartment(long l) {
		department_Interface.deleteById(l);
		
	}
	
}

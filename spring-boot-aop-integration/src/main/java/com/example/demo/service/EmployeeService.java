package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public Employee createEmployee(String name, String empId) {

		Employee emp = new Employee();
		emp.setName(name);
		emp.setEmpId(empId);
		employeeRepository.save(emp);
		return emp;
	}

	public void deleteEmployee(String empId) {
		
	}
}
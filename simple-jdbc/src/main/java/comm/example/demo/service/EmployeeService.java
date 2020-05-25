package comm.example.demo.service;

import java.util.List;

import comm.example.demo.model.Employee;

public interface EmployeeService {
public List<Employee> getAllEmployees();
	
	public Employee createEmployee(Employee employee);
	public void deleteEmployee(String employeeID);
	public Employee updateEmployee(String employeeId);
	

}

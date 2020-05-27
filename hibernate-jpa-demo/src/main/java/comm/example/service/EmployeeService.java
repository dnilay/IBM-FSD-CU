package comm.example.service;

import java.util.List;

import comm.example.model.Employee;

public interface EmployeeService {
	
	
	public List<Employee> getAllEmployees();
	public Employee createEmployee(Employee employee);
	public Employee raiseSalary(int id,double salary);

}

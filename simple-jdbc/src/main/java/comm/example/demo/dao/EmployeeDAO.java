package comm.example.demo.dao;

import java.util.List;

import comm.example.demo.model.Employee;

public interface EmployeeDAO {
	
	public List<Employee> getAllEmployees();
	
	public Employee createEmployee(Employee employee);
	public void deleteEmployee(String employeeID);
	

}

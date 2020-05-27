package comm.example.dao;

import java.util.List;

import comm.example.model.Employee;

public interface EmployeeDAO {
	
	public Employee createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee raiseSalary(int id,double salary);
	public void deleteEmployee(int id);

}

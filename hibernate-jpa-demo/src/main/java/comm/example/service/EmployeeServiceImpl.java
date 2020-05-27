package comm.example.service;

import java.util.List;

import comm.example.dao.EmployeeDAO;
import comm.example.dao.EmployeeDAOImpl;
import comm.example.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO dao;
	{
		dao=new EmployeeDAOImpl();
	}

	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.createEmployee(employee);
	}
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}
	@Override
	public Employee raiseSalary(int id, double salary) {
		// TODO Auto-generated method stub
		return dao.raiseSalary(id, salary);
	}
	@Override
	public void deleteEmployee(int id) {
		dao.deleteEmployee(id);
		
	}

	

}

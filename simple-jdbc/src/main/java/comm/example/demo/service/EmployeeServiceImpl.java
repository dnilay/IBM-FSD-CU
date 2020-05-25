package comm.example.demo.service;

import java.sql.SQLException;
import java.util.List;

import comm.example.demo.dao.EmployeeDAO;
import comm.example.demo.dao.EmployeeDAOImpl;
import comm.example.demo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO dao;
	

	public EmployeeServiceImpl() throws SQLException {
		dao=new EmployeeDAOImpl();
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.createEmployee(employee);
	}

}

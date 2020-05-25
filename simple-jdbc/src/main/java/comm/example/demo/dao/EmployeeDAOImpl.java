package comm.example.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comm.example.demo.exception.EmployeeNotFoundException;
import comm.example.demo.factory.EmployeeFactory;
import comm.example.demo.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private EmployeeFactory factory;
	private Connection connection;
	private List<Employee> employees;
	public EmployeeDAOImpl() throws SQLException {
		factory=EmployeeFactory.getMySqlConnection();
		connection=factory.getConnection();
	}
	@Override
	public List<Employee> getAllEmployees() {
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from employees");
			employees=new ArrayList<Employee>();
			while(resultSet.next())
			{
				employees.add(new Employee(resultSet.getString("id"),resultSet.getString("first_name"),resultSet.getString("last_name"),resultSet.getString("email")));
			}			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return employees;
	}
	@Override
	public Employee createEmployee(Employee employee) {
		try {
			PreparedStatement preparedStatement=connection.prepareStatement("insert into employees(id,first_name,last_name,email) values(?,?,?,?)");
			preparedStatement.setString(1, employee.getEmployeeID());
			preparedStatement.setString(2, employee.getFirstName());
			preparedStatement.setString(3, employee.getLastName());
			preparedStatement.setString(4, employee.getEmail());
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return employee;
	}
	@Override
	public void deleteEmployee(String employeeID) {
		try {
				PreparedStatement preparedStatement=connection.prepareStatement("delete from employees where id=?");
				preparedStatement.setString(1, employeeID);
				int item=preparedStatement.executeUpdate();
				if(item==0)
				{
					throw new EmployeeNotFoundException("No Such Employee with the given id: "+employeeID);
					
				}
				System.out.println("employee deleted sucessfully..");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		
	}

}

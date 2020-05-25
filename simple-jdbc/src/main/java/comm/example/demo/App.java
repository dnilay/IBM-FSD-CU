package comm.example.demo;

import java.sql.SQLException;
import java.util.List;

import comm.example.demo.dao.EmployeeDAO;
import comm.example.demo.dao.EmployeeDAOImpl;
import comm.example.demo.factory.EmployeeFactory;
import comm.example.demo.model.Employee;

public class App 
{
    
	private EmployeeDAO dao;
	

	

	public App() throws SQLException {
		dao=new EmployeeDAOImpl();
	}




	public static void main( String[] args ) throws SQLException
    {
       App app=new App();
		List<Employee> list=app.dao.getAllEmployees();
		for(Employee e:list)
		{
			System.out.println(e.getDetails());
		}
    }
}

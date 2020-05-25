package comm.example.demo.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class EmployeeFactory {
	private Connection connection;
	private static EmployeeFactory factory;
	
	private EmployeeFactory() throws SQLException
	{
		//step-1 register the driver
		DriverManager.registerDriver(new Driver());
		//step-2 create connection with java and backend sql
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","fsd","Root@1234");
		//sSystem.out.println(connection);
	}
	// Single tone pattern
	public static EmployeeFactory getMySqlConnection() throws SQLException
	{
		
		if(factory ==null)
		{
			factory=new EmployeeFactory();
		}
		return factory;
	}
	
	public Connection getConnection()
	{
		return connection;
	}

}

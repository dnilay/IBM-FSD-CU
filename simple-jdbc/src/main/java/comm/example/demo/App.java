package comm.example.demo;

import java.sql.SQLException;

import comm.example.demo.factory.EmployeeFactory;

public class App 
{
    
	private EmployeeFactory factory;
	
	public App() throws SQLException {
		factory=EmployeeFactory.getMySqlConnection();
	}

	public static void main( String[] args ) throws SQLException
    {
        System.out.println(new App().factory);
    }
}

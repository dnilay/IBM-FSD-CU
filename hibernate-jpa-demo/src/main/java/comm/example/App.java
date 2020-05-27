package comm.example;

import comm.example.model.Employee;
import comm.example.service.EmployeeService;
import comm.example.service.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	private static EmployeeService service=null;
	
	static
	{
		service=new EmployeeServiceImpl();
	}
    public static void main( String[] args )
    {
    	Employee e=service.createEmployee(new Employee("Marry", "Dehradoon", 10000));
    	System.out.println(e);
    }
}

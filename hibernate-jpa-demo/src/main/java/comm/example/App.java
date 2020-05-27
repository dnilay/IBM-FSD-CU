package comm.example;

import java.util.Collection;

import comm.example.model.Employee;
import comm.example.service.EmployeeService;
import comm.example.service.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	private static EmployeeService service = null;

	static {
		service = new EmployeeServiceImpl();
	}

	public static void main(String[] args) {
		/*
		 * Employee e=service.createEmployee(new Employee("Marry", "Dehradoon", 10000));
		 * System.out.println(e);
		 */
		//System.out.println("before updation");
		System.out.println("before deletion");
		Collection<Employee> employees = service.getAllEmployees();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		/*
		 * Employee employee=service.raiseSalary(100, 2000); if(employee==null) {
		 * System.out.println("no such id found: "); } else {
		 * System.out.println("After Updation of Salary.");
		 * System.out.println(employee); }
		 */
		service.deleteEmployee(100);
		System.out.println("after deletion");
		Collection<Employee> employees1 = service.getAllEmployees();
		for (Employee employee : employees1) {
			System.out.println(employee);
		}
		
	}
}

package comm.example.demo;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import comm.example.demo.model.Employee;
import comm.example.demo.service.EmployeeService;
import comm.example.demo.service.EmployeeServiceImpl;

public class App {

	private EmployeeService service;
	private static Scanner scanner = new Scanner(System.in);

	public App() throws SQLException {
		service = new EmployeeServiceImpl();
	}

	public static void main(String[] args) throws SQLException {
		App app = new App();
		int choice = 0;
		do {
			System.out.println("1. Create Employee:");
			System.out.println("2. List All Employees:");
			System.out.println("0. Exit from the system: ");
			System.out.print("chose your option(1/2/0): ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("First Name: ");
				String fName = scanner.next();
				System.out.print("Last Name :");
				String lName = scanner.next();
				System.out.print("Email: ");
				String email = scanner.next();
				Employee employee = app.service
						.createEmployee(new Employee(UUID.randomUUID().toString(), fName, lName, email));
				System.out.println(employee.getDetails() + " saved sucessfully..!");
				break;
			case 2:
				List<Employee> list = app.service.getAllEmployees();
				for (Employee e : list) {
					System.out.println(e.getDetails());
				}
				break;
			case 0:
				System.out.println("bye!");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice.");
				break;
			}

		} while (choice != 0);

	}
}

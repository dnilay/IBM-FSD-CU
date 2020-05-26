package comm.example;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.entity.Customer;
import comm.example.service.CustomerService;
import comm.example.service.CustomerServiceImpl;

public class App 
{
	private static Scanner scanner=new Scanner(System.in);
	private static  CustomerService service;
	
	{
		service=new CustomerServiceImpl();
	}
	
    public static void main( String[] args )
    {
    	int choice=-1;
        try {
        	App app=new App();
        	System.out.println("1.create customer.");
        	System.out.println("2.display all customer.");
        	System.out.println("0.exit.");
        	System.out.print("1.chose your choice: ");
        	choice=scanner.nextInt();
        	switch (choice) {
			case 1:
				System.out.print("first name: ");
				String fName=scanner.next();
				System.out.print("last name: ");
				String lName=scanner.next();
				System.out.print("email: ");
				String email=scanner.next();
				Customer customer=app.service.createCustoemr(new Customer(fName, lName, email));
				System.out.println(customer);
				break;

			default:
				break;
			}
        
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}

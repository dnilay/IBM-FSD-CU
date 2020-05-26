package comm.example;

import java.util.List;
import java.util.Scanner;

import comm.example.entity.Customer;
import comm.example.service.CustomerService;
import comm.example.service.CustomerServiceImpl;

public class App {
	private static Scanner scanner = new Scanner(System.in);
	private static CustomerService service;
static
	{
		service = new CustomerServiceImpl();
	}

	public static void main( String[] args )
    {
    	int choice=-1;
       
        	do {
        		System.out.println("1.create customer.");
            	System.out.println("2.display all customer.");
            	System.out.println("3.find a customer.");
            	System.out.println("4.remove a customer.");
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
    				System.out.print("amount: ");
    				int amount=scanner.nextInt();
    				Customer customer=App.service.createCustoemr(new Customer(fName, lName, email,amount));
    				System.out.println(customer);
    				break;
    			case 2:
    				List<Customer> customers=App.service.getAllCustomers();
    				for(Customer c:customers)
    				{
    					
    					//Customer customer1=(Customer)c;
    					System.out.println(c.getDetails());
    				}
    				break;
    			case 3:
    				System.out.print("id: ");
    				int id=scanner.nextInt();
    				Customer customer2=App.service.getCustomer(id);
    				if(customer2==null)
    				{
    					System.out.println("no such record found");
    				}
    				else
    				{
    					System.out.println(customer2);
    				}
    				
    				break;
    			case 4:
    				System.out.print("id: ");
    				int id1=scanner.nextInt();
    				App.service.removeCustomer(id1);
    				break;
    			default:
    				break;
    			}
            
    			
    		} while (choice!=0);
	
			
    }
        	    
}

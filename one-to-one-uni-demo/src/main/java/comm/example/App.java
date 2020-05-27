package comm.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import comm.example.model.Customer;
import comm.example.model.Order;
import comm.example.service.CustomerService;
import comm.example.service.CustomerServiceImpl;

public class App 
{
	private static CustomerService service;
	static
	{
		service=new CustomerServiceImpl();
	}
    public static void main( String[] args )
    {
        try {
        	
        	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        	System.out.println("create a new customer\n===============\n");
        	System.out.print("Customer name: ");
        	String name=br.readLine();
        	System.out.println("provide order details\n===========\n");
        	System.out.print("provide order address: ");
        	String address=br.readLine();
        	Customer customer=service.createCustomer(new Customer(name, new Order(address)));
        	System.out.println("saved\n"+customer.getDetails());
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
    }
}

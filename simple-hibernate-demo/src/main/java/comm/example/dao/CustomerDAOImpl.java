package comm.example.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.NotFound;
import org.hibernate.cfg.Configuration;

import comm.example.entity.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	private SessionFactory factory;
	private static Scanner scanner=new Scanner(System.in);
	private Session session;

	{
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Customer.class)
				.buildSessionFactory();
	session = factory.openSession();
	}

	@Override
	public Customer createCustoemr(Customer customer) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		session.save(customer);
		session.getTransaction().commit();
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
	
		TypedQuery<Customer> query=session.createQuery(" from Customer",Customer.class);
		return query.getResultList();
	}

	@Override
	public Customer getCustomer(int id) {
		Customer customer=null;
		try {
			customer=session.get(Customer.class, id);
			if(customer==null)
			{
				throw new CustomerNotFoundException("customer not found with id: "+id);
			}

		} catch (CustomerNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
				return customer ;
	}

	@Override
	public void removeCustomer(int id) {
		Customer customer=null;
		try {
			customer=session.get(Customer.class, id);
			if(customer==null)
			{
				throw new CustomerNotFoundException("customer not found with id: "+id);
			}

		} catch (CustomerNotFoundException e) {
		
			System.out.println(e.getMessage());
		}
		session.getTransaction().begin();
		session.remove(customer);
		session.getTransaction().commit();
		System.out.println("customer removed sucessfully.");
		
	}

	@Override
	public Customer updateCustomer(int id) {
		// TODO Auto-generated method stub
		Customer customer=null;
		try {
			customer=session.get(Customer.class, id);
			if(customer==null)
			{
				throw new CustomerNotFoundException("customer not found with id: "+id);
			}

		} catch (CustomerNotFoundException e) {
		
			System.out.println(e.getMessage());
		}
		System.out.print("first name: ");
		String fName=scanner.next();
		System.out.print("last name: ");
		String lName=scanner.next();
		System.out.print("email: ");
		String email=scanner.next();
		System.out.print("amount: ");
		int amount=scanner.nextInt();
		customer.setFirstName(fName);
		customer.setLastName(lName);
		customer.setEmail(email);
		customer.setAmount(amount);
		session.getTransaction().begin();
		session.update(customer);
		session.getTransaction().commit();
		return customer;
	}
}


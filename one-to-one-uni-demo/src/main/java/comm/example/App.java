package comm.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.model.Address;
import comm.example.model.Customer;
import comm.example.model.Order;
import comm.example.model.Stream;
import comm.example.model.Student;
import comm.example.service.CustomerService;
import comm.example.service.CustomerServiceImpl;
import comm.example.service.OrderService;
import comm.example.service.OrderServiceImpl;

public class App {/*
					 * private static OrderService service; static { service=new OrderServiceImpl();
					 * } public static void main( String[] args ) { try {
					 * 
					 * BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					 * 
					 * System.out.println("create a new customer\n===============\n");
					 * System.out.print("Customer name: "); String name=br.readLine();
					 * System.out.println("provide order details\n===========\n");
					 * System.out.print("provide order address: "); String address=br.readLine();
					 * Customer customer=service.createCustomer(new Customer(name, new
					 * Order(address))); System.out.println("saved\n"+customer.getDetails());
					 * 
					 * System.out.println("provide order details:\n=================\n");
					 * System.out.print("order address"); String address=br.readLine();
					 * System.out.println("provide customer details:\n====================\n");
					 * System.out.print("customer name: "); String name=br.readLine(); Customer
					 * customer=new Customer(name); Order order=new Order(address);
					 * customer.setOrder(order); order.setCustomer(customer);
					 * service.createOrder(order);
					 * 
					 * 
					 * } catch (Exception e) {
					 * 
					 * e.printStackTrace(); }
					 */
	public static void main(String args[]) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.openSession();
		EntityManagerFactory emFactory = session.getEntityManagerFactory();
		EntityManager em = emFactory.createEntityManager();
		Address address=new Address("India", "Bihar", "Patna", "9999999900");
		Student student=new Student("John","Doe","john@email.com",Stream.COMMERCE,address); 
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		System.out.println("done");
		

	}
}

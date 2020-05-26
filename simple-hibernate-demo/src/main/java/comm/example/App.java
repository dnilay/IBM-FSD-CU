package comm.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.entity.Customer;

public class App 
{
    public static void main( String[] args )
    {
        try {
        	
        	SessionFactory factory=new Configuration().configure().
        			addAnnotatedClass(Customer.class).buildSessionFactory();
        	Session session=factory.openSession();
        	Customer customer=new Customer("Marry", "Jane", "marry@email.com");
        	session.getTransaction().begin();
        	session.save(customer);
        	session.getTransaction().commit();
        	System.out.println("done");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}

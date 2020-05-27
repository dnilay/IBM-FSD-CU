package comm.example.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.model.Customer;
import comm.example.model.Order;

public class CustomerOrderFactory {

	private EntityManagerFactory emFactory;
	private EntityManager entityManager;
	public CustomerOrderFactory() {
		
		SessionFactory factory=
				new Configuration().configure().addAnnotatedClass(Customer.class).
				addAnnotatedClass(Order.class).buildSessionFactory();
		Session session=factory.openSession();
		emFactory=session.getEntityManagerFactory();
		entityManager=emFactory.createEntityManager();
	
	}
	
	
	public EntityManager getMyEntityManager()
	{
		return entityManager;
	}
	
	

}

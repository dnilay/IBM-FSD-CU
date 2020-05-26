package comm.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.entity.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	private SessionFactory factory;
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
		// TODO Auto-generated method stub
		return null;
	}

}

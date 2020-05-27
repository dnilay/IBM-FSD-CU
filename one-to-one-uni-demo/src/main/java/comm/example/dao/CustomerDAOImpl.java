package comm.example.dao;

import javax.persistence.EntityManager;

import comm.example.factory.CustomerOrderFactory;
import comm.example.model.Customer;

public class CustomerDAOImpl implements CustomertDAO{
	private CustomerOrderFactory customerOrderFactory;
	EntityManager entityManager;
	
	{
		customerOrderFactory=new CustomerOrderFactory();
		entityManager=customerOrderFactory.getMyEntityManager();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
		return customer;
	}

}

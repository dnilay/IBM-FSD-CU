package comm.example.dao;

import javax.persistence.EntityManager;

import comm.example.factory.CustomerOrderFactory;
import comm.example.model.Order;

public class OrderDAOImpl implements OrderDAO {
	private CustomerOrderFactory customerOrderFactory;
	EntityManager entityManager;

	{
		customerOrderFactory = new CustomerOrderFactory();
		entityManager = customerOrderFactory.getMyEntityManager();
	}

	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
	entityManager.getTransaction().begin();
	
	entityManager.persist(order);
	
	entityManager.getTransaction().commit();
		return order;
	}

}

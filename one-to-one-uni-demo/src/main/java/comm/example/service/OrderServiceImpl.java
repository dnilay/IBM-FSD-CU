package comm.example.service;

import comm.example.dao.OrderDAO;
import comm.example.dao.OrderDAOImpl;
import comm.example.model.Order;

public class OrderServiceImpl implements OrderService {
	private OrderDAO dao;
	{
		dao=new OrderDAOImpl();
	}
	

	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		return dao.createOrder(order);
	}

}

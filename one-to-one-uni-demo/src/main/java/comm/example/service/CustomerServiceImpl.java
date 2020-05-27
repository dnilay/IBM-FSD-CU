package comm.example.service;

import comm.example.dao.CustomerDAOImpl;
import comm.example.dao.CustomertDAO;
import comm.example.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	private CustomertDAO dao;
	{
		dao=new CustomerDAOImpl();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		
		return dao.createCustomer(customer);
	}

}

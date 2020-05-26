package comm.example.service;

import java.util.List;

import comm.example.dao.CustomerDAO;
import comm.example.dao.CustomerDAOImpl;
import comm.example.entity.Customer;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO dao;
	


	public CustomerServiceImpl() {
		dao=new CustomerDAOImpl();
	}

	@Override
	public Customer createCustoemr(Customer customer) {
		// TODO Auto-generated method stub
		return dao.createCustoemr(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return dao.getAllCustomers();
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return dao.getCustomer(id);
	}

	@Override
	public void removeCustomer(int id) {
		dao.removeCustomer(id);
		
	}

	@Override
	public Customer updateCustomer(int id) {
		// TODO Auto-generated method stub
		return dao.updateCustomer(id);
	}

}

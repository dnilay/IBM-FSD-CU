package comm.example.dao;

import java.util.List;

import comm.example.entity.Customer;

public interface CustomerDAO {
	public Customer createCustoemr(Customer customer);
	public List<Customer> getAllCustomers();
	public Customer getCustomer(int id);
	

}

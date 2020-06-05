package comm.example.dao;

import comm.example.model.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getCustomers();
    public void createCustomer(Customer customer);
    public Customer getCustomer(int customerId);
    public void deleteCustomer(int customerId);

}

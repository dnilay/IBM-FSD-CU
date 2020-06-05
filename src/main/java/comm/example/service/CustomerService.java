package comm.example.service;

import comm.example.model.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();
    public void createCustomer(Customer customer);
    public Customer getCustomer(int customerId);
    public void deleteCustomer(int customerId);
}

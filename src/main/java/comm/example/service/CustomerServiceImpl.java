package comm.example.service;

import comm.example.dao.CustomerDAO;
import comm.example.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    private CustomerDAO customerDAO;

    public CustomerServiceImpl() {
    }

    @Autowired
    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    @Override
    public void createCustomer(Customer customer) {
        customerDAO.createCustomer(customer);
    }

    @Override
    public Customer getCustomer(int customerId) {
       return customerDAO.getCustomer(customerId);
    }

    @Override
    public void deleteCustomer(int customerId) {
        customerDAO.deleteCustomer(customerId);

    }


}

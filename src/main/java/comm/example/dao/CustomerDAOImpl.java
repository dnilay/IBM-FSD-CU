package comm.example.dao;

import comm.example.model.Customer;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository("customerDAO")
public class CustomerDAOImpl implements CustomerDAO {
    private final EntityManager entityManager;

    @Autowired
    public CustomerDAOImpl(EntityManager entityManager) {

        this.entityManager = entityManager;

    }

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        Query query = entityManager.createQuery("from Customer");
        return query.getResultList();
    }

    @Override
    @Transactional
    public void createCustomer(Customer customer) {
        Session session = entityManager.unwrap(org.hibernate.Session.class);
      //  session.getTransaction().begin();
        session.saveOrUpdate(customer);
        //session.getTransaction().commit();


    }

    @Override
    @Transactional
    public Customer getCustomer(int customerId) {
        return entityManager.find(Customer.class,customerId);
    }

    @Override
    @Transactional
    public void deleteCustomer(int customerId) {
        entityManager.remove(getCustomer(customerId));

    }


}

package comm.example.dao;

import comm.example.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository("customerDAO")
public class CustomerDAOImpl implements CustomerDAO {
    private EntityManager entityManager;

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
}

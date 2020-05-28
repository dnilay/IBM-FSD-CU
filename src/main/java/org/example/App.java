package org.example;

import org.example.entity.Customer;
import org.example.entity.Order;
import org.example.factory.CustomerFactory;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
    private CustomerFactory factory;
    private EntityManager entityManager;

    public App() {
        factory=new CustomerFactory();
        entityManager=factory.getMyEntityManager();
    }

    public static void main(String[] args )
    {
        App app=new App();
        String[] temp= UUID.randomUUID().toString().split("-");

        Order order1=new Order(temp[0],"Mumbai");
        temp= UUID.randomUUID().toString().split("-");
        Order order2=new Order(temp[0],"Banglore");
        temp= UUID.randomUUID().toString().split("-");
        Order order3=new Order(temp[0],"Banglore");
        List<Order> list=new ArrayList<Order>();
        list.add(order1);
        list.add(order2);
        list.add(order3);
        temp= UUID.randomUUID().toString().split("-");
        Customer customer=new Customer();
        customer.setId(temp[0]);
        customer.setName("John Doe");
        customer.setOrders(list);
        app.entityManager.getTransaction().begin();
        app.entityManager.persist(customer);
        app.entityManager.getTransaction().commit();
        System.out.println("done");



    }
}

package org.example.factory;

import org.example.entity.Course;
import org.example.entity.Customer;
import org.example.entity.Instructor;
import org.example.entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class CustomerFactory {
    private EntityManager entityManager;

    {
        SessionFactory factory=new Configuration().configure().addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(Course.class).buildSessionFactory();
        Session session=factory.openSession();
        EntityManagerFactory entityManagerFactory=session.getEntityManagerFactory();
        entityManager=entityManagerFactory.createEntityManager();
    }

    public EntityManager getMyEntityManager()
    {
        return entityManager;
    }

}

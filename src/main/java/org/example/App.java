package org.example;

import org.example.entity.*;
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
      /*  String[] temp= UUID.randomUUID().toString().split("-");

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
        System.out.println("done");*/
       /* Course course1=new Course();
        course1.setCourseName("Learning Spring");
        course1.setCourseType(CourseType.IT);
        Course course2=new Course();
        course2.setCourseName("Phycics");
        course2.setCourseType(CourseType.NOTIT);
        List<Course> list=new ArrayList<Course>();
        list.add(course1);
        list.add(course2);
        Instructor instructor1=new Instructor();
        instructor1.setInstructorName("John Doe");
        instructor1.setInstructorType(InstructorType.CONTRACT_INSTRUCTOR);
        instructor1.setCourses(list);
        course1.setInstructor(instructor1);
        course2.setInstructor(instructor1);
        app.entityManager.getTransaction().begin();
        app.entityManager.persist(instructor1);
        app.entityManager.getTransaction().commit();
        System.out.println("done");*/

        Course course=app.entityManager.find(Course.class,new Integer(2));
        app.entityManager.getTransaction().begin();
        app.entityManager.remove(course);
        app.entityManager.getTransaction().commit();
        System.out.println("done");


























    }
}

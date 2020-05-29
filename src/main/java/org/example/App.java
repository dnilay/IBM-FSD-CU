package org.example;

import org.example.model.Course;
import org.example.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


public class App {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")

                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        EntityManagerFactory entityManagerFactory=session.getEntityManagerFactory();
        EntityManager entityManager=entityManagerFactory.createEntityManager();

        try {

            // start a transaction
            entityManager.getTransaction().begin();

            // create a course
            Course tempCourse = new Course("Pacman - How To Score One Million Points");

            // save the course
            System.out.println("\nSaving the course ...");
           entityManager.persist(tempCourse);
            System.out.println("Saved the course: " + tempCourse);

            // create the students
            Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
            Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");

            // add students to the course
            tempCourse.addStudent(tempStudent1);
            tempCourse.addStudent(tempStudent2);

            // save the students
            System.out.println("\nSaving students ...");
            entityManager.persist(tempStudent1);
            entityManager.persist(tempStudent2);
            System.out.println("Saved students: " + tempCourse.getStudents());

            // commit transaction
            entityManager.getTransaction().commit();

            System.out.println("Done!");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}





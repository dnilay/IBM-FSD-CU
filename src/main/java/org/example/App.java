package org.example;

import org.example.dao.StudentDAO;
import org.example.dao.StudentDaoImpl;
import org.example.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDAO dao=context.getBean("dao", StudentDaoImpl.class);
        Student student=new Student(UUID.randomUUID().toString(),"John","Doe","John@email.com");
        student=dao.createStudent(student);
        System.out.println(student);
    }
}

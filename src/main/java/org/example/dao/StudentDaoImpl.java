package org.example.dao;

import org.example.factory.StudentFactory;
import org.example.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDaoImpl implements StudentDAO {
    private StudentFactory factory;
    private Connection connection;

    public StudentDaoImpl(StudentFactory factory) throws SQLException {
        this.factory = factory;
        connection=factory.getMyConnection();
    }

    @Override
    public Student createStudent(Student student) throws SQLException {
        PreparedStatement preparedStatement=connection.prepareStatement("insert into STUDENT_DATA(id,first_name,last_name,email)values(?,?,?,?)");
        preparedStatement.setString(1,student.getStudentID());
        preparedStatement.setString(2,student.getFirstName());
        preparedStatement.setString(3,student.getLastName());
        preparedStatement.setString(4,student.getEmail());
        preparedStatement.executeUpdate();
        return student;
    }
}

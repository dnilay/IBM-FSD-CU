package org.example.dao;

import org.example.model.Student;

import java.sql.SQLException;

public interface StudentDAO {
    public Student createStudent(Student student) throws SQLException;
}

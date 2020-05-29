package org.example.factory;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.SQLException;

public class StudentFactory {

    private DataSource dataSource;

    public StudentFactory(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    private  DataSource getMyDataSource()
    {
        return dataSource;
    }
    public Connection getMyConnection() throws SQLException {
        return dataSource.getConnection();
    }
}

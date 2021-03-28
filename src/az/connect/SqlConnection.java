/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.connect;

import java.sql.*;

/**
 *
 * @author Kamran
 */
public class SqlConnection {

    private Connection connection;
    private static SqlConnection instance;

    private SqlConnection() throws SQLException {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
    }

    public Connection getConnection() throws SQLException{
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/univer", "root", "sql6258");
        }
        return connection;
    }

    public static SqlConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new SqlConnection();
        }
        return instance;
    }
}

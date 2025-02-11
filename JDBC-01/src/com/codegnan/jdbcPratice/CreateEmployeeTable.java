package com.codegnan.jdbcPratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEmployeeTable {
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/training";
    static final String USERNAME = "root";
    static final String PASSWORD = "Srinu@45";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded and registered successfully.");

        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            System.out.println("Connection established.");

            statement = connection.createStatement();
            System.out.println("Statement object created.");

           /*
            String sqlCreateTable = "CREATE TABLE IF NOT EXISTS employeeee (" +
                                    "eno INT AUTO_INCREMENT PRIMARY KEY, " +
                                    "ename VARCHAR(100), " +
                                    "esal DECIMAL(10, 2), " +
                                    "eaddr VARCHAR(100))";
            statement.executeUpdate(sqlCreateTable);
            System.out.println("Table created (if not exists).");

            // insert values
            String sqlInsert = "INSERT INTO employeeee (ename, esal, eaddr) VALUES ('srinu', 10000.00, 'nrt')";
            statement.executeUpdate(sqlInsert);
            // drop table
            String sqlDrop = "drop table employeeee";
            statement.executeUpdate(sqlDrop);
            System.out.println("Query executed successfully.");*/
            String sqlCreateTable = "Create table Students(st_id int, stu_name varchar(100), stu_age int)";
            statement.executeUpdate(sqlCreateTable);
            System.out.println("Query executed successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

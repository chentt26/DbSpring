package com.example.dbEx.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connections {
    private static Connection connection=null;
    private static Statement statement=null;

    public Connections() {

    }

    public  static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection= DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/holydays", "root", "11221133cc");
            System.out.println("Done!!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static Statement getStatement() {

        try {
            statement=connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return statement;

    }
}



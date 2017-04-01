package com.max.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Simple example demonstrating the bridge pattern using a JDBC driver
 */
public class BridgeSimpleExample {

    public static void main(String[] args) {

        try {
            // JDBC is an API
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());

            String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

            Connection conn = DriverManager.getConnection(dbUrl);

            Statement st = conn.createStatement();

            // This client is an abstraction and can work with any database that has a driver
            st.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");

            System.out.println("Table created");

            st.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

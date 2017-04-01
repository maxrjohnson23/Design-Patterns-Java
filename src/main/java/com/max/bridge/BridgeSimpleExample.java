package com.max.bridge;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Simple example demonstrating the bridge pattern using a JDBC driver
 */
public class BridgeSimpleExample {

    public static void main(String[] args) {

        try {
            // JDBC is an API
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

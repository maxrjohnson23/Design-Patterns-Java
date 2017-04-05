package com.max.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Singleton example class with private constructor and getInstance method
 */
public class DbSingleton {

    private Connection conn;

    private DbSingleton() {
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DbSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    // Helper ensures thread-safety and lazy loading of singleton
    private static class SingletonHelper {
        private static final DbSingleton INSTANCE = new DbSingleton();
    }

    public Connection getConnection() {
        if (conn == null) {
            try {
                String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

                conn = DriverManager.getConnection(dbUrl);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
}


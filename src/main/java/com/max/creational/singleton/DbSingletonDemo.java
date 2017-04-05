package com.max.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Demonstration of the Singleton Pattern
 */
public class DbSingletonDemo {

    public static void main(String[] args) {

        DbSingleton instance = DbSingleton.getInstance();

        long startTime;
        long endTime;

        // Timing for first connection
        startTime = System.currentTimeMillis();
        Connection conn = instance.getConnection();
        endTime = System.currentTimeMillis();

        System.out.println("Initial connection: " + (endTime - startTime));

        try (Statement sta = conn.createStatement()) {

            int count = sta.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");
            System.out.println("Table created.");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // timing for additional connections using singleton takes much less time
        startTime = System.currentTimeMillis();
        conn = instance.getConnection();
        endTime = System.currentTimeMillis();

        System.out.println("Another connection: " + (endTime - startTime));



    }
}

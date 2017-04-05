package com.max.structural.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Sample of the jdbc api without a facade.
 * Lots of complex interactions for the client to handle
 */
public class JdbcDemo {

    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();

        try {
            Connection conn = instance.getConnection();

            Statement sta = conn.createStatement();
            int count = sta.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");

            System.out.println("Table created.");
            sta.close();

            sta = conn.createStatement();
            count = sta.executeUpdate("INSERT INTO Address(ID, StreetName, City) values (1, '123 Main Street', 'Chicago')");
            System.out.println(count + " record(s) created.");
            sta.close();

            sta = conn.createStatement();
            ResultSet rs = sta.executeQuery("SELECT * FROM Address");

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

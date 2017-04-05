package com.max.facade;

import java.util.List;

/**
 * Example of the Facade pattern using the JDBC example
 */
public class FacadeJdbcDemo {

    public static void main(String[] args) {

        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable();

        System.out.println("Table created.");

        jdbcFacade.insertIntoTable();

        System.out.println("Record inserted.");

        List<Address> addresses = jdbcFacade.getAddresses();

        for (Address address : addresses) {
            System.out.println(address.getId() + " " + address.getStreetName() + " " + address.getCity());

        }
    }


}

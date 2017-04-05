package com.max.structural.adapter;

import java.util.StringTokenizer;

/**
 * Employee object from CSV
 */
public class EmployeeCSV {

    private int id;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmaiilAddress() {
        return emaiilAddress;
    }

    private String firstName;
    private String lastName;
    private String emaiilAddress;

    public EmployeeCSV(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ",");

        if (tokenizer.hasMoreElements()) {
            id = Integer.parseInt(tokenizer.nextToken());
        }
        if(tokenizer.hasMoreElements()) {
            firstName = tokenizer.nextToken();
        }
        if(tokenizer.hasMoreElements()) {
            lastName = tokenizer.nextToken();
        }
        if(tokenizer.hasMoreElements()) {
            emaiilAddress = tokenizer.nextToken();
        }
    }

}

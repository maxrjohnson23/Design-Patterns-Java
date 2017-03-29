package com.max.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Client using adapter classes
 */
public class EmployeeClient {

    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1234", "Max", "Johnson", "max@example.com");
        employees.add(employeeFromDB);

        // Use adapter for LDAP employees
        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));


        // Use adapter for CSV employees
        EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");
        employees.add(new EmployeeAdapterCSV(employeeFromCSV));

        return employees;

    }
}

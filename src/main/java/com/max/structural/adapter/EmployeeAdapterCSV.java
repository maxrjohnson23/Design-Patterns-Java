package com.max.structural.adapter;

/**
 * Adapter for EmployeeCSV object
 */
public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;

    }

    @Override
    public String getId() {
        // Adapt conversion of object type
        return String.valueOf(instance.getId());
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getFirstName();
    }

    @Override
    public String getEmail() {
        return instance.getEmaiilAddress();
    }
}

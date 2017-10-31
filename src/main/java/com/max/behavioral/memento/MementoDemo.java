package com.max.behavioral.memento;

/*
* Demo of the Memento design pattern using revert functionality for an Employee object
*/
public class MementoDemo {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Employee employee = new Employee();
        employee.setName("John Smith");
        employee.setAddress("1234 Main Street");
        employee.setPhone("123-456-7899");

        System.out.println("Employee before save " + employee);

        caretaker.save(employee);

        employee.setPhone("444-555-6666");
        caretaker.save(employee);
        System.out.println("Employee after phone # saved: " + employee);

        employee.setPhone("333-888-9999");
        System.out.println("Changed phone # again: " + employee);

        // haven't called save yet
        caretaker.revert(employee);
        System.out.println("Revert to last save point: " + employee);

        caretaker.revert(employee);
        System.out.println("Revert to original: " + employee);

    }
}

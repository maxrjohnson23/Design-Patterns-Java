package com.max.behavioral.template;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Everyday example of the Template Method pattern using the Collections sort
public class TemplateEverydayDemo {

    public static void main(String[] args) {
        Person max = new Person("Max", "123-456-7899", 27);
        Person steve = new Person("Steve", "555-656-8989", 35);
        Person sally = new Person("Sally", "444-322-6655", 70);

        List<Person> people = new ArrayList<>();
        people.add(steve);
        people.add(sally);
        people.add(max);

        System.out.println("Not sorted");
        printContents(people);

        Collections.sort(people);

        System.out.println("\nSorted by age");
        printContents(people);

    }

    private static void printContents(List<Person> people) {
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}

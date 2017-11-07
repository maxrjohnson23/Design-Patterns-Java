package com.max.behavioral.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Everyday example of the Strategy design pattern using the Java Comparator  interface
public class StrategyEverydayDemo {

    public static void main(String[] args) {
        Person max = new Person("Max", "123-456-7899", 27);
        Person steve = new Person("Steve", "555-656-8989", 35);
        Person sally = new Person("Sally", "444-322-6655", 70);

        List<Person> people = new ArrayList<>();
        people.add(max);
        people.add(steve);
        people.add(sally);

        System.out.println("Not sorted");
        printContents(people);

        // Comparator for age
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                }
                if (o1.getAge() < o2.getAge()) {
                    return -1;
                }
                return 0;
            }
        });

        System.out.println("\nSorted by age");
        printContents(people);

        // Comparator for name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("\nSorted by name");
        printContents(people);


    }

    private static void printContents(List<Person> people) {
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}

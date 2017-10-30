package com.max.behavioral.iterator;

import java.util.Iterator;

/*
* Demo of the Iterator design pattern using a Bike repository
*/
public class IteratorDemo {

    public static void main(String[] args) {

        BikeRepository repo = new BikeRepository();

        // These would be Bike objects in a true application
        repo.addBike("Schwinn");
        repo.addBike("Trek");
        repo.addBike("Giant");

        Iterator<String> bikeIterator = repo.iterator();

        while (bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }

        // can iterate the repo with foreach loop as well
        for (String bike : repo) {
            System.out.println(bike);
        }

    }
}

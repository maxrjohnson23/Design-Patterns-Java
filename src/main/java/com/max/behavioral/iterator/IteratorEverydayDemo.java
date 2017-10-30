package com.max.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* Everyday example of the Iterator pattern from the Java Iterator interface.
* The Java for each loop, or enhanced for loop utilizes this Iterator
*/

public class IteratorEverydayDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Max");
        names.add("Jason");
        names.add("Brian");

        Iterator<String> namesIterator = names.iterator();

        while (namesIterator.hasNext()) {
            String name = namesIterator.next();
            System.out.println(name);
            namesIterator.remove();
        }

        System.out.println("Names size: " + names.size());
    }

}

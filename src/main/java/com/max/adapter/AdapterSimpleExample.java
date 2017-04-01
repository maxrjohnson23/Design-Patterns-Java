package com.max.adapter;

import java.util.Arrays;
import java.util.List;

/**
 * This is a simple example of the Adapter pattern using the Arrays and List adapter
 */
public class AdapterSimpleExample {

    public static void main(String[] args) {

        Integer[] arrayOfInts = new Integer[]{42, 43, 44};

        List<Integer> listOfInts = Arrays.asList(arrayOfInts);

        System.out.println("Array: " + Arrays.toString(arrayOfInts));

        System.out.println("List: " + listOfInts);

    }
}

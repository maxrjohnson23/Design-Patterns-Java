package com.max.structural.flyweight;

/**
 * Example of the Flyweight pattern using the Integer wrapper class
 */
public class FlyweightSimpleExample {

    public static void main(String[] args) {

        Integer firstInt = Integer.valueOf(5);

        Integer secondInt = Integer.valueOf(5);

        Integer thirdInt = Integer.valueOf(10);

        // firstInt and secondInt share the same item in the literal pool or flyweight cache, transparent to user
        System.out.println(System.identityHashCode(firstInt));
        System.out.println(System.identityHashCode(secondInt));
        System.out.println(System.identityHashCode(thirdInt));
    }
}

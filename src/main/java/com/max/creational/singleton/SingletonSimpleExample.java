package com.max.creational.singleton;

/**
 * Simple example of the Singleton pattern used in the Runtime
 */
public class SingletonSimpleExample {

    public static void main(String[] args) {

        Runtime singletonRuntime = Runtime.getRuntime();

        singletonRuntime.gc();

        System.out.println(singletonRuntime);

        Runtime anotherInstance = Runtime.getRuntime();

        System.out.println(anotherInstance);

        if (singletonRuntime == anotherInstance) {
            System.out.println("They are the same instance");
        }
    }

}

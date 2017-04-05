package com.max.creational.singleton;

/**
 * Singleton example class with private constructor and getInstance method
 */
public class DbSingleton {

    // Eagerly loaded
    private static DbSingleton instance = new DbSingleton();

    private DbSingleton() {

    }

    public static DbSingleton getInstance() {
        return instance;
    }
}

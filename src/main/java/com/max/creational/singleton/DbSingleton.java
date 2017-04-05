package com.max.creational.singleton;

/**
 * Singleton example class with private constructor and getInstance method
 */
public class DbSingleton {

    private static DbSingleton instance = null;

    private DbSingleton() {

    }

    public static DbSingleton getInstance() {
        // lazily loaded
        if (instance == null) {
            instance = new DbSingleton();
        }
        return instance;
    }
}

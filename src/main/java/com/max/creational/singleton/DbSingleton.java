package com.max.creational.singleton;

/**
 * Singleton example class with private constructor and getInstance method
 */
public class DbSingleton {

    private DbSingleton() {
    }

    public static DbSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    // Helper ensures thread-safety and lazy loading of singleton
    private static class SingletonHelper {
        private static final DbSingleton INSTANCE = new DbSingleton();
    }


}

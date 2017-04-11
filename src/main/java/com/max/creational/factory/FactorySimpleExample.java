package com.max.creational.factory;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * Example of the Factory pattern used in the Java Calendar
 */
public class FactorySimpleExample {

    public static void main(String[] args) {

        // Actual instance is GregorianCalendar
        Calendar cal = Calendar.getInstance();

        // Parameters to create different instance
        Calendar pacificTimeCal = Calendar.getInstance(TimeZone.getTimeZone("PST"));

        System.out.println(cal);
        System.out.println(cal.get(Calendar.HOUR));

        System.out.println(pacificTimeCal);
        System.out.println(pacificTimeCal.get(Calendar.HOUR));
    }

}

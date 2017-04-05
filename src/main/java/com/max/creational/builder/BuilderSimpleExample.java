package com.max.creational.builder;

/**
 * Simple example of the Builder pattern using StringBuilder
 */
public class BuilderSimpleExample {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        builder.append("This is an example ");
        builder.append("of the builder pattern.  ");
        builder.append("It has methods to append ");
        builder.append("almost anything to a String. ");
        builder.append(42);

        System.out.println(builder.toString());
    }


}

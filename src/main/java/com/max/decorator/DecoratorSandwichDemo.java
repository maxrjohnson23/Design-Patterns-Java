package com.max.decorator;

/**
 * Demonstration of the Decorator pattern using a Sandwich and adding "functionality"
 */
public class DecoratorSandwichDemo {

    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());

    }
}

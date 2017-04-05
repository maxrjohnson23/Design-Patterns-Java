package com.max.creational.builder;

/**
 * Demonstrating the creation of a LunchOrder using telescoping constructors
 */
public class LunchOrderTeleDemo {

    public static void main(String[] args) {
        // no setter methods available to change variables
        LunchOrderTele lunchOrderTele = new LunchOrderTele("White", "Swiss", "Mustard", "Ham");

        System.out.println(lunchOrderTele.getBread());
        System.out.println(lunchOrderTele.getCheese());
        System.out.println(lunchOrderTele.getDressing());
        System.out.println(lunchOrderTele.getMeat());
    }
}

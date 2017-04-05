package com.max.creational.builder;

/**
 * Demonstration of the Builder pattern for creating LunchOrders
 */
public class BuilderLunchOrderDemo {


    public static void main(String[] args) {

        LunchOrder.Builder builder = new LunchOrder.Builder();

        // Can use any combination or absence of components
        builder.bread("Wheat").cheese("Cheddar").dressing("Mayo").meat("Turkey");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCheese());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}

package com.max.structural.flyweight;

/**
 * Demonstration of the Flyweight pattern using an inventory system
 */
public class FlyweightInventoryDemo {

    public static void main(String[] args) {
        InventorySystem ims = new InventorySystem();

        // Three unique items, but many orders
        ims.takeOrder("Roomba", 221);
        ims.takeOrder("Bose Headphones", 361);
        ims.takeOrder("Samsung TV", 432);
        ims.takeOrder("Samsung TV", 323);
        ims.takeOrder("Roomba", 563 );
        ims.takeOrder("Bose Headphones", 321);
        ims.takeOrder("Roomba", 234);
        ims.takeOrder("Samsung TV", 54);
        ims.takeOrder("Roomba", 34);
        ims.takeOrder("Bose Headphones", 365);
        ims.takeOrder("Samsung TV", 332);
        ims.takeOrder("Roomba", 456);

        ims.process();

        // Only 3 objects created
        System.out.println(ims.report());

    }

}

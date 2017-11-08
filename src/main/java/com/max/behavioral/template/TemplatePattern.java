package com.max.behavioral.template;

// Demo of the Template Method design pattern using Order types with varying implementations but same order of operations
public class TemplatePattern {

    public static void main(String[] args) {
        System.out.println("Web Order: ");
        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();

        System.out.println("\nStore order: ");
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();

    }
}

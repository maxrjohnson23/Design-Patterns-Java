package com.max.behavioral.visitor.bad;

/* Everyday example of an ATV parts order that could use the Visitor design pattern
 In this implementation, any additions to the interface, such as calculateShipping()
 requires changes in all implementing classes
 */
public class EverydayVisitorDemo {

    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        double shippingCost = order.calculateShipping();

        System.out.println(shippingCost + " dollars");
    }

}

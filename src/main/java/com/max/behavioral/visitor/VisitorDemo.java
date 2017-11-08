package com.max.behavioral.visitor;

// Demo of the Visitor design pattern using the ATV parts order
public class VisitorDemo {

    public static void main(String[] args) {
        PartsOrder partsOrder = new PartsOrder();
        partsOrder.addPart(new Wheel());
        partsOrder.addPart(new Oil());
        partsOrder.addPart(new Fender());

        partsOrder.accept(new AtvPartsShippingVisitor());
        // Adding a new visitor is much easier now
        partsOrder.accept(new AtvPartsDisplayVisitor());
    }

}

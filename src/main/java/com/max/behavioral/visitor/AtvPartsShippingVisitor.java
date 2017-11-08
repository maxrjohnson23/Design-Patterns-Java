package com.max.behavioral.visitor;

import java.util.List;

// This class contains all shipping calculation logic, rather than the individual parts classes
public class AtvPartsShippingVisitor implements AtvPartVisitor {

    double shippingAmount = 0;

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Wheels are bulky and expensive to ship");
        shippingAmount += 15;
    }

    @Override
    public void visit(Fender fender) {
        shippingAmount += 9;
        System.out.println("Fenders are expensive to ship");
    }

    @Override
    public void visit(Oil oil) {
        System.out.println("Oil is hazardous and has a fee to ship");
        shippingAmount += 9;
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("If more than three things, we will offer a shipping discount");
        List<AtvPart> parts = partsOrder.getAtvParts();
        if (parts.size() > 3) {
            shippingAmount -= 5;
        }
        System.out.println("Shipping amount is: " + shippingAmount);
    }
}

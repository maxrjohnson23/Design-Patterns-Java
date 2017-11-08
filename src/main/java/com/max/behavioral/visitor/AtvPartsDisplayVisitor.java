package com.max.behavioral.visitor;

// Adding a new visitor requires changes only in this class
public class AtvPartsDisplayVisitor implements AtvPartVisitor {
    @Override
    public void visit(Wheel wheel) {
        System.out.println("We have a wheel");
    }

    @Override
    public void visit(Fender fender) {
        System.out.println("We have a fender");

    }

    @Override
    public void visit(Oil oil) {
        System.out.println("We have oil");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("We have an order.");
    }
}

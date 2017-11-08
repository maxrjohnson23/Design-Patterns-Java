package com.max.behavioral.template;

// Another implementation of the Order with same order of events, but different actions
public class StoreOrder extends OrderTemplate {

    @Override
    public void doCheckout() {
        System.out.println("Ring up items from cart.");
    }

    @Override
    public void doPayment() {
        System.out.println("Process payment with card reader.");
    }

    @Override
    public void doReceipt() {
        System.out.println("Print receipt.");
    }

    @Override
    public void doDelivery() {
        System.out.println("Bag items at counter.");
    }
}

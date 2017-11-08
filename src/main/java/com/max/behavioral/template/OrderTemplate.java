package com.max.behavioral.template;

public abstract class OrderTemplate {

    public boolean isGift;

    // Hooks and Operations require implementation
    public abstract void doCheckout();

    public abstract void doPayment();

    public abstract void doReceipt();

    public abstract void doDelivery();

    // Can provide additional standard methods in the base class
    public final void wrapGift() {
        System.out.println("Gift wrapped.");
    }

    // Algorithm is standard and cannot be overridden
    public final void processOrder() {
        doCheckout();
        doPayment();
        if (isGift) {
            wrapGift();
        } else {
            doReceipt();
        }
        doDelivery();
    }

}

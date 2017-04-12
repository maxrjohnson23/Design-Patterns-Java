package com.max.creational.abstractfactory;

public class VisaValidator extends Validator {
    @Override
    boolean isValid(CreditCard creditCard) {
        // card validation logic
        return false;
    }
}

package com.max.creational.abstractfactory;

public class AmexPlatinumValidator extends Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        // card validation logic
        return false;
    }
}

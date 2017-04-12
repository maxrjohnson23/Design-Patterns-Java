package com.max.creational.abstractfactory;

public class AmexGoldValidator extends Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        // card validation logic
        return false;
    }
}

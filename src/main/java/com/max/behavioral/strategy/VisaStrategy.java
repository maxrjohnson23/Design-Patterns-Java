package com.max.behavioral.strategy;

public class VisaStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = true;

        // Visa cards start with 4
        isValid = creditCard.getNumber().startsWith("4");

        // Check Visa card number length
        if (isValid) {
            isValid = creditCard.getNumber().length() == 16;
        }

        // Check parent class's Luhn test for common validation
        if (isValid) {
            isValid = passesLuhn(creditCard.getNumber());
        }
        return isValid;
    }
}

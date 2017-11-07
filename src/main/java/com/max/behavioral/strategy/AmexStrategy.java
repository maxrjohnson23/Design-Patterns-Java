package com.max.behavioral.strategy;

public class AmexStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = true;

        // Amex cards start with 37 or 34
        isValid = creditCard.getNumber().startsWith("37") || creditCard.getNumber().startsWith("34");

        // Check AMEX card number length
        if (isValid) {
            isValid = creditCard.getNumber().length() == 15;
        }

        // Check parent class's Luhn test for common validation
        if (isValid) {
            isValid = passesLuhn(creditCard.getNumber());
        }
        return isValid;
    }


}

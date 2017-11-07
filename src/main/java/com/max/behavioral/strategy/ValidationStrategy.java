package com.max.behavioral.strategy;

public abstract class ValidationStrategy {

    public abstract boolean isValid(CreditCard creditCard);

    /* Luhn test is an actual credit card validation strategy that can be used across many vendors
    * In this example, the abstract base class has some common functionality that can be used by
      the concrete implementations */
    protected boolean passesLuhn(String ccNumber) {
        int sum = 0;
        boolean alternate = false;
        for (int i = ccNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(ccNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }

}

package com.max.behavioral.strategy;

// Demo of the Strategy design pattern using different Credit Card validation strategies
// Adding another strategy requires providing a concrete class that extends ValidationStrategy
public class StrategyDemo {

    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        // Valid Amex CC number (not real)
        amexCard.setNumber("379185883464283");
        amexCard.setDate("02/2020");
        amexCard.setCvv("123");

        System.out.println("Is Amex valid: " + amexCard.isValid());

        CreditCard amexCard2 = new CreditCard(new AmexStrategy());

        // Invalid Amex CC number
        amexCard2.setNumber("379185883464282");
        amexCard2.setDate("01/2019");
        amexCard2.setCvv("789");

        System.out.println("Is Amex2 valid: " + amexCard2.isValid());


        CreditCard visaCard = new CreditCard(new VisaStrategy());

        // Valid VISA number (not real)
        visaCard.setNumber("4539589763663402");
        visaCard.setDate("05/2018");
        visaCard.setCvv("234");

        System.out.println("Is Visa valid: " + visaCard.isValid());
    }
}

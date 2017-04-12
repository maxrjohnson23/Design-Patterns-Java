package com.max.creational.abstractfactory;

/**
 * Demonstrate the Abstract Factory pattern using different credit card factories
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        Validator validator = abstractFactory.getValidator(CardType.PLATINUM);

        // Amex Platinum, Amex Platinum validator
        System.out.println(card.getClass());
        System.out.println(validator.getClass());


        abstractFactory = CreditCardFactory.getCreditCardFactory(600);

        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
        Validator validator2 = abstractFactory.getValidator(CardType.GOLD);

        // Visa Gold, generic Visa Validator
        System.out.println(card2.getClass());
        System.out.println(validator2.getClass());


    }

}

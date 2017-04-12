package com.max.creational.abstractfactory;

/**
 * Complete concrete factory
 */
public class VisaFactory extends CreditCardFactory {

    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaBlackCreditCard();
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {

        return new VisaValidator();
    }

}

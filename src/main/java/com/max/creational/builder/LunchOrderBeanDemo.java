package com.max.creational.builder;

/**
 * Demonstrating the creation of a LunchOrder using a bean
 */
public class LunchOrderBeanDemo {


    public static void main(String[] args) {

        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCheese("Cheddar");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Turkey");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCheese());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());

    }

}

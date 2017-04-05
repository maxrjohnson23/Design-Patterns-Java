package com.max.creational.builder;

/**
 * Example of telescoping constructors
 */
public class LunchOrderTele {

    private String bread;
    private String cheese;
    private String dressing;
    private String meat;

    public LunchOrderTele(String bread) {
        this.bread = bread;
    }

    public LunchOrderTele(String bread, String cheese) {
        this(bread);
        this.cheese = cheese;
    }

    public LunchOrderTele(String bread, String cheese, String dressing) {
        this(bread, cheese);
        this.dressing = dressing;
    }

    public LunchOrderTele(String bread, String cheese, String dressing, String meat) {
        this(bread, cheese, dressing);
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCheese() {
        return cheese;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}

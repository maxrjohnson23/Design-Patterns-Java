package com.max.creational.builder;

/**
 * Created by Max on 4/5/2017.
 */
public class LunchOrder {

    public static class Builder {
        private String bread;
        private String cheese;
        private String dressing;
        private String meat;

        public Builder() {
        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }
    }

    private final String bread;
    private final String cheese;
    private final String dressing;
    private final String meat;

    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.cheese = builder.cheese;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
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

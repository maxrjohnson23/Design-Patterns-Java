package com.max.behavioral.state;

public class FanOffState extends State {

    private StateFan fan;

    public FanOffState(StateFan stateFan) {
        this.fan = stateFan;
    }

    @Override
    void handleRequest() {
        System.out.println("Turning fan on to low.");
        fan.setState(fan.getFanLowState());
    }

    public String toString() {
        return "Fan is off.";
    }
}

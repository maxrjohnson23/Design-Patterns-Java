package com.max.behavioral.state;

public class FanLowState extends State {
    private StateFan fan;

    public FanLowState(StateFan stateFan) {
        this.fan = stateFan;
    }

    @Override
    void handleRequest() {
        System.out.println("Turning fan on to medium.");
        fan.setState(fan.getFanMedState());
    }

    public String toString() {
        return "Fan is on low.";
    }
}

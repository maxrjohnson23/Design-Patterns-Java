package com.max.behavioral.state;

public class FanMedState extends State {
    private StateFan fan;

    public FanMedState(StateFan stateFan) {
        this.fan = stateFan;
    }

    @Override
    void handleRequest() {
        System.out.println("Turning fan off.");
        fan.setState(fan.getFanOffState());
    }

    public String toString() {
        return "Fan is on medium.";
    }
}

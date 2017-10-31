package com.max.behavioral.mediator;

// Receiver - taken from previous Command pattern example
public class Light {

    private boolean isOn = false;
    private String location = "";

    public Light() {
    }

    public Light(String location) {
        this.location = location;
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    public void on() {
        System.out.println(location + "light switched on.");
    }

    public void off() {
        System.out.println(location + "light switched off.");
    }
}

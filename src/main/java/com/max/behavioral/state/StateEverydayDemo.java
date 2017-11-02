package com.max.behavioral.state;

// Example of the using a fan and different states
public class StateEverydayDemo {

    public static void main(String[] args) {
        Fan fan = new Fan();

        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);

    }

}

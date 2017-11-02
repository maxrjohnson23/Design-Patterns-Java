package com.max.behavioral.state;

public abstract class State {

    void handleRequest() {
        System.out.println("Shouldn't be able to get here..");
    }
}

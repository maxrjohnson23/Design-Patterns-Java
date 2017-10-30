package com.max.behavioral.chainofresponsibility;

public abstract class Handler {

    Handler successor;

    void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}

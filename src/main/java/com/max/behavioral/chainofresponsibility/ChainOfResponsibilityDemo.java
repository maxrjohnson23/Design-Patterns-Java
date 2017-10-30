package com.max.behavioral.chainofresponsibility;

/*
*  Demo for the Chain of Responsibility design pattern using a corporate escalation hierarchy
*/
public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        Director max = new Director();
        VP suzie = new VP();
        CEO jeff = new CEO();

        // Set hierarchy using the successors of each handler
        max.setSuccessor(suzie);
        suzie.setSuccessor(jeff);

        // Directors able to approve conferences
        Request request = new Request(RequestType.CONFERENCE, 500);
        max.handleRequest(request);

        // VPs able to approve purchases under $1500
        request = new Request(RequestType.PURCHASE, 1000);
        max.handleRequest(request);

        // CEOs able to approve anything else
        request = new Request(RequestType.PURCHASE, 2000);
        max.handleRequest(request);
    }
}

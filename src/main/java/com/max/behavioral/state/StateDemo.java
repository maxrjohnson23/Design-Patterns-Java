package com.max.behavioral.state;

/*Demo of the State design pattern using a fan and different state transitions
* implementing a new state requires a new concrete state class and a reference inside the StateFan class
*/
public class StateDemo {

    public static void main(String[] args) {
        StateFan stateFan = new StateFan();

        stateFan.pullChain();
        System.out.println(stateFan);

        stateFan.pullChain();
        System.out.println(stateFan);

        stateFan.pullChain();
        System.out.println(stateFan);
    }


}

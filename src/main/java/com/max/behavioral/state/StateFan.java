package com.max.behavioral.state;

// Fan using state transitions according to the State design pattern
public class StateFan {

    State fanOffState;
    State fanLowState;
    State fanMedState;

    State state;

    public StateFan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMedState = new FanMedState(this);

        // initialize to OFF state
        state = fanOffState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pullChain() {
        state.handleRequest();
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public String toString() {
        return state.toString();
    }

    public State getFanMedState() {
        return fanMedState;
    }

    public State getFanOffState() {
        return fanOffState;
    }
}

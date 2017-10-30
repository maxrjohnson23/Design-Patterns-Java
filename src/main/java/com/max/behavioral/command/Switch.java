package com.max.behavioral.command;

// Invoker of commands
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }

}

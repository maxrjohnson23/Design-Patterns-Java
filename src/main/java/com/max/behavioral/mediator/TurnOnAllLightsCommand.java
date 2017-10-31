package com.max.behavioral.mediator;

// concrete Command class.  No reference to Lights - handled by mediator instead
public class TurnOnAllLightsCommand implements Command {

    private Mediator mediator;

    public TurnOnAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}

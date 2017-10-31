package com.max.behavioral.mediator;

// concrete Command class.  No reference to Lights - handled by mediator instead
public class TurnOffAllLightsCommand implements Command {

    private Mediator mediator;

    public TurnOffAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }
}

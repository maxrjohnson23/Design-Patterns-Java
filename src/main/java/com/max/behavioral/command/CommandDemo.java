package com.max.behavioral.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*  Demo for the Command design pattern using a light switch
*/
public class CommandDemo {

    public static void main(String[] args) {
        Light light = new Light();
        Switch lightSwitch = new Switch();

        // turn light on using on command
        Command onCommand = new OnCommand(light);
        lightSwitch.storeAndExecute(onCommand);

        // toggle light using single toggle command (light now has on/off state)
        Command toggleCommand = new ToggleCommand(light);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);

        // Example of creating a macro to control all lights
        Light bedRoomLight = new Light();
        Light kitchenLight = new Light();

        List<Light> lights = new ArrayList<>(Arrays.asList(bedRoomLight, kitchenLight));
        Command allLights = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(allLights);
    }

}

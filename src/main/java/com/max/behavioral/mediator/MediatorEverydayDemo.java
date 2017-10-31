package com.max.behavioral.mediator;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

/*
* Everyday demo of the Mediator design pattern using the Java Timer class
* */
public class MediatorEverydayDemo {

    private final Toolkit toolkit;
    private Timer timer;

    public MediatorEverydayDemo(int seconds) {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        // Tasks run without knowledge of eachother.  Scheduling is handled by the Timer
        timer.schedule(new RemindTask(), seconds * 1000);
        timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000);
    }

    public static void main(String[] args) {
        System.out.println("About to schedule a task.");
        new MediatorEverydayDemo(3);
        System.out.println("Task scheduled.");
    }

    class RemindTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("Time's up!");
            toolkit.beep();
        }
    }

    class RemindTaskWithoutBeep extends TimerTask {
        @Override
        public void run() {
            System.out.println("Now time's really up!");
            timer.cancel();
        }
    }


}

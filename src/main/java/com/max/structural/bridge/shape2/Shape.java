package com.max.structural.bridge.shape2;

public abstract class Shape {

    // Utilize composition
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}

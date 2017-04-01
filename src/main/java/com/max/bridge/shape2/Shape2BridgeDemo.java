package com.max.bridge.shape2;


/**
 *  Example using shapes to demonstrate the Bridge Pattern
 *  Shapes and Colors can be added independently without the need to update the other side
 */
public class Shape2BridgeDemo {

    public static void main(String[] args) {
        Color blue = new Blue();

        Shape square = new Square(blue);

        Color red = new Red();

        Shape circle = new Circle(red);

        // Adding new color for Green.  No need to change shape classes
        Green green = new Green();
        Shape greenCircle = new Circle(green);
        Shape greenSquare = new Square(green);

        square.applyColor();
        circle.applyColor();
        greenCircle.applyColor();
    }

}

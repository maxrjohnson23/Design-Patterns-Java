package com.max.bridge.shape1;


/**
 *  Example using shapes that does not benefit from the Bridge Pattern
 *  Each time a new shape/color is added, we need to create new classes for each color or shape combination
 */
public class Shape1BridgeDemo {

    public static void main(String[] args) {
        Circle circle = new BlueCircle();

        Square square = new RedSquare();

        circle.applyColor();
        square.applyColor();
    }

}

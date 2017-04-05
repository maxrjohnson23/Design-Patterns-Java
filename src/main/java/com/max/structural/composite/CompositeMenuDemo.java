package com.max.structural.composite;

/**
 *  Demonstrating the Composite Pattern using a tree-structured Menu
 *  Both the composite (Menu) and leaf (MenuItem) have the same interface
 */
public class CompositeMenuDemo {

    public static void main(String[] args) {

        Menu mainMenu = new Menu("Main", "/main");

        MenuItem safetyMenu = new MenuItem("Safety", "/safety");

        mainMenu.add(safetyMenu);

        Menu claimsSubMenu = new Menu("Claims", "/claims");

        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");

        claimsSubMenu.add(personalClaimsMenu);

        // the toString method recursively prints the entire menu
        System.out.println(mainMenu.toString());

    }
}

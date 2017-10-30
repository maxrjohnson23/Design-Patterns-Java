package com.max.behavioral.interpreter;

/*
* Demo of the Interpreter design pattern using a sample domain language
* This is similar to how a language would be parsed using an abstract syntax tree (AST)
*/
public class InterpreterDemo {

    // List of allowed expressions in our domain language
    static Expression buildInterpreterTree() {

        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        // Tigers and Bears
        Expression alternation1 = new AndExpression(terminal2, terminal3);

        // Lions or (Tigers and Bears)
        Expression alternation2 = new OrExpression(terminal1, alternation1);

        return new AndExpression(terminal3, alternation2);
    }

    // Build the interpreter and then interpret a specific sequence
    public static void main(String[] args) {
//      String context = "Bears Tigers"; // true
//      String context = "Lions";  // false
//      String context = "Bears Lions"; // true
        String context = "Bears Lions Tigers";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));
    }

}

//Kyle Pittman 6/10/2015.
package com.pitstop.school.programming.assignment.fourteen.V2;

public class Runner {
    public static Stack stack;
    public static boolean firstTime = true;

    /**
     * Creates a postfix expression from an infix expression
     *
     * @param infix String infix equation to transmute
     * @return String postfix equation
     */
    public static String getPostfix(String infix) {
        //initialize stack first time the method is called
        if (firstTime) {
            stack = new Stack();
            firstTime = false;
        }

        //if infix is entirely processed empty stack into the return string
        if (infix.length() == 0) {

            if (!stack.isEmpty())
                return stack.pop() + getPostfix(infix);
            else
                return "";
        } else if (charCompare(infix.charAt(0)) == 0) {             //if current char is a number add it to string then call getPostfix on remaining String
            return infix.charAt(0) + getPostfix(infix.substring(1));
        } else if (charCompare(infix.charAt(0)) >= 1 && charCompare(infix.charAt(0)) < 5) { //if char is a standard operator (not number or close paren)

            String toReturn = "";
            //purge all operators of less or equal rank into the return and out of the stack
            if (!stack.isEmpty() && charCompare((Character) stack.peek()) >= charCompare(infix.charAt(0)) && charCompare((Character) stack.peek()) != 4) {
                while (!stack.isEmpty() && charCompare((Character) stack.peek()) != 4 && charCompare(infix.charAt(0)) <= charCompare((Character) stack.peek()))
                    toReturn += stack.pop();
            }
            //add operator to stack
            stack.push(infix.charAt(0));

            //return purged operators with get postfix of remaining string
            return toReturn + getPostfix(infix.substring(1));
        } else if (charCompare(infix.charAt(0)) == 5) {                             //if it's a close parenthesis
            String toReturn = "";
            //purge stack of all ops that came in after the nearest open paren into toReturn
            while (!stack.isEmpty() && charCompare((Character) stack.peek()) != 4)
                toReturn += stack.pop();
            //get rid of open paren
            if (!stack.isEmpty() && charCompare((Character) stack.peek()) == 4)
                stack.pop();
            //return purged stack of ops with get postfix of remaining string
            return toReturn + getPostfix(infix.substring(1));
        }
        //Once the recursive method is done reset firstTime so stack is reinitialized when called again and return nothing, because postfix should already be returned
        firstTime = true;
        return "";
    }

    public static int charCompare(char c) {
        if (c == ')')
            return 5;
        if (c == '(')
            return 4;
        if (c == '^')
            return 3;
        if (c == '*' || c == '/')
            return 2;
        if (c == '+' || c == '-')
            return 1;
        return 0;
    }

    /**
     * Showcases tree class
     * Must enter equation manually, example is set up
     */
    public static void main(String[] args) {
        Tree tree = new Tree(getPostfix("3*(4-2)/5^8"));

        System.out.println("Get Prefix From Tree:");
        System.out.println("Expected: /*3-42^58");
        System.out.println("Result:   " + tree.getPrefix() + "\n");


        System.out.println("Get Postfix From Tree");
        System.out.println("Expected: 342-*58^/");
        System.out.println("Result:   " + tree.getPostfix() + "\n");

        System.out.println("Get Infix From Tree:");
        System.out.println("Expected: 3*(4-2)/5^8");
        System.out.println("Result:   " + tree.getInfix() + "\n");

        tree.simplify();

        System.out.println("Simplify Infix:");
        System.out.println("Expected: 3*2/5^8");
        System.out.println("Result:   " + tree.getInfix() + "\n");

        tree.simplify();

        System.out.println("Simplify Infix:");
        System.out.println("Expected: 3*2/390625");
        System.out.println("Result:   " + tree.getInfix() + "\n");

        tree.simplify();

        System.out.println("Simplify Infix:");
        System.out.println("Expected: 6/390625");
        System.out.println("Result:   " + tree.getInfix() + "\n");

        tree.simplify();

        System.out.println("Simplify Infix:");
        System.out.println("Expected: 1.536E-5");
        System.out.println("Result:   " + tree.getInfix() + "\n");

        tree.simplify();

        System.out.println("Get Infix From Tree:");
        System.out.println("Expected: 1.536E-5");
        System.out.println("Result:   " + tree.getInfix() + "\n");

        Tree tree2 = new Tree(getPostfix("3*(4-2)/5^8"));

        tree2.solve();
        System.out.println(tree2.getInfix());
    }
}

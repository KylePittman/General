//Kyle Pittman 6/10/2015.
package com.pitstop.school.programming.assignment.fourteen.V2;

public class Runner {
    public static Stack stack;
    public static boolean firstTime = true;

    public static String getPostfix(String infix) {
        if (firstTime) {
            stack = new Stack();
            firstTime = false;
        }

        if (infix.length() == 0) {

            if (!stack.isEmpty())
                return stack.pop() + getPostfix(infix);
            else
                return "";
        } else if (charCompare(infix.charAt(0)) == 0) {
            return infix.charAt(0) + getPostfix(infix.substring(1));
        } else if (charCompare(infix.charAt(0)) >= 1 && charCompare(infix.charAt(0)) < 5) {

            String toReturn = "";
            if (!stack.isEmpty() && charCompare( (Character) stack.peek()) >= charCompare(infix.charAt(0)) && charCompare( (Character) stack.peek()) != 4) {
                while (!stack.isEmpty() && charCompare( (Character) stack.peek()) != 4)
                    toReturn += stack.pop();
            }
            stack.push(infix.charAt(0));

            return toReturn + getPostfix(infix.substring(1));
        }
        else if (charCompare(infix.charAt(0)) == 5){
            String toReturn = "";
            while (!stack.isEmpty() && charCompare( (Character) stack.peek()) != 4)
                toReturn+=stack.pop();
            if (!stack.isEmpty() && charCompare( (Character) stack.peek()) == 4)
                stack.pop();
            return toReturn + getPostfix(infix.substring(1));
        }
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

    public static void main(String[] args) {
        Tree tree = new Tree(getPostfix("3*(4-2)/5^8"));
        System.out.println("Get Infix From Tree:");
        System.out.println("Expected: 3*(4-2)/5^8");
        System.out.println("Result:   " + tree.getInfix() + "\n");

        System.out.println("Get Prefix From Tree:");
        System.out.println("Expected: /*3-42^58");
        System.out.println("Result:   " + tree.getPrefix() + "\n");


        System.out.println("Get Postfix From Tree Infix");
        System.out.println("Expected: 342-*58^/");
        System.out.println("Result:   " + getPostfix(tree.getInfix()));
    }
}

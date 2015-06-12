//Kyle Pittman 6/9/2015.
package com.pitstop.school.programming.assignment.fourteen.V1;

public class InfixConverter {

    public static CharStack stack;
    public static boolean firstTime = true;

    public static String getPostfix(String infix) {
        if (firstTime) {
            stack = new CharStack();
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
            if (!stack.isEmpty() && charCompare(stack.peek()) >= charCompare(infix.charAt(0)) && charCompare(stack.peek()) != 4) {
                while (!stack.isEmpty() && charCompare(stack.peek()) != 4)
                    toReturn += stack.pop();
            }
                stack.push(infix.charAt(0));

            return toReturn + getPostfix(infix.substring(1));
        }
        else if (charCompare(infix.charAt(0)) == 5){
            String toReturn = "";
            while (!stack.isEmpty() && charCompare(stack.peek()) != 4)
                toReturn+=stack.pop();
            if (!stack.isEmpty() && charCompare(stack.peek()) == 4)
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
        System.out.println("Expected: 32^57/+");
        System.out.println("Result:   " + getPostfix("3^2+5/7") + "\n");

        System.out.println("Expected: 325+^7/");
        System.out.println("Result:   " + getPostfix("3^(2+5)/7") + "\n");

        System.out.println("Expected: 32^5+7/");
        System.out.println("Result:   " + getPostfix("(3^2+5)/7") + "\n");

        System.out.println("Expected: 3257/+^");
        System.out.println("Result:   " + getPostfix("3^(2+5/7)") + "\n");

        System.out.println("Expected: 32^57/+");
        System.out.println("Result:   " + getPostfix("(3^2)+(5/7)") + "\n");
    }
}

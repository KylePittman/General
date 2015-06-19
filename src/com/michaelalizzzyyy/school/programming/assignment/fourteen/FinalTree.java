//Michaela Dinman
package com.michaelalizzzyyy.school.programming.assignment.fourteen;

import java.util.Stack;

public class FinalTree {
    private String infix, postfix;
    private Stack<String> stack = new Stack<String>();
    private Stack<String> stack2 = new Stack<String>();
    private Stack<String> stackExtra = new Stack<String>();
    private FinalNode root;

    public FinalTree(String fix) {
        infix = fix;
        postfix = postFix(infix);
    }

    public String postFix(String fix) {
        String result = "";

        for (int n = 0; n < fix.length(); n++) {
            System.out.println(result);
            String currentChar = "" + fix.charAt(n);

            if (isNumber(currentChar)) {
                result += currentChar;
            } else if (isOperator(currentChar)) {
                if (!stack.empty()) {

                    if (isOperator(stack.peek()) || isParenthesis(stack.peek())) {
                        int peekPoints = getPoints(stack.peek());
                        int currentPoints = getPoints(currentChar);
                        if (isParenthesis(stack.peek()))
                            stack.push(currentChar);

                        else if (peekPoints >= currentPoints) { //Changed to else if //Changed <= to >=
                            while(!stack.isEmpty())
                                result += stack.pop();
                            stack.push(currentChar);
                            //result += currentChar;
                        }
                        else
                            stack.push(currentChar);

                        //if (isParenthesis(stack.peek()))    //Moving this to line 33
                        //    stack.push(currentChar);
                    }
                } else
                    stack.push(currentChar);
            } else if (isParenthesis(currentChar)) {
                if (isOpeningParen(currentChar)) {
                    System.out.println("Open paren");
                    stack.push(currentChar);
                }
                else {
                    //while (!stack.empty() && stack.peek() != "(") { //must use .equals with objects!
                    while (!stack.empty() && !stack.peek().equals("(")) {
                        System.out.println(stack.peek() + " Line 52 run: " + n);
                        if (stack.peek().equals(")") || stack.peek().equals("(")) {
                            stackExtra.push(stack.pop());
                        } else {
                            result += stack.pop();
                            //stack2.push(stack.pop());
                        }
                    }
                    if (stack.peek().equals("(")) //added to get "(" out of stack
                        stack.pop();
                    //stack2 is never pushed into
                    /*while (!stack2.empty()) {
                        result += stack2.pop();
                    }

                    while (!stack2.empty() && !stack.empty()) {
                        if (isParenthesis(stack.peek()))
                            stackExtra.push(stack2.pop());
                        stack.push(stack2.pop());
                    }*/

                }
                    /*
					 * use stack's search method to find openingparen closest to top
					 * 		if  -1 return null because thats impossible
					 * 
					 * while stack isnt empty and peek isnt openingparen
					 * if element is ( or )
					 * 		push into stackextra
					 * pop elements and put in stack2
					 * when openingparen is found
					 * 		pop element from stack2 and add to postfix
					 * pop elements from stack2 back to stack1
					 */
            }

        }
        while (!stack.isEmpty()) //Added to purge the stack at the end
            result+=stack.pop();
        postfix = result;
        return result;
    }

    /*pass in infix and make postfix*/
    public void generateTree(String fix) {
		/*
		 * change fix to postfix
		 * use substring and put into tempstack
		 * pop tempstack into realstack
		 * pop first element into root
		 * 		if next element is number
		 * 			set to right
		 * 		else
		 * 			set to left
		 * (^^^^^^^^^creates root and first element
		 * while stack isnt empty
		 * 		if next element is number and right is null
		 * 			set right
		 * 		else if next element is number and left is null
		 * 			set left
		 * 		else if next element is operator and right is null
		 * 			set right
		 * 			move OpFinder
		 * 		else if next element is operator and left is null
		 * 			set left
		 * 			move OpFinder
		 * 		else if next element is number and opFinder's left is null
		 * 			set left
		 * 		else if next element is number and Op Finder's right is null
		 * 			set right
		 */
    }

    public int evaluateTree() {
        return 0;
    }

    /*return postfix*/
    public String getPostfix() {
        return postfix;
    }

    /*return infix*/
    public String getInfix() {
        return infix;
    }

    /*tests if String of length 1 is a mathematical operator*/
    private boolean isOperator(String chara) {
        //if (chara.equals("+") || chara.equals("-") || chara.equals("*") || chara.equals("/"))     Original
        if (chara.equals("+") || chara.equals("-") || chara.equals("*") || chara.equals("/") || chara.equals("^")) //Added "^"
            return true;
        return false;
    }

    /*tests if String of length 1 is a mathematical operator*/
    private boolean isNumber(String chara) {
        if (isOperator(chara) || isParenthesis(chara))
            return false;
        return true;
    }

    /*tests if String of length 1 is "(" or ")"*/
    private boolean isParenthesis(String chara) {
        return (chara.equals("(") || chara.equals(")"));
    }

    /*tests if String of length 1 is "("*/
    private boolean isOpeningParen(String chara) {
            return chara.equals("(");
    }

    /*tests is String of length 1 is ")"*/
    private boolean isClosingParen(String chara) {
        return chara.equals(")");
    }

    /*pass in postfix and set the root to what it should be*/
    private void setRoot(String chara) {
        root.setInfo(chara.substring(chara.length() - 1));
    }

    /*assigns point value based on an operator's position in PEMDAS*/
    private int getPoints(String operator) {
        if (operator.equals("("))
            return 0;
        else if (operator.equals("+") || operator.equals("-"))
            return 1;
        else if (operator.equals("*") || operator.equals("/"))
            return 2;
        else if (operator.equals("^"))
            return 3;
        return 4;
    }
}
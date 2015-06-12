//Kyle Pittman 6/10/2015.
package com.pitstop.school.programming.assignment.fourteen.V1;

public class CharTree {
    private CharStack treeStack;
    private CharStack stack;
    private boolean firstTime = true;
    private CharHead head;

    public CharTree() {
        head = new CharHead();
    }

    public CharTree(String infix) {
        head = new CharHead();
        createFromPostfix(getPostfix(infix));
    }

    public void createFromPostfix(String postfix) {
        treeStack = new CharStack();
        treeStack.stackString(postfix);
        CharTreeNode temp = new CharTreeNode(treeStack.pop());
        head.setNext(temp);

        postfixTreeConstructor(temp);
    }

    private void postfixTreeConstructor(CharTreeNode c){
        if (treeStack.isEmpty())
            return;
        char aChar = treeStack.pop();
        CharTreeNode temp = new CharTreeNode(aChar);
        c.setRight(temp);
        if (charCompare(aChar) > 0)
            postfixTreeConstructor(temp);
        aChar = treeStack.pop();
        temp = new CharTreeNode(aChar);
        c.setLeft(temp);
        if (charCompare(aChar) > 0)
            postfixTreeConstructor(temp);
    }

    public String getInfix(){
        return getInfix(head.getNext());
    }

    public String getInfix(CharTreeNode c){
        if (c.getLeft() != null && c.getRight() != null)
            return "(" + getInfix(c.getLeft()) + c.getChar() + getInfix(c.getRight()) + ")";
        if (c.getLeft() != null && c.getRight() == null)
            return getInfix(c.getLeft()) + c.getChar();
        if (c.getLeft() == null && c.getRight() != null) {
            return c.getChar() + getInfix(c.getRight());
        }
        return c.getChar() + "";
    }

    public String getPrefix(){
        return getPrefix(head.getNext());
    }

    public String getPrefix(CharTreeNode c){
        if (c.getLeft() != null && c.getRight() != null)
            return c.getChar() + getPrefix(c.getLeft()) + getPrefix(c.getRight());
        if (c.getLeft() != null && c.getRight() == null)
            return c.getChar()  + getPrefix(c.getLeft());
        if (c.getLeft() == null && c.getRight() != null) {
            return c.getChar() + getPrefix(c.getRight());
        }
        return c.getChar() + "";
    }

    public String getPostfix(){
        return getPostfix(getInfix());
    }

    public String getPostfix(String infix) {
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
        } else if (charCompare(infix.charAt(0)) == 5) {
            String toReturn = "";
            while (!stack.isEmpty() && charCompare(stack.peek()) != 4)
                toReturn += stack.pop();
            if (!stack.isEmpty() && charCompare(stack.peek()) == 4)
                stack.pop();
            return toReturn + getPostfix(infix.substring(1));
        }
        firstTime = true;
        return "";
    }

    public int charCompare(char c) {
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
        CharTree tree = new CharTree("3+5/(7-3)^2");
        System.out.println(tree.getInfix());
        System.out.println(tree.getPostfix());
        System.out.println(tree.getPrefix());

    }
}

class CharHead {
    private CharTreeNode next;

    public CharHead() {

    }

    public CharTreeNode getNext() {
        return next;
    }

    public void setNext(CharTreeNode next) {
        this.next = next;
    }
}

//Kyle Pittman 6/10/2015.
package com.pitstop.school.programming.assignment.fourteen.V2;

public class Tree {

    private Head head;
    private Stack stack;
    private boolean firstTime = true;
    private Stack paren;
    private Stack ops;
    private Stack nums;

    public Tree(){
        head = new Head();
    }

    public Tree(String postfix){
        head = new Head();
        createFromPostfix(postfix);
    }

    public void createFromPostfix(String postfix) {
        stack = new Stack();
        stack.stackString(postfix);
        TwoChildNode temp = new TwoChildNode(stack.pop());
        head.setNext(temp);

        postfixTreeConstructor(temp);
    }

    public String getInfix(){
        return getInfix(head.getNext());
    }

    public String getInfix(TwoChildNode c){

        if (c.getLeft() != null && c.getRight() != null){
            int cVal = charCompare((Character)c.getInfo());
            int rVal = charCompare((Character) c.getRight().getInfo());
            int lVal = charCompare((Character) c.getLeft().getInfo());
            if ((cVal < 4 && (lVal > 0 || rVal > 0)) && (cVal > rVal && cVal > lVal)){
                if (lVal > 0 && rVal > 0)
                    return "(" + getInfix(c.getLeft()) + ")" + c.getInfo() + "(" + getInfix(c.getRight()) + ")";
                if (lVal > 0)
                    return "(" + getInfix(c.getLeft()) + ")" + c.getInfo() + getInfix(c.getRight());
                return getInfix(c.getLeft()) + c.getInfo() + "(" + getInfix(c.getRight()) + ")";
            }

            return getInfix(c.getLeft()) + c.getInfo() + getInfix(c.getRight());
        }

        if (c.getLeft() != null && c.getRight() == null)
            return getInfix(c.getLeft()) + c.getInfo();
        if (c.getLeft() == null && c.getRight() != null) {
            return c.getInfo() + getInfix(c.getRight());
        }
        return c.getInfo() + "";
    }

    public String getPrefix(){
        return getPrefix(head.getNext());
    }

    private String getPrefix(TwoChildNode c){
        if (c.getLeft() != null && c.getRight() != null)
            return c.getInfo() + getPrefix(c.getLeft()) + getPrefix(c.getRight());
        if (c.getLeft() != null && c.getRight() == null)
            return c.getInfo()  + getPrefix(c.getLeft());
        if (c.getLeft() == null && c.getRight() != null) {
            return c.getInfo() + getPrefix(c.getRight());
        }
        return c.getInfo() + "";
    }

    private void postfixTreeConstructor(TwoChildNode c){
        if (stack.isEmpty())
            return;
        char aChar = (Character) stack.pop();
        TwoChildNode temp = new TwoChildNode(aChar);
        c.setRight(temp);
        if (charCompare(aChar) > 0)
            postfixTreeConstructor(temp);
        aChar = (Character) stack.pop();
        temp = new TwoChildNode(aChar);
        c.setLeft(temp);
        if (charCompare(aChar) > 0)
            postfixTreeConstructor(temp);
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
}

class Head {
    private TwoChildNode next;

    public Head() {

    }

    public TwoChildNode getNext() {
        return next;
    }

    public void setNext(TwoChildNode next) {
        this.next = next;
    }
}

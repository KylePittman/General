//Kyle Pittman 6/5/2015.
package com.pitstop.school.programming.assignment.fourteen.V1;

public class CharStack {
    private CharNode head;

    public CharStack() {
        head = new CharNode();
    }

    public CharStack(CharNode charNode) {
        head = charNode;
    }

    public void push(char aChar) {
        if (head.getNext() == null) {
            head.setNext(new CharNode(aChar));
        } else {
            CharNode temp = new CharNode(aChar);
            temp.setNext(head.getNext());
            head.setNext(temp);
        }
    }

    public char pop() {
        char toReturn = head.getNext().getChar();
        head.setNext(head.getNext().getNext());
        return toReturn;
    }

    public char peek() {
        return head.getNext().getChar();
    }

    public boolean isEmpty(){
        if (head.getNext() == null)
            return true;
        return false;
    }

    public void stackString(String in){
        for (int i = 0; i < in.length(); i++){
            push(in.charAt(i));
        }
    }
}

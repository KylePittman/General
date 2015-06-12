//Kyle Pittman 6/5/2015.
package com.pitstop.school.programming.assignment.fourteen.V1;

public class CharNode {
    private char aChar;
    private CharNode next;

    public CharNode() {
        next = null;
    }

    public CharNode(char aChar) {
        this.aChar = aChar;
        next = null;
    }

    public char getChar() {
        return aChar;
    }

    public void setChar(char aChar) {
        this.aChar = aChar;
    }

    public CharNode getNext() {
        return next;
    }

    public void setNext(CharNode next) {
        this.next = next;
    }
}

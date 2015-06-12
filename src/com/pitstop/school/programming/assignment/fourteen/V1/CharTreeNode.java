//Kyle Pittman 6/10/2015.
package com.pitstop.school.programming.assignment.fourteen.V1;

public class CharTreeNode {
    private char aChar;
    private CharTreeNode right;
    private CharTreeNode left;

    public CharTreeNode(){
        right = null;
        left = null;
    }

    public CharTreeNode(char aChar){
        this.aChar = aChar;
        right = null;
        left = null;
    }

    public CharTreeNode getLeft() {
        return left;
    }

    public void setLeft(CharTreeNode left) {
        this.left = left;
    }

    public CharTreeNode getRight() {
        return right;
    }

    public void setRight(CharTreeNode right) {
        this.right = right;
    }

    public char getChar() {
        return aChar;
    }

    public void setChar(char aChar) {
        this.aChar = aChar;
    }
}

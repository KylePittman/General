package com.cousCous.school.programming.assignment.fourteen;

public class stringNode {

    private String info;
    private stringNode left;
    private stringNode right;

    public stringNode(String equation){
        info = equation;
        left = null;
        right = null;
    }
    

    public stringNode getLeft() {
        return left;
    }
    
    public stringNode getRight() {
        return right;
    }

    public String getNum() {
        return info;
    }

    public void setNum(String equation) {
        info = equation;
    }

    public void setLeft(stringNode leftNode) {
        left = leftNode;
    }
    
    public void setRight(stringNode RightNode) {
        right = RightNode;
    }
}

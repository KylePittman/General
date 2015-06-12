//Kyle Pittman 6/10/2015.
package com.pitstop.school.programming.assignment.fourteen.V2;

public class TwoChildNode<T>{

    private T info;
    private TwoChildNode right;
    private TwoChildNode left;

    public TwoChildNode(){
        info = null;
        right = null;
        left = null;
    }

    public TwoChildNode(T info){
        this.info = info;
        right = null;
        left = null;
    }

    public TwoChildNode getLeft() {
        return left;
    }

    public void setLeft(TwoChildNode left) {
        this.left = left;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public TwoChildNode getRight() {
        return right;
    }

    public void setRight(TwoChildNode right) {
        this.right = right;
    }

}

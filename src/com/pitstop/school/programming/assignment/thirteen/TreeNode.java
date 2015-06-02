package com.pitstop.school.programming.assignment.thirteen;

/**
 * Created by Kyle on 6/1/2015.
 */
public class TreeNode {

    private TreeNode right;
    private TreeNode left;
    private int info;

    public TreeNode() {
        right = null;
        left = null;
    }

    public TreeNode(int info) {
        right = null;
        left = null;
        this.info = info;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

}

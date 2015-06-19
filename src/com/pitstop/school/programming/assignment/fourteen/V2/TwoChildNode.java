//Kyle Pittman 6/10/2015.
package com.pitstop.school.programming.assignment.fourteen.V2;

/**
 * Node for the Binary Tree
 * @param <T> type of the variable to be stored
 */
public class TwoChildNode<T>{

    private T info;
    private TwoChildNode right;
    private TwoChildNode left;
    private int depth;

    /**
     * Constructs an empty TwoChildNode
     */
    public TwoChildNode(){
        info = null;
        right = null;
        left = null;
    }

    /**
     * Constructs a TwoChildNode with value info
     * @param info value to be stored in TwoChildNode
     */
    public TwoChildNode(T info){
        this.info = info;
        right = null;
        left = null;
    }

    /**
     * Gets left child of this TwoChildNode
     * @return TwoChildNode to the left of this TwoChildNode
     */
    public TwoChildNode getLeft() {
        return left;
    }

    /**
     * Sets left child of this TwoChildNode
     * @param left TwoChildNode to be left of this TwoChildNode
     */
    public void setLeft(TwoChildNode left) {
        this.left = left;
    }

    /**
     * Gets the value stored by this TwoChildNode
     * @return info contained by this TwoChildNode
     */
    public T getInfo() {
        return info;
    }

    /**
     * Sets the value stored by this TwoChildNode
     * @param info value to be stored in TwoChildNode
     */
    public void setInfo(T info) {
        this.info = info;
    }

    /**
     * Gets the child right of this TwoChildNode
     * @return TwoChildNode to the right of this TwoChildNode
     */
    public TwoChildNode getRight() {
        return right;
    }

    /**
     * Sets right child of this TwoChildNode
     * @param right TwoChildNode to be right of this TwoChildNode
     */
    public void setRight(TwoChildNode right) {
        this.right = right;
    }

    /**
     * Returns the depth into the tree the node is
     * @return depth of TwoChildNode
     */
    public int getDepth() {
        return depth;
    }

    /**
     * Sets the Depth of the TwoChildNode
     * @param depth depth into tree of TwoChildNode
     */
    public void setDepth(int depth) {
        this.depth = depth;
    }
}

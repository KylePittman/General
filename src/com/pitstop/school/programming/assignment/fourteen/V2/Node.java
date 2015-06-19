//Kyle Pittman 6/10/2015.
package com.pitstop.school.programming.assignment.fourteen.V2;

/**
 * Node for Stack Class, can contain any Class type
 * @param <T> Type of Class to be stored in Node
 */
public class Node<T> {

    private T info;
    private Node next;

    /**
     * Constructs an empty Node
     */
    public Node(){
        info = null;
        next = null;
    }

    /**
     * Constructs a Node with info
     * @param info the value passed in to be stored by the Node
     */
    public Node(T info){
        this.info = info;
        next = null;
    }

    /**
     * Gets info
     * @return info
     */
    public T getInfo() {
        return info;
    }

    /**
     * Sets info
     * @param info new value to be stored
     */
    public void setInfo(T info) {
        this.info = info;
    }

    /**
     * Gets the next Node
     * @return next Node
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets next Node
     * @param next new next Node
     */
    public void setNext(Node next) {
        this.next = next;
    }
}

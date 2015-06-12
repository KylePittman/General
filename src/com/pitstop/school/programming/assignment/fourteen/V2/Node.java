//Kyle Pittman 6/10/2015.
package com.pitstop.school.programming.assignment.fourteen.V2;

public class Node<T> {

    private T info;
    private Node next;

    public Node(){
        info = null;
        next = null;
    }

    public Node(T info){
        this.info = info;
        next = null;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

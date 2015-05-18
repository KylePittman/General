//Kyle Pittman 5/14/2015.
package com.pitstop.school.programming.assignment.twelve;

public class Node {
    private String info;
    private Node next;

    public Node(String info, Node next){
        this.info = info;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

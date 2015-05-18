//Kyle Pittman 5/14/2015.
package com.pitstop.school.programming.assignment.twelve;

public class Queue {
    private boolean hasItems = false;
    private Head head = new Head(null, null);

    public void enQueue(String info) {
        if(!hasItems){
            Node temp = new Node(info, null);
            head.setNext(temp);
            head.setLast(temp);
            hasItems = true;
        }
        else{
            Node temp = new Node(info, null);
            head.getLast().setNext(temp);
            head.setLast(temp);
        }
    }

    public void writeQueue() {
        String toReturn = "";
        Node reader = head;
        while(reader != null)
        {
            if(reader != head){
                toReturn+= reader.getInfo();
                reader= reader.getNext();
                if(reader != null)
                    toReturn+=", ";
            }
            else{
                reader = reader.getNext();
            }
        }
        System.out.println(toReturn);
    }

    public String deQueue() {
        if (hasItems) {
            String toReturn = head.getNext().getInfo();
            head.setNext(head.getNext().getNext());
            if(head.getNext() == null) hasItems = false;
            return toReturn;
        }
        return null;
    }
}

class Head extends Node{
    private Node last;
    public Head(Node first, Node last){
        super(null, first);
        this.last = last;
    }

    @Override
    public Node getNext() {
        return super.getNext();
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }
}

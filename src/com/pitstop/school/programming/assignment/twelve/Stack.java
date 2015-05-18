//Kyle Pittman 5/14/2015.
package com.pitstop.school.programming.assignment.twelve;

public class Stack {
    private Node head = new Node(null, null);
    private boolean hasItems = false;

    public String pop() {
        if(hasItems){
            String toReturn = head.getNext().getInfo();
            head.setNext(head.getNext().getNext());
            if(head.getNext() == null) hasItems = false;
            return toReturn;
        }
        return null;
    }

    public void push(String str) {
        if(!hasItems){
            Node temp = new Node(str, null);
            head.setNext(temp);
            hasItems = true;
        }
        else{
            Node temp = new Node(str, head.getNext());
            head.setNext(temp);
        }
    }

    public void writeStack() {
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
}

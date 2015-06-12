//Kyle Pittman 6/10/2015.
package com.pitstop.school.programming.assignment.fourteen.V2;

public class Stack {

    private Node head;

    public Stack(){
        head = new Node();
    }

    public Stack(Object obj){
        head = new Node();
        head.setNext(new Node(obj));
    }

    public void push(Object obj) {
        if (head.getNext() == null) {
            head.setNext(new Node(obj));
        } else {
            Node temp = new Node(obj);
            temp.setNext(head.getNext());
            head.setNext(temp);
        }
    }

    public Object pop() {
        Object toReturn = head.getNext().getInfo();
        head.setNext(head.getNext().getNext());
        return toReturn;
    }

    public Object peek(){
        return head.getNext().getInfo();
    }

    public boolean isEmpty(){
        return (head.getNext() == null);
    }

    public void purgeStack(){
        head.setNext(null);
    }

    public void invertStack(){
        Stack stack = this;
        purgeStack();

        while (!stack.isEmpty()){
            push(stack.pop());
        }
    }

    public void stackString(String string){
        for (int i = 0; i < string.length(); i++) {
            push(string.charAt(i));
        }
    }
}

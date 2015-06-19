//Kyle Pittman 6/10/2015.
package com.pitstop.school.programming.assignment.fourteen.V2;

/**
 * Class Stack is a simple Stack constructed of nodes
 */
public class Stack {

    private Node head;

    /**
     * Construct an empty stack
     */
    public Stack() {
        head = new Node();
    }

    /**
     * Construct a stack with an Node in it
     *
     * @param obj is the variable to be put into the Node which goes into the stack
     */
    public Stack(Object obj) {
        head = new Node();
        head.setNext(new Node(obj));
    }

    /**
     * Standard Stack push method, adds item to stack
     * @param obj is the item to be added to the stack
     */
    public void push(Object obj) {
        if (head.getNext() == null) {
            head.setNext(new Node(obj));
        } else {
            Node temp = new Node(obj);
            temp.setNext(head.getNext());
            head.setNext(temp);
        }
    }

    /**
     * Standard Stack pop method, pops top item form Stack
     * @return the top item of the stack
     */
    public Object pop() {
        Object toReturn = head.getNext().getInfo();
        head.setNext(head.getNext().getNext());
        return toReturn;
    }

    /**
     * Standard Stack peek method, returns top item of stack doesn't pop it
     * @return top item of stack
     */
    public Object peek() {
        return head.getNext().getInfo();
    }

    /**
     * Checks if stack contains items
     * @return true if empty, false if not
     */
    public boolean isEmpty() {
        return (head.getNext() == null);
    }

    /**
     * Empties Stack
     */
    public void purgeStack() {
        head.setNext(null);
    }

    /**
     * Inverts the order of the stack
     */
    public void invertStack() {
        Stack stack = this;
        purgeStack();

        while (!stack.isEmpty()) {
            push(stack.pop());
        }
    }

    /**
     * Returns the size of the stack
     * @return size of stack
     */
    public int size() {
        Node temp = head.getNext();
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    /**
     * Turns a String into a stack of characters
     * First char in String is last in the Stack
     * and last char in String is first in Stack
     * @param string String to be stacked
     */
    public void stackString(String string) {
        for (int i = 0; i < string.length(); i++) {
            push(string.charAt(i));
        }
    }

    /**
     * Writes the stack, from head, to a string
     * @return String of stack contents
     */
    public String toString() {
        String toReturn = "";
        Node temp = head.getNext();
        while (temp != null) {
            toReturn += ("" + temp.getInfo());
            temp = temp.getNext();
        }
        return toReturn;
    }
}

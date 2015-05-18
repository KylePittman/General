package com.pitstop.school.programming.assignment.twelve;

public class StackQueueRunner{
    public static void main(String[] args) {
        System.out.println("\t\tWorking with Queues\n");
        Queue aQueue = new Queue();

        aQueue.enQueue("person01");
        aQueue.enQueue("person02");
        aQueue.enQueue("person03");
        aQueue.enQueue("person04");
        System.out.println("The Queue Currently Contains:\t");
        aQueue.writeQueue();

        System.out.println("Taken out of the Queue " + aQueue.deQueue());
        System.out.print("The Queue currently contains:\t");
        aQueue.writeQueue();

        System.out.println("Placing Person05 into the Queue");
        aQueue.enQueue("person05");
        System.out.println("Taken out of the Queue " + aQueue.deQueue());

        System.out.print("The Queue currently contains: ");
        aQueue.writeQueue();


        System.out.println("\n\t\tWorking with Stacks\n");

        Stack aStack = new Stack();
        aStack.push("apple");
        aStack.push("banana");
        aStack.push("orange");
        aStack.push("pear");

        System.out.print("The Stack currently contains: ");
        aStack.writeStack();

        System.out.println("Taken out of the Stack " + aStack.pop());

        System.out.println("Placing grape into the Stack");
        aStack.push("grape");
        System.out.print("The Stack currently contains: ");
        aStack.writeStack();

        System.out.println("Taken out of the Stack " + aStack.pop());
        System.out.print("The Stack currently contains: ");
        aStack.writeStack();
    }
}
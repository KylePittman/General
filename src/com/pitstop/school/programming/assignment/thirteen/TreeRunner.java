package com.pitstop.school.programming.assignment.thirteen;

/**
 * Created by Kyle on 6/1/2015.
 */
public class TreeRunner {
    public static void main(String[] args) {
        Tree atree = new Tree();

        atree.insert(85);
        atree.insert(98);
        atree.insert(50);
        atree.insert(37);
        atree.insert(60);
        atree.insert(76);
        atree.insert(101);
        atree.insert(45);
        atree.insert(90);
        atree.insert(52);
        atree.insert(95);
        atree.insert(67);
        atree.insert(110);
        atree.insert(103);

        atree.inOrder();
        atree.preOrder();
        atree.postOrder();

        atree.delete(45);

        atree.delete(53);
        atree.inOrder();

        atree.delete(101);
        atree.inOrder();

        atree.delete(85);
        atree.inOrder();
    }
}

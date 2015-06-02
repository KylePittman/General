package com.pitstop.school.programming.assignment.thirteen;

/**
 * Created by Kyle on 6/1/2015.
 */
public class Tree {

    private Head head;
    private TreeNode current;
    private TreeNode previous;

    public Tree() {
        head = new Head();
    }

    public void insert(int info) {

        TreeNode temp = new TreeNode(info);

        if (head.getNext() == null) {
            head.setNext(temp);
        } else {

            boolean inserted = false;
            current = head.getNext();

            while (!inserted) {
                previous = current;

                if (current.getInfo() < temp.getInfo()) {
                    if (current.getRight() != null)
                        current = current.getRight();
                    else {
                        current.setRight(temp);
                        inserted = true;
                    }
                } else {
                    if (current.getLeft() != null) {
                        current = current.getLeft();
                    } else {
                        current.setLeft(temp);
                        inserted = true;
                    }
                }

            }
        }

        System.out.println("Inserted: " + info);
    }

    public void inOrder() {
        System.out.println(inOrder(head.getNext()));
    }

    public String inOrder(TreeNode node) {
        if (node.getLeft() != null && node.getRight() != null)
            return inOrder(node.getLeft()) + node.getInfo() + " " + inOrder(node.getRight());
        if (node.getLeft() != null && node.getRight() == null)
            return inOrder(node.getLeft()) + node.getInfo() + " ";
        if (node.getLeft() == null && node.getRight() != null) {
            return node.getInfo() + " " + inOrder(node.getRight());
        }
        return node.getInfo() + " ";
    }

    public void preOrder() {
        System.out.println(preOrder(head.getNext()));
    }

    public String preOrder(TreeNode node) {
        if (node.getLeft() != null && node.getRight() != null)
            return node.getInfo() + " " + preOrder(node.getLeft()) + preOrder(node.getRight());
        if (node.getLeft() != null && node.getRight() == null)
            return node.getInfo() + " " + preOrder(node.getLeft());
        if (node.getLeft() == null && node.getRight() != null) {
            return node.getInfo() + " " + preOrder(node.getRight());
        }
        return node.getInfo() + " ";
    }

    public void postOrder() {
        System.out.println(postOrder(head.getNext()));
    }

    public String postOrder(TreeNode node) {
        if (node.getLeft() != null && node.getRight() != null)
            return postOrder(node.getLeft()) + postOrder(node.getRight()) + node.getInfo() + " ";
        if (node.getLeft() != null && node.getRight() == null)
            return postOrder(node.getLeft()) + node.getInfo() + " ";
        if (node.getLeft() == null && node.getRight() != null)
            return postOrder(node.getRight()) + node.getInfo() + " ";
        return node.getInfo() + " ";
    }

    public void delete(int val) {
        if (head.getNext() == null) {
            System.out.println("Empty Tree");
            return;
        }

        previous = null;
        current = head.getNext();
        boolean found = false;

        while (!found) {
            if (val < current.getInfo() && current.getLeft() != null) {
                previous = current;
                current = current.getLeft();
            } else if (val > current.getInfo() && current.getRight() != null) {
                previous = current;
                current = current.getRight();
            } else if (val == current.getInfo()) {
                found = true;
            } else if (current.getLeft() == null && current.getRight() == null) {
                System.out.println("Cannot find " + val + " to delete.");
                return;
            }

        }

        if (current.getLeft() != null && current.getRight() != null) {
            boolean replaced = false;
            TreeNode temp = current.getLeft();
            TreeNode tempPrevious = temp;
            while (!replaced) {

                if (temp.getRight() != null) {
                    tempPrevious = temp;
                    temp = temp.getRight();
                } else {
                    replaced = true;
                }
            }

            if (head.getNext().equals(current)) {
                tempPrevious.setRight(temp.getLeft());
                head.setNext(temp);
                temp.setLeft(current.getLeft());
                temp.setRight(current.getRight());
            } else {
                previous.setRight(temp);
                tempPrevious.setLeft(current.getLeft());
                tempPrevious.setRight(current.getRight());
            }
        } else if (current.getLeft() == null && current.getRight() != null) {
            previous.setRight(current.getRight());
        } else if (current.getLeft() != null) {
            previous.setLeft(current.getLeft());
        } else {
            previous.setRight(null);
        }
        System.out.println("Deleted: " + val);
    }
}

class Head {

    private TreeNode next;

    public Head() {
        next = null;
    }

    public TreeNode getNext() {
        return next;
    }

    public void setNext(TreeNode next) {
        this.next = next;
    }
}

//Kyle Pittman 6/11/2015.
package com.michaelalizzzyyy.school.programming.assignment.fourteen;

public class Runner {
    public static void main(String[] args) {
        FinalTree finalTree = new FinalTree("4*(2+3)");
        System.out.println(finalTree.postFix("4*(2+3)"));
    }
}

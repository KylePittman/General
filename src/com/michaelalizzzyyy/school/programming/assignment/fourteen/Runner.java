//Kyle Pittman 6/11/2015.
package com.michaelalizzzyyy.school.programming.assignment.fourteen;

public class Runner {
    public static void main(String[] args) {
        String equation = "1+2*3-4^5/6";
        FinalTree finalTree = new FinalTree(equation);
        System.out.println(finalTree.postFix(equation));
    }
}

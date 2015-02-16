package com.pitstop.school.programming.assignment.three;//General Created by Kyle Pittman on 10/20/2014.

import java.util.Scanner;

public class TriangleRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] input = new double[3];
        System.out.print("Side 1: ");
        input[0] = in.nextDouble();
        System.out.print("Side 2: ");
        input[1] = in.nextDouble();
        System.out.print("Side 3: ");
        input[2] = in.nextDouble();
        Triangle user = new Triangle(input[0], input[1], input[2]);
        user.getInfo();
    }
}

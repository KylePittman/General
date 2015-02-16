//Kyle Pittman 11/24/2014.
package com.pitstop.school.lab.eight.two;

import java.util.Scanner;

public class ScoreRunner {
    public static void main(String[] args) {
        ScoreSet test = new ScoreSet();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.print(i + ": ");
            test.add(in.nextInt());
        }
        System.out.println(test.averageWithoutLowest2());
        System.out.println(test.toString());
    }
}

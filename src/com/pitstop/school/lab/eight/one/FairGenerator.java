//Kyle Pittman 11/18/2014.
package com.pitstop.school.lab.eight.one;

import java.util.Random;
import java.util.Scanner;

public class FairGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int range;
        int run;
        System.out.println("What is the range of the generator: ");
        range = in.nextInt();
        System.out.println("How many trials would you like to perform: ");
        run = in.nextInt();
        int[] numbers = new int[range];
        Random generator;
        generator = new Random();

        for (int i = 0; i < range; i++){
            numbers[i] = 0;
        }


        for(int i = 0; i < run; i++){

            numbers[generator.nextInt(range)]++;
        }

        for (int i = 0; i < range; i++){
            System.out.print(i + ": ");
            System.out.println(numbers[i]);
        }

        //number = generator.nextInt(range);
    }
}

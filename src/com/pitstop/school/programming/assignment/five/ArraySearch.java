//Kyle Pittman 12/4/2014.
package com.pitstop.school.programming.assignment.five;

import java.util.Random;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int average = 0;
        int[] randoms = new int[100];
        String spaces = "      ";

        for (int i = 0; i < 100; i++) {
            randoms[i] = generator.nextInt(1000)+1;
        }

        for(int i = 0; i < 20; i++){
            for (int j = i*5; j < i*5+5; j++) {

                System.out.print("| " + randoms[j] +spaces.substring(0, 3 - (int) (Math.log10(randoms[j]))));
                average+=randoms[j];
            }
            System.out.println("|");
        }

        average/=100;
        System.out.println(average);
        int prints = 0;
        for(int i = 0; i < 20; i++){
            for (int j = i*5; j < i*5+5; j++) {
                if (randoms[j] > average - 50 && randoms[j] < average + 50) {
                    System.out.print("| " + randoms[j] + spaces.substring(0, 3 - (int) (Math.log10(randoms[j]))));
                    prints++;
                    if(prints == 5) {
                        System.out.println("|");
                        prints = 0;
                    }
                }
            }

        }
        if(prints != 0){
            System.out.println("|");
        }
        int input = 0;

        System.out.println();
        System.out.print("Check for: ");
        input = in.nextInt();

        boolean found = false;
        int placeOfMatch = 0;

        for (int i = 0; i < 100 && !found; i++) {
            if(input == randoms[i]){
                found = true;
                placeOfMatch = i;
            }
        }
        if(found) System.out.println("Your number was found in spot " + placeOfMatch + ".");
        else System.out.println("Your number was not in the generated array.");
    }
}

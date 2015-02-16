//Kyle Pittman 12/8/2014.
package com.pitstop.school.miscellaneous.magicSquare;

import java.util.Random;
import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        while(true){
        int size = 0;
        int initialSum = 0;
        int sum = 0;
        boolean random = true;
        boolean isMagic = true;
        String answer = "";
        Random generator = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("Size of square");
        size = in.nextInt();
        String spaces = "      ";
        int[][] magic = new int[size][size];

        System.out.println("Would you like to enter the numbers manually? (Y/N)");
        while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
            answer = in.nextLine();
        }
        if (answer.equalsIgnoreCase("y")) random =false;

        if(random) {
            System.out.println("Random Range?");
            int range = in.nextInt();
            for (int i = 0; i < magic.length; i++) {
                for (int j = 0; j < magic.length; j++) {
                    magic[i][j] = generator.nextInt(range) + 1;
                }
            }
        }
        else{
            for (int i = 0; i < magic.length; i++) {
                for (int j = 0; j < magic.length; j++) {
                    System.out.print(j);
                    magic[i][j] = in.nextInt();
                }
            }
        }
            for (int i = 0; i < magic.length; i++) {
                for (int j = 0; j < magic.length; j++) {
                    System.out.print("| " + magic[i][j] +spaces.substring(0, 2 - (int) (Math.log10(magic[i][j]))));
                }
                System.out.println("|");
            }

        for (int i = 0; i < magic.length; i++) {
            initialSum += magic[0][i];
        }

        for (int i = 0; i < magic.length && isMagic; i++) {
            sum = 0;
            for (int j = 0; j < magic.length; j++) {
               sum += magic[i][j];
            }
            if (sum != initialSum) isMagic = false;
        }
        if (isMagic)
        for (int i = 0; i < magic.length && isMagic; i++) {
            sum = 0;
            for (int j = 0; j < magic.length; j++) {
                sum += magic[j][i];
            }
            if (sum != initialSum) isMagic = false;
        }
        if(isMagic){
            sum = 0;
            for (int j = 0; j < magic.length; j++) {
                sum += magic[j][magic.length-1-j];
            }
            if (sum != initialSum) isMagic = false;
            sum = 0;
            for (int j = 0; j < magic.length; j++) {
                sum += magic[j][j];
            }
            if (sum != initialSum) isMagic = false;
        }
        System.out.println("Initial Sum: " + initialSum + "\nIs a magic square: " + isMagic);
    }
    }

}

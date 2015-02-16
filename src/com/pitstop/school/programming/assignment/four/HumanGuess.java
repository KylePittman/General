//Kyle Pittman 11/17/2014.
package com.pitstop.school.programming.assignment.four;

import java.util.Random;
import java.util.Scanner;

public class HumanGuess {
    public static Random generator;
    public static int number;
    public static int ceiling;
    public static int floor;
    public static int guess;
    public static int iteration = 0;
    static int input;


    public HumanGuess (int floorIn, int ceilingIn){
        generator = new Random();
        number = generator.nextInt(100);
        floor = floorIn;
        ceiling = ceilingIn;
        guess = (floor + ceiling)/2;
    }



    public static void play(){
        Scanner in = new Scanner(System.in);
        System.out.println("My number is an integer between 0 and 100");
       guess = 50;
        do {
            System.out.println("Guess: ");
            input = in.nextInt();
            if (input > 100 || input < 0) System.out.println("Invalid guess");
            else if (input < number) System.out.println("Guess higher");
            else if(input > number ) System.out.println("Guess lower");
            iteration++;
        } while (input != number);

        System.out.println("Number of guesses: " + iteration);

    }
}

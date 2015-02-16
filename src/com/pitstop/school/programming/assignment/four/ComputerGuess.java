//Kyle Pittman 11/10/2014.
package com.pitstop.school.programming.assignment.four;

import java.util.Scanner;

public class ComputerGuess {
    public static int ceiling;
    public static int floor;
    public static int guess;
    public static int iteration = 0;
    static String input = " ";

    public ComputerGuess (int floorIn, int ceilingIn){
        floor = floorIn;
        ceiling = ceilingIn;
        guess = (floor + ceiling)/2;
    }

    public static void guessHigher(){
        floor = guess+1;
        guess = (floor + ceiling)/2;
    }
    public static void guessLower(){
        ceiling = guess-1;
        guess = (floor + ceiling)/2;
    }

    public static void play(){
        Scanner in = new Scanner(System.in);
        System.out.println("Think of an integer between 0 and 100");
        System.out.println("The computer will begin guessing, enter 'too high' if the computer's guess is too high, \nor 'too low' if it guesses too low. Enter correct if the machine guesses correct.");
        guess = 50;
        input = "";
        while (!input.equalsIgnoreCase("correct")){
            System.out.println("My guess is: " + guess);
            input = in.nextLine();
            if (input.equalsIgnoreCase("too high")) guessLower();
            else if (input.equalsIgnoreCase("too low")) guessHigher();
            else if (!input.equalsIgnoreCase("correct")) System.out.println("Please enter: 'too high', 'too low', or 'correct'");
            iteration++;
        }
        System.out.println("Number of guesses: " + iteration);

    }
}

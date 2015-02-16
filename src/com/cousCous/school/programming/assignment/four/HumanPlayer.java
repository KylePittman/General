package com.cousCous.school.programming.assignment.four;
//Marcus Silcox 11/13/14
import java.util.Random;
import java.util.Scanner;

public class HumanPlayer
{


        private boolean isit = false;
        private Random number = new Random();
        private Scanner input = new Scanner(System.in);
        private int attempts = 0;

        public HumanPlayer()
        {
        }

    public static void play() {
         boolean isit = false;
         Random number = new Random();
         Scanner input = new Scanner(System.in);
         int attempts = 1;
        int theNumber = number.nextInt(101);
        System.out.println("Please try and guess:");
        while (isit == false) {
            int guess = input.nextInt();
            attempts++;
            if (guess > theNumber) {
                System.out.print("your guess of ");
                System.out.print(guess);
                System.out.println(" was too high, please guess again.");
            }
            if (guess < theNumber) {
                System.out.print("your guess of ");
                System.out.print(guess);
                System.out.println(" was too low, please guess again.");
            }
            if (guess == theNumber) {
                System.out.print("your guess of ");
                System.out.print(guess);
                System.out.println(" was right!!");
                isit = true;
            }

        }


    }
}
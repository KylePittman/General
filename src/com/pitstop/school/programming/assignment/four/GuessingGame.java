//Kyle Pittman 11/17/2014.
package com.pitstop.school.programming.assignment.four;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        boolean bored = false;
        while(!bored) {
            System.out.println("Choose to Guess(G), have the Computer Guess (C), or Quit (Q)");
            input = in.nextLine();
            if (input.equalsIgnoreCase("g")){
                HumanGuess game = new HumanGuess(0,100);
                HumanGuess.play();
            }
            else if (input.equalsIgnoreCase("c")) {
                ComputerGuess first = new ComputerGuess(0, 100);
                ComputerGuess.play();
            }
            else if (input.equalsIgnoreCase("q")) bored = true;
            else System.out.println("Invalid entry");
        }
    }
}

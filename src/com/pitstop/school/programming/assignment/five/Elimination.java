//Kyle Pittman 12/11/2014.
package com.pitstop.school.programming.assignment.five;

import java.util.Random;
import java.util.Scanner;

public class Elimination {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random die = new Random();

        boolean[] tiles = new boolean[13];
        boolean done = false;
        boolean dicePossible = true;
        boolean sumPossible = true;
        boolean legal = false;
        boolean validInput = false;

        int score = 0;
        int[] dice = new int[2];

        String response = "";


        for (int i = 0; i < tiles.length; i++) {
            tiles[i] = false;   //false means down
        }

        System.out.println("Elimination is a one player game. The board consists of a set of 12 tiles, numbered 1 through 12. The \n" +
                "\n" +
                "player rolls a pair of dice and removes tiles based on the numbers shown on the dice. For each roll, the \n" +
                "\n" +
                "player can remove either the two tiles corresponding to the numbers shown on the dice or a single tile \n" +
                "\n" +
                "corresponding to the sum of the numbers on the dice. If the player rolls doubles (the same number on \n" +
                "\n" +
                "both dice). The player can remove only the tile corresponding to the sum of the dice. Play continues \n" +
                "\n" +
                "until the player cannot make a legal move or all the tiles have been removed. The sum of the remaining \n" +
                "\n" +
                "tiles is the player’s score. The goal is to have a low score.\n");

        while(!done) {
            dicePossible = true;
            sumPossible = true;
            System.out.print("| ");
            for (int i = 1; i < tiles.length; i++) {
                System.out.print(i + " | ");
            }
            System.out.println();
            System.out.print("| ");
            for (int i = 1; i < tiles.length; i++) {
                if (i < 10) {
                    if (tiles[i]) System.out.print("+ | ");
                    else System.out.print("= | ");
                } else {
                    if (tiles[i]) System.out.print("+  | ");
                    else System.out.print("=  | ");
                }
            }
            System.out.println();
            dice[0] = die.nextInt(6) + 1;
            dice[1] = die.nextInt(6) + 1;
            System.out.println("You rolled: " + dice[0] + " & " + dice[1]);

            if ((tiles[dice[0]] || tiles[dice[1]]) || dice[0] == dice[1]) dicePossible = false;
            if (tiles[dice[0] + dice[1]]) sumPossible = false;

            if (dicePossible || sumPossible) {
                legal = false;

                while (!legal && !done) {
                    System.out.println("Would you like to use the [D]ice, [S]um, or [Q]uit?");

                    response = "";
                    validInput = false;
                    while (!validInput) {
                        response = in.nextLine();
                        if (response.equalsIgnoreCase("d") || response.equalsIgnoreCase("s") || response.equalsIgnoreCase("q"))
                            validInput = true;
                    }

                    if (response.equalsIgnoreCase("d")) {
                        if (dicePossible) {
                            tiles[dice[0]] = true;
                            tiles[dice[1]] = true;
                            legal = true;
                        } else System.out.println("You cannot use the dice individually");
                    }

                    if (response.equalsIgnoreCase("s")) {
                        if (sumPossible) {
                            tiles[dice[0] + dice[1]] = true;
                            legal = true;
                        } else System.out.println("You cannot use the dice combined");
                    }

                    if (response.equalsIgnoreCase("q")) done = true;
                }
            }
            else{
                System.out.println("No more possible combinations.");
                done = true;
            }
        }

        for (int i = 1; i < tiles.length; i++) {
            if (!tiles[i]) score+=i;
        }
        System.out.print("You scored " + score);
        if (score < 5) System.out.println(", great job!");
        else if(score < 20) System.out.println(", good try");
        else System.out.println(", ...Maybe next time?");
    }

}

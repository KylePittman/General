//Kyle Pittman 12/19/2014.
package com.pitstop.school.programming.assignment.six;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.util.Scanner;

public class GameOfLifeDriver {

    public static void main(String[] args) throws IOException {
        // initialize variables

        System.out.println("Welcome to the Game of Life.");
        System.out.println("Your choices for building the initial grid is as follows:");
        System.out.println("\t(R)andom Grid\n\t(F)ile Input\n\t(P)rebuilt Grid");
        System.out.println("\nPlease input your choice:");

        Scanner in = new Scanner(System.in);
        String choice = in.next();
        System.out.println("How many generations would you like to run:");
        int totalGenerations = in.nextInt();
        // gather input and assign to variables

        GameOfLife aGame;

        if (choice.equalsIgnoreCase("r")) {
            System.out.print("Number of rows and Columns (it's a square): ");
            int rows = in.nextInt();
            int cols = rows;
            aGame = new GameOfLife(rows, cols);
            aGame.randomBuild();
        }
        else if (choice.equalsIgnoreCase("f")){
            aGame = new GameOfLife(30,30);
            System.out.println("Choose File (1, 2, or 3)");
            int file = in.nextInt();

            aGame.fileInput(file);
        }
        else {
            aGame = new GameOfLife();
            aGame.initialGrid();
        }

        for (int gen = 0; gen <= totalGenerations; gen++)
        {
            // print generation # and grid
            System.out.println("Generation: " + gen);
            System.out.println(aGame.toString());
            aGame.generation();
        }
    }
}

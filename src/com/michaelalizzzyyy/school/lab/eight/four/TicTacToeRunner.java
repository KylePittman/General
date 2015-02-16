package com.michaelalizzzyyy.school.lab.eight.four;

import java.util.Scanner;

public class TicTacToeRunner
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String player = "x";
        TicTacToe game = new TicTacToe();
        boolean done = false;

        game.set(0, 0, "x");
        game.set(0, 1, "x");
        game.set(0, 2, "o");
        game.set(1, 1, "o");
        game.set(2, 2, "x");
        System.out.println("Original Board: ");
        System.out.println(game.toString());

        game.flipHorizontal();
        System.out.println(game.toString());

        game.flipHorizontal();

        game.flipVertical();
        System.out.println(game.toString());
    }
}
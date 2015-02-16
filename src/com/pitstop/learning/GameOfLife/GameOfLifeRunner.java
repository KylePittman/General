//Kyle Pittman 12/19/2014.
package com.pitstop.learning.GameOfLife;

import com.pitstop.learning.GameOfLife.GameOfLife;

public class GameOfLifeRunner {
    public static void main(String[] args) {
        GameOfLife grassLands = new GameOfLife(30);

        //grassLands.setBiome();
        grassLands.initialGrid();
        System.out.println(grassLands.toString());

        for (int i = 0; i < 15; i++) {
            grassLands.generation();
            System.out.println(grassLands.toString());
        }
    }
}

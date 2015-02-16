//Kyle Pittman 1/6/2015.
package com.pitstop.school.programming.assignment.six;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GameOfLife {

        private boolean biome[][];
        public GameOfLife(int size){
            biome = new boolean[size][size];
            for (int i = 0; i < biome.length; i++) {
                for (int j = 0; j < biome.length; j++) {
                    biome[i][j] = false;
                }
            }
        }
        public GameOfLife(){
            biome = new boolean[30][30];
            for (int i = 0; i < biome.length; i++) {
                for (int j = 0; j < biome.length; j++) {
                    biome[i][j] = false;
                }
            }
        }

        public GameOfLife(int rows, int cols){
            biome = new boolean[rows][cols];
            for (int i = 0; i < biome.length; i++) {
                for (int j = 0; j < biome.length; j++) {
                    biome[i][j] = false;
                }
            }
        }
        public int getLength(){
            return biome.length;
        }
        public int getSize(){
            return (int) Math.pow(biome.length,2);
        }

        public void setState(int x, int y, boolean state){
            biome[y][x] = state;
        }

        public void setBiome(int[][] newBiome) {
            if (newBiome.length == biome.length) {
                for (int i = 0; i < newBiome.length; i++) {
                    for (int j = 0; j < newBiome.length; j++) {
                        if (newBiome[i][j] == 1) biome[j][i] = true;
                        else biome[j][i] = false;
                    }
                }
            }
        }

        public void initialGrid(){
            {
                int r = (biome.length)/3;					// Set up a third of the way down
                int c = (biome.length)/3;					// Set up a third of the way over
                for (int a = 0; a < (biome.length); a++)
                    for (int b = 0; b < (biome.length); b++)
                        biome[a][b] = false;		// initialize the array to false

                biome[r][c + 3] = biome[r][c + 8] = true;		//top row
                biome[r + 1][c + 1] = biome[r + 1][c + 2] = true;	//middle 2 le.t
                biome[r + 1][c + 9] = biome[r + 1][c + 10] = true;	//middle 4
                biome[r + 1][c + 4] = biome[r + 1][c + 5] = true;	//middle 4
                biome[r + 1][c + 6] = biome[r + 1][c + 7] = true;	//middle 2 right
                biome[r + 2][c + 3] = biome[r + 2][c + 8] = true;	//bottom row
            }
        }

        public void fileInput(int file) throws IOException {
            String fileToString;
            String input;
            if(file == 1){
                fileToString = "FileOne.txt";
            }
            else if(file == 2){
                fileToString = "FileTwo.txt";
            }
            else if(file == 3){
                fileToString = "FileThree.txt";
            }
            else{
                fileToString = "FileOne.txt";       //Just in case 1, 2, or 3 isn't entered
            }
            String pathToFile = "C:\\Users\\Kyle\\IdeaProjects\\General\\src\\com\\pitstop\\school\\programming\\assignment\\six";
            File inFile = new File(pathToFile, fileToString);
            Scanner inData = new Scanner(inFile);

            for (int i = 0; i < 13; i++) {
                input = inData.nextLine();
                for (int j = 0; j < input.length(); j++) {
                    if(input.charAt(j) == '.') biome[i][j] = false;
                    else biome[i][j] = true;
                }
            }


        }

        public int checkCells(int y, int x){
            int neighbors = 0;
            if (y > 0 && biome[x][y-1]){
                neighbors++;
            }
            if (y < biome.length-1 && biome[x][y+1]){
                neighbors++;
            }
            if (x > 0 && biome[x-1][y]){
                neighbors++;
            }
            if (x < biome.length-1 && biome[x+1][y]){
                neighbors++;
            }
            if (y > 0 && x > 0 && biome[x-1][y-1]){
                neighbors++;
            }
            if (y > 0 && x < biome.length-1 && biome[x+1][y-1]){
                neighbors++;
            }
            if (y < biome.length-1 && x < biome.length-1 && biome[x+1][y+1]){
                neighbors++;
            }
            if (y < biome.length-1 && x > 0 && biome[x-1][y+1]){
                neighbors++;
            }
            return neighbors;
        }

        public void generation(){
            boolean[][] newGen = new boolean[biome.length][biome.length];
            int neighbors = 0;
            for (int i = 0; i < biome.length; i++) {
                for (int j = 0; j < biome.length; j++) {
                    neighbors = this.checkCells(i, j);
                    if ((!biome[j][i] && neighbors == 3) || (biome[j][i] && (neighbors == 2 || neighbors == 3))) newGen[j][i] = true;
                    else newGen[j][i] = false;
                }
            }
            biome = newGen;
        }

        public String toString() {
            String board = "";
            for (int i = 0; i < biome.length; i++) {
                for (int j = 0; j < biome.length; j++) {
                    if (biome[i][j]) board = board + "*";
                    else board = board + ".";
                }
                board = board + "\n";
            }
            return board;
        }

    public void randomBuild() {
        Random generator = new Random();
        int temp;
        for (int i = 0; i < biome.length; i++) {
            for (int j = 0; j < biome.length; j++) {
                temp = generator.nextInt(10)+1;
                if (temp%4 == 0) biome[i][j] = true;
                else biome[i][j] = false;
            }
        }

    }
}


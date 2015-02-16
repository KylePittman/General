package com.michaelalizzzyyy.school.programming.assignment.six;//Michaela Dinman
import java.util.Scanner;
public class GameOfLifeRunner 
{
	public static void main(String[] args) 
	{		
		int totalRows = 16;
		int totalCols = 16;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Would you like to play a game?");
		System.out.println("Welcome to the Game of Life.");
		System.out.println("Your choices for building the initial grid is as follows:");
		System.out.println("\t(R)andom Grid\n\t(F)ile Input\n\t(P)rebuilt Grid");
		System.out.println("\nPlease input your choice:");
		String choice = scan.next();
		System.out.println("How many generations would you like?");
		int requestgens = scan.nextInt();
		
		GameOfLife2 aGame = new GameOfLife2(totalRows,totalCols);
		
		if (choice.equalsIgnoreCase("r"))				
		{
			aGame.randomBuild();
		}
		else if (choice.equalsIgnoreCase("f"))	
		{
			aGame.fileInput();
		}
		else
		{
			aGame.initialGrid();
		}
		
		for (int gen = 0; gen <= requestgens; gen++)
		{
			System.out.println("Generation " + gen);
			System.out.println(aGame.toString());
			aGame.NextGen();
		}
	}
}
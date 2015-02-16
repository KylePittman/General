package com.michaelalizzzyyy.school.programming.assignment.five;//Michaela Dinman
import java.util.Random;
import java.util.Scanner;
public class Elimination
{
	private static Scanner scan = new Scanner(System.in);
	private static int[] twelve;
	private static boolean[] twelvebool; //true is flipped up, false is down
	private static int rollone;
	private static int rolltwo;
	private static boolean done = false;
	private static boolean other = false; //to make it run the turn again
	
	public Elimination()
	{
		twelve = new int[13];
		twelvebool = new boolean[13];
	}
	
	public String twelveToString()
	{
		String stuff = "";
		
		stuff = stuff + twelve[1];
		for (int i = 2; i < twelve.length; i++)
		{
			stuff = stuff + " " + twelve[i];
		}
		return stuff;
	}
	
	public void PlayIt()
	{
		System.out.println("Roll a pair of dice and the tiles based on the numbers shown on the dice will be removed.\n"
				+ "For each roll, the player can remove either the two tiles corresponding to the numbers\n"
				+ "shown on the dice or a single tile corresponding to the sum of the numbers on the dice."
				+ " \nIf the player rolls doubles (the same number on both dice). The player can remove only\n"
				+ "the tile corresponding to the sum of the dice. Play continues until the player cannot\nmake "
				+ "a legal move or all the tiles have been removed. The sum of the remaining tiles\nis the "
				+ "player’s score. The goal is to have a low score.\n");
		System.out.println("The player will be asked if they would like to choose (D)ice, (S)um or (Q)uit,\n"
				+ "(D)ice will remove the two tiles that correspond to the number on each die.\n(Sum) will "
				+ "remove the sum of the two numbers. (Q)uit should be chosen when no\nmoves are valid, and your "
				+ "final score will be shown. Good Luck!\n");
		
		Random die = new Random();
		
		for (int k = 0; k <= 12; k++)
		{
			twelve[k] = k;
			twelvebool[k] = false;
		}
		
		rollone = die.nextInt(6) + 1;
		rolltwo = die.nextInt(6) + 1;
		while (!done)
		{
			System.out.println(this.twelveToString());
			for (int h = 1; h <= 12; h++)
			{
				if (twelvebool[h] == false && h <= 9) System.out.print(". ");
				else if (twelvebool[h] == false && h >= 9) System.out.print(" . ");
				if (twelvebool[h] == true && h <= 9) System.out.print("X ");
				else if (twelvebool[h] == true && h >= 9) System.out.print(" X ");
			}
			System.out.println("\nDice Roll: " + rollone + " & " + rolltwo);
			System.out.println("(D)ice (S)um (Q)uit");
			String word = scan.next();
		
			if (word.equalsIgnoreCase("d") && twelvebool[rollone] == true)
				System.out.println("Illegal Move. Please Try Again.\n");
			
			else if (word.equalsIgnoreCase("d") && twelvebool[rolltwo] == true)
				System.out.println("Illegal Move. Please Try Again.\n");
			
			else if (word.equalsIgnoreCase("d") && rollone == rolltwo)
				System.out.println("Illegal Move. Please Try Again.\n");
			
			else if (word.equalsIgnoreCase("d"))
			{
				twelvebool[rollone] = true;
				twelvebool[rolltwo] = true;
				rollone = die.nextInt(6) + 1;
				rolltwo = die.nextInt(6) + 1;
			}
			
			if (word.equalsIgnoreCase("s") && twelvebool[rollone + rolltwo] == true)
				System.out.println("Illegal Move. Please Try Again.\n");
			
			else if (word.equalsIgnoreCase("s"))
			{
				int save = rollone + rolltwo;
				twelvebool[save] = true;
				rollone = die.nextInt(6) + 1;
				rolltwo = die.nextInt(6) + 1;
			}

			
			else if (word.equalsIgnoreCase("q"))
			{
				//gameover sequence
				int score = 0;
				System.out.println("Thank you for playing!");
				for (int q = 1; q <= 12; q++)
					if (twelvebool[q] == false) score = score + q;
				
				System.out.println("Final Score is: " + score);
				System.out.println("\nHigh Score: KPitt w/ 300 points");
				done = true;
			}
		}
	}
}
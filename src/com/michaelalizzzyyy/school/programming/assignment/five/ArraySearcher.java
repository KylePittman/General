package com.michaelalizzzyyy.school.programming.assignment.five;//Michaela Dinman
import java.util.Random;
import java.util.Scanner;
public class ArraySearcher 
{
	private int[] array;
	private int integer;
	private Random die = new Random();
	
	public ArraySearcher()
	{	
		array = new int[101];
	}
	
	public void HundredRandom()
	{
		for (int y = 1; y <= 100; y++)
		{
			integer = die.nextInt(1000) + 1;
			array[y] = integer;
		}
	}
	
	public void Format()
	{
		for (int j = 1; j <= 100; j++)
		{
			integer = array[j];
			if (integer >= 1 && integer <= 9) System.out.print(integer + "   |");
			else if (integer >= 10 && integer <= 99) System.out.print(integer + "  |");
			else if (integer >= 100 && integer <= 999) System.out.print(integer + " |");
			if (j % 5 == 0) System.out.println();
		}
	}
	
	public void Average()
	{
		int sum = 0;
		int average = 0;
		int possiblehigh = 0;
		int possiblelow = 0;
		
		for (int s = 1; s <= 100; s++)
		{
			sum = sum + array[s];
		}
		average = sum / array.length;
		System.out.println("Average: " + average);
		possiblehigh = average + 50;
		possiblelow = average - 50;
		int o = 1;
		int merp = o;
		
		while (o <= 100)
		{
			if (array[o] >= possiblelow && array[o] <= possiblehigh)
			{
				merp++;
				o++;
			}
			else o++;
		}
		System.out.println("This array has " + merp + " number(s) within 50 of the average.");
	}
	
	public void Search()
	{		
		System.out.println("What number would you like to look for?");
		Scanner scan = new Scanner(System.in);
		int word = scan.nextInt();
		
		for (int q = 1; q <= 100; q++)
		{
            //System.out.println(array[q]);
            if (array[q] == word) System.out.println("The array contains the number " + word + " at index " + q + ".");
		}
	}
}
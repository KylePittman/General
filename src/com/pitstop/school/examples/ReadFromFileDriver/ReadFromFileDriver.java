package com.pitstop.school.examples.ReadFromFileDriver;
/*
 * Mr. Kelley September 2010
 * 
 * An example of reading input from a file.  Data01 is a file of integers, Data02 is text.
 * 
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFileDriver 
{

	public static void main(String[] args) throws IOException	
	{
		// find the path to the file in Eclipse by "Project/Properties"
		String pathToFile = "C:\\Users\\Kyle\\IdeaProjects\\General\\src\\com\\pitstop\\school\\examples\\ReadFromFileDriver";
		
		
		// the data file should be located in your project
		File inFile = new File(pathToFile, "Data01.txt");
		Scanner inData= new Scanner(inFile);
		
		int someData;
		String aString;
		
		
		while (inData.hasNext())
		{
			// integer input from Data01
			
			 someData = inData.nextInt();
			 System.out.print(someData + " ,");

			// string input from Data02
			
			// aString = inData.nextLine();
			// System.out.println(aString);
		}
	}
}

				
			

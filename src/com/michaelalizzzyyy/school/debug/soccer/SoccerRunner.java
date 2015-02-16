package com.michaelalizzzyyy.school.debug.soccer;//Michaela Dinman
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SoccerRunner 
{

	public static void main(String[] args) throws IOException 
	{

        String pathToFile = "C:\\Users\\Kyle\\IdeaProjects\\General\\src\\com\\pitstop\\school\\programming\\assignment\\three";
        File inFile = new File(pathToFile, "SoccerData.txt");
        Scanner inData = new Scanner(inFile);

		
		/*
		 * while (inData.hasNext())
		{
			String = inData.nextInt();
			System.out.println(String);
		}
		*/
		
		SoccerStandings first = new SoccerStandings(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());
		SoccerStandings second = new SoccerStandings(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());
		SoccerStandings third = new SoccerStandings(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());
		SoccerStandings forth = new SoccerStandings(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());
		SoccerStandings fifth = new SoccerStandings(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());
		SoccerStandings sixth = new SoccerStandings(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());
		SoccerStandings seventh = new SoccerStandings(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());
		SoccerStandings eighth = new SoccerStandings(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());
		SoccerStandings ninth = new SoccerStandings(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());
		SoccerStandings tenth = new SoccerStandings(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());
		
		System.out.println("Team Number  Wins Losses Ties Scored Allowed Rank");
		System.out.println("First Team:   " + first.getWins() + "    " + first.getLosses() + "     " + first.getTies() + "     " + first.getGoalsScored() + "       " + first.getGoalsAllowed() + "    " +  first.getRank());
		System.out.println("Second Team:  " + second.getWins() + "    " +  second.getLosses() + "     " +  second.getTies() + "     " +  second.getGoalsScored() + "       " +  second.getGoalsAllowed() + "    " +  second.getRank());
		System.out.println("Third Team:   " + third.getWins() + "    " +  third.getLosses() + "     " +  third.getTies() + "     " +  third.getGoalsScored() + "      " +  third.getGoalsAllowed() + "   " +  third.getRank());
		System.out.println("Forth Team:   " + forth.getWins() + "     " +  forth.getLosses() + "    " +  forth.getTies() + "     " +  forth.getGoalsScored() + "      " +  forth.getGoalsAllowed() + "   " +  forth.getRank());
		System.out.println("Fifth Team:   " + fifth.getWins() + "     " +  fifth.getLosses() + "     " +  fifth.getTies() + "     " +  fifth.getGoalsScored() + "      " +  fifth.getGoalsAllowed() + "   " +  fifth.getRank());
		System.out.println("Sixth Team:   " + sixth.getWins() + "     " +  sixth.getLosses() + "     " +  sixth.getTies() + "     " +  sixth.getGoalsScored() + "      " +  sixth.getGoalsAllowed() + "   " +  sixth.getRank());
		System.out.println("Seventh Team: " + seventh.getWins() + "     " +  seventh.getLosses() + "     " +  seventh.getTies() + "     " +  seventh.getGoalsScored() + "      " +  seventh.getGoalsAllowed() + "   " +  seventh.getRank());
		System.out.println("Eighth Team:  " + eighth.getWins() + "     " +  eighth.getLosses() + "     " +  eighth.getTies() + "     " +  eighth.getGoalsScored() + "      " +  eighth.getGoalsAllowed() + "   " +  eighth.getRank());
		System.out.println("Ninth Team:   " + ninth.getWins() + "     " +  ninth.getLosses() + "     " +  ninth.getTies() + "     " +  ninth.getGoalsScored() + "      " +  ninth.getGoalsAllowed() + "   " +  ninth.getRank());
		System.out.println("Tenth Team:   " + tenth.getWins() + "     " +  tenth.getLosses() + "     " +  tenth.getTies() + "     " +  tenth.getGoalsScored() + "      " +  tenth.getGoalsAllowed() + "   " +  tenth.getRank());
	}
}
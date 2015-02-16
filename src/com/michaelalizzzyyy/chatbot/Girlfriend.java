package com.michaelalizzzyyy.chatbot;

import java.util.Scanner;

public class Girlfriend 
{
	public static void main(String[] args)
	{
		ForMyLove Michaela = new ForMyLove();
		
		System.out.println (Michaela.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Night"))
		{
			System.out.println (Michaela.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
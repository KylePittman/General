package com.michaelalizzzyyy.chatbot;

public class ForMyLove 
{
	public String getGreeting()
	{
		return "*smiles* Hello, my puppy.";
	}
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("hey") >= 0)
		{
			response = "So what's up?";
		}
		else if (statement.indexOf("homework") >= 0
				|| statement.indexOf("nothing") >= 0)
		{
			response = "Sounds boring. So what do you want to do?";
		}
		else if (statement.indexOf("kitten") >= 0
				|| statement.indexOf("Kitten") >= 0)
		{
			response = "Meow~";
		}
		else if (statement.indexOf("mine") >= 0
				|| statement.indexOf("always") >= 0
				|| statement.indexOf("forever") >= 0)
		{
			response = "You're a dork.";
			response = "You're stupid.";
		}
		else if (statement.indexOf("kiss") >= 0)
		{
			response = "You gonna kiss me, or not so much?";
		}
		else if (statement.indexOf("I love you") >= 0
				|| statement.indexOf("i love you") >= 0)
		{
			response = "I love you too, puppy.";
		}
		else if (statement.indexOf("busy") >= 0
				|| statement.indexOf("work") >= 0
				|| statement.indexOf("soccer") >= 0)
		{
			response = "Ugh but I'll be lonelyyyyyyyy";
		}
		else if (statement.indexOf("...") >= 0)
		{
			response = "Fine, ignore me, whatever.";
		}
		else if(statement.trim().length()==0)
		{
			response = "Just not going to talk now?";
		}
		else if (statement.indexOf("hot") >= 0
				|| statement.indexOf("sexy") >= 0
				|| statement.indexOf("beautiful") >= 0
				|| statement.indexOf("pretty") >= 0)
		{
			response = "Fabulous, actually.";
		}
		else if (statement.indexOf("goodnight") >= 0
				|| statement.indexOf("night") >= 0
				|| statement.indexOf("good-night") >= 0)
		{
			response = "Good-night, my puppy~";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "I'm confuzzled.";
		}
		else if (whichResponse == 1)
		{
			response = "Psh, idk.";
		}
		else if (whichResponse == 2)
		{
			response = "Whatever.";
		}
		else if (whichResponse == 3)
		{
			response = "Don't even start with me.";
		}
		else if (whichResponse == 4)
		{
			response = "Not my fault.";
		}
		else if (whichResponse == 5)
		{
			response = "Don't blame me for this.";
		}

		return response;
	}

}
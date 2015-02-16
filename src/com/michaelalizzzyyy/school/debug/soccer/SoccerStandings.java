package com.michaelalizzzyyy.school.debug.soccer;

//Michaela Dinman
public class SoccerStandings
{
	private int wins;
	private int losses;
	private int ties;
	private int GoalsScored;
	private int GoalsAgainst;
	private double points;
	
	public SoccerStandings()
	{
		wins = 0;
		losses = 0;
		ties = 0;
		GoalsScored = 0;
		GoalsAgainst = 0;
	}
	
	public SoccerStandings(int win, int loss, int tie, int goals, int against)
	{
		wins = win;
		losses = loss;
		ties = tie;
		GoalsScored = goals;
		GoalsAgainst = against;
		points = (wins * 30) + (ties * 8) - (losses * 15);
		if (goals > against)
		{
			points = points + (0.15 * (goals - against));
		}
		else
		{
			points = points - (0.30 * (against - goals));
		}
		if (loss == 0)
		{
			points = points + 10;
		}
		if (tie == 0)
		{
			points = points + 5;
		}
	}
	
	public int getWins()
	{
		return wins;
	}
	
	public int getLosses()
	{
		return losses;
	}
	
	public int getTies()
	{
		return ties;
	}
	
	public int getGoalsScored()
	{
		return GoalsScored;
	}
	
	public int getGoalsAllowed()
	{
		return GoalsAgainst;
	}
	
	public double getRank()
	{
		return points;
	}
}






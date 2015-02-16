//Kyle Pittman 10/25/2014.
package com.pitstop.school.programming.assignment.three;

public class SoccerFinal {
    private static final int WIN_POINTS = 30;
    private static final int TIE_POINTS = 8;
    private static final int LOSS_POINTS = -15;
    private static final double GOAL_BONUS = .15;
    private static final double GOAL_DEFICIT = .30;
    private static final int NO_LOSS_BONUS = 10;
    private static final int NO_TIE_BONUS = 5;
    private int wins;
    private int losses;
    private int ties;
    private int goalsScored;
    private int goalsAllowed;
    private double score;
    SoccerFinal(int setWins, int setLosses, int setTies, int setGoalsScored, int setGoalsAllowed){
        wins = setWins;
        losses = setLosses;
        ties = setTies;
        goalsScored = setGoalsScored;
        goalsAllowed = setGoalsAllowed;
        score = wins * WIN_POINTS + TIE_POINTS * ties + LOSS_POINTS *losses;           //30 points per win, 8 per tie, -15 per loss
        if(goalsScored > goalsAllowed) score += GOAL_BONUS*(goalsScored-goalsAllowed); //adds 15% of goal difference if more goals scored than allowed
        else score -= GOAL_DEFICIT * (goalsAllowed-goalsScored);                       //subtracts 30% of goal difference otherwise
        if(losses == 0) score += NO_LOSS_BONUS;                                        //adds 10 if no losses
        if(ties == 0) score += NO_TIE_BONUS;                                           //adds 5 if no ties
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getTies() {
        return ties;
    }

    public int getLosses() {
        return losses;
    }
    public int getWins(){
        return wins;
    }

    public double getScore() {
        return score;
    }
}

//Kyle Pittman 10/21/2014.
package com.pitstop.school.programming.assignment.three;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SoccerStandings {
    public String pathToFile = "C:\\Users\\Kyle\\IdeaProjects\\General\\src\\com\\pitstop\\school\\programming\\assignment\\three";
    public int wins;
    public int losses;
    public int ties;
    public int goalsScored;
    public int goalsAllowed;
    public double score;
    SoccerStandings(int team) throws IOException{
        File inFile = new File(pathToFile, "SoccerData.txt");
        Scanner inData= new Scanner(inFile);
        for (int i = 0; i < 5*team; i++) {  //This loop skips through each teams data until the specified team
            inData.nextInt();               //This passes by a data point each iteration of the loop
        }
        wins = inData.nextInt();            //For loop ends and leaves the nextInt at teams win value
        losses = inData.nextInt();
        ties = inData.nextInt();
        goalsScored = inData.nextInt();
        goalsAllowed = inData.nextInt();
        //Finds the scored based on record
        score = wins*30 + 8*ties - 15*losses; //30 points per win, 8 per tie, -15 per loss
        if(goalsScored > goalsAllowed) score += .15*(goalsScored-goalsAllowed); //adds 15% of goal difference if more goals scored than allowed
        else score -= .30*(goalsAllowed-goalsScored);   //subtracts 30% of goal difference otherwise
        if(losses == 0) score += 10; //adds 10 if no losses
        if(ties == 0) score += 5;    //adds 5 if no ties
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getTies() {
        return ties;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public double getScore() {
        return score;
    }
    public void getStats(){

        String spaces = "               ";  //This String is used for spacing between data to format the table
        int numLength;                      //This is used for to find how many digits an int is
        System.out.print(wins);
        if (wins == 0) numLength = 1; else numLength = wins;    //log of 0 is undefined, but log 1 is the same number of digits as 0 takes up
        System.out.print(spaces.substring(0, 5 - (int) (Math.log10(numLength)))+ losses);   //Wins with two spaces following is 6 characters, this fills in spaces to align the table
        if (losses == 0) numLength = 1; else numLength = losses; //log 0 is undefined ^^
        System.out.print(spaces.substring(0, 7 - (int) (Math.log10(numLength))) + ties);    //losses with two spaces following is 8 characters, this fills in spaces to align the table
        if (ties == 0) numLength = 1; else numLength = ties;    //log 0 is undefined ^^
        System.out.print(spaces.substring(0, 5 - (int) (Math.log10(numLength))) + goalsScored); //ties with two spaces following is 6 characters, this fills in spaces to align the table
        if (goalsScored == 0) numLength = 1; else numLength = goalsScored;  //log 0 is undefined ^^
        System.out.print(spaces.substring(0, 13 - (int) (Math.log10(numLength))) + goalsAllowed); //Goals Scored with two spaces following is 14 characters, this fills in spaces to align the table
        if (goalsAllowed == 0) numLength = 1; else numLength = goalsAllowed;  //log 0 is undefined ^^
        System.out.println(spaces.substring(0, 14 - (int) (Math.log10(numLength))) + score);    //Goals Allowed with two spaces following is 15 characters, this fills in spaces to align the table
    }
}

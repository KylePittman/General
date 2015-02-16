//Kyle Pittman 10/25/2014.
package com.pitstop.school.programming.assignment.three;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SoccerFinalRunner {
    public static void main(String[] args) throws IOException{
        String pathToFile = "C:\\Users\\Kyle\\IdeaProjects\\General\\src\\com\\pitstop\\school\\programming\\assignment\\three";
        File inFile = new File(pathToFile, "SoccerData.txt");
        Scanner inData = new Scanner(inFile);
        SoccerFinal one = new SoccerFinal(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());
        SoccerFinal two = new SoccerFinal(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());
        SoccerFinal three = new SoccerFinal(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());
        SoccerFinal four = new SoccerFinal(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());
        SoccerFinal five = new SoccerFinal(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());
        SoccerFinal six = new SoccerFinal(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());
        SoccerFinal seven = new SoccerFinal(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());
        SoccerFinal eight = new SoccerFinal(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());
        SoccerFinal nine = new SoccerFinal(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());
        SoccerFinal ten = new SoccerFinal(inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt(),inData.nextInt());

        System.out.println(one.getWins() + "  " + one.getLosses() + "   " + one.getTies() + "   " + one.getGoalsScored() + "    " + one.getGoalsAllowed() + "    " + one.getScore());
        System.out.println(two.getWins() + "  " + two.getLosses() + "   " + two.getTies() + "   " + two.getGoalsScored() + "    " + two.getGoalsAllowed() + "    " + two.getScore());
        System.out.println(three.getWins() + "  " + three.getLosses() + "   " + three.getTies() + "   " + three.getGoalsScored() + "   " + three.getGoalsAllowed() + "   " + three.getScore());
        System.out.println(four.getWins() + "   " + four.getLosses() + "  " + four.getTies() + "   " + four.getGoalsScored() + "   " + four.getGoalsAllowed() + "   " + four.getScore());
        System.out.println(five.getWins() + "   " + five.getLosses() + "   " + five.getTies() + "   " + five.getGoalsScored() + "   " + five.getGoalsAllowed() + "   " + five.getScore());
        System.out.println(six.getWins() + "   " + six.getLosses() + "   " + six.getTies() + "   " + six.getGoalsScored() + "   " + six.getGoalsAllowed() + "   " + six.getScore());
        System.out.println(seven.getWins() + "   " + seven.getLosses() + "   " + seven.getTies() + "   " + seven.getGoalsScored() + "   " + seven.getGoalsAllowed() + "   " + seven.getScore());
        System.out.println(eight.getWins() + "   " + eight.getLosses() + "   " + eight.getTies() + "   " + eight.getGoalsScored() + "   " + eight.getGoalsAllowed() + "   " + eight.getScore());
        System.out.println(nine.getWins() + "   " + nine.getLosses() + "   " + nine.getTies() + "   " + nine.getGoalsScored() + "   " + nine.getGoalsAllowed() + "   " + nine.getScore());
        System.out.println(ten.getWins() + "   " + ten.getLosses() + "   " + ten.getTies() + "   " + ten.getGoalsScored() + "   " + ten.getGoalsAllowed() + "   " + ten.getScore());
    }
}

//Kyle Pittman 12/3/2014.
package com.pitstop.school.lab.eight.three;

import java.util.Scanner;

public class StudentAnalyzer {
    public static void main(String[] args)
    {
        StudentScores apcs = new StudentScores();   //Initiates a class (like class with a teacher not a java class)
        Scanner in = new Scanner(System.in);
        boolean done = false;   //used for the do loop
        do
        {
            System.out.println("Enter a student name or -1 to end: ");
            String name = in.nextLine();
            if (name.equals("-1")) //-1 is Sentinel Value
                done = true;
            else
            {
                System.out.println("Enter the student's score: ");
                int score = in.nextInt();
                in.nextLine(); // skip the end-of-line character
                apcs.add(name,score);   //Add student to class
            }
        }
        while (!done);

        //gets the place in the ArrayList of the highest and lowest students
        int highest = apcs.getHighest();

        int lowest = apcs.getLowest();

        //Outputs the Name and Score of the highest and lowest students
        System.out.println("Highest: " + apcs.getName(highest) + ", " + apcs.getScore(highest));
        System.out.println("Lowest: " + apcs.getName(lowest) + ", " + apcs.getScore(lowest));
    }
}

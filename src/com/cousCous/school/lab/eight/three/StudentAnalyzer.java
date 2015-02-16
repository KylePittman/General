//Marcus Silcox
package com.cousCous.school.lab.eight.three;

import java.util.Scanner;

public class StudentAnalyzer {
    public static void main(String[] args)
    {
        StudentScores studSc = new StudentScores();
        Scanner in = new Scanner(System.in);
        boolean done = false;
        do
        {
            System.out.println("Enter a student name or -1 to end: ");
            String name = in.nextLine();
            if (name.equals("-1"))
                done = true;
            else
            {
                System.out.println("Enter the student's score: ");
                int score = in.nextInt();
                in.nextLine();
                studSc.add(name,score);
            }
        }
        while (!done);

        int highest = studSc.getHighest();

        int lowest = studSc.getLowest();

        System.out.println("Highest: " + studSc.getName(highest) + ", " + studSc.getScore(highest));
        System.out.println("Lowest: " + studSc.getName(lowest) + ", " + studSc.getScore(lowest));
    }
}

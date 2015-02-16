//Kyle Pittman 12/3/2014.
package com.pitstop.school.lab.eight.three;

import java.util.ArrayList;

public class StudentScores

{

    private int numStudents;                                //tracks how many students are in the class
    ArrayList<Student> students = new ArrayList<Student>(); //ArrayList of students. Uses Student class

    //Constructor
    public StudentScores()
    {
        numStudents = 0;
    }

    //Add method to add student to students ArrayList
    public void add(String name, int score)
    {
        students.add(new Student(score,name));
        numStudents++;  //Adds a student to the class count
    }

    //gets

    public int getHighest() //Returns the place in the ArrayList of the student with the highest score.
    {
        if (numStudents == 0)   //ensures the ArrayList has at least one value
            return Integer.parseInt(null);
        int highest = 0;
        for (int i = 1; i < numStudents; i++)
            if (students.get(i).getScore() > students.get(highest).getScore())
                highest = i;
        return highest;
    }

    public int getLowest() //Returns the place in the ArrayList of the student with the lowest score.
    {
        if (numStudents == 0)   //ensures the ArrayList has at least one value
            return Integer.parseInt(null);
        int lowest = 0;
        for (int i = 1; i < numStudents; i++)
            if (students.get(i).getScore() < students.get(lowest).getScore())
                lowest = i;
        return lowest;
    }

    public int getScore(int place) //Gets the score of a student at 'place' in ArrayList
    {
        return students.get(place).getScore();
    }

    public String getName(int place) //Gets the name of student at 'place' in ArrayList
    {
        return students.get(place).getName();
    }
}
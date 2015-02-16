//Marcus Silcox
package com.cousCous.school.lab.eight.three;

import java.util.ArrayList;

public class StudentScores

{

    private int totalStudents;
    ArrayList<Student> students = new ArrayList<Student>();

    public StudentScores()
    {
        totalStudents = 0;
    }

    public void add(String name, int score)
    {
        students.add(new Student(score,name));
        totalStudents++;
    }

    public int getHighest()
    {
        if (totalStudents == 0)
            return Integer.parseInt(null);
        int highest = 0;
        for (int i = 1; i < totalStudents; i++)
            if (students.get(i).getScore() > students.get(highest).getScore())
                highest = i;
        return highest;
    }

    public int getLowest()
    {
        if (totalStudents == 0)
            return Integer.parseInt(null);
        int lowest = 0;
        for (int i = 1; i < totalStudents; i++)
            if (students.get(i).getScore() < students.get(lowest).getScore())
                lowest = i;
        return lowest;
    }

    public int getScore(int place)
    {
        return students.get(place).getScore();
    }

    public String getName(int place)
    {
        return students.get(place).getName();
    }
}
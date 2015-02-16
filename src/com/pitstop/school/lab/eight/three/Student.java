//Kyle Pittman 12/3/2014.
package com.pitstop.school.lab.eight.three;

public class Student {
    //Class to prevent parallel arrays by holding name and score together

    int score;
    String name;

    //Construct a student
    public Student(int setScore, String setName){
        score = setScore;
        name = setName;
    }

    //gets

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

}

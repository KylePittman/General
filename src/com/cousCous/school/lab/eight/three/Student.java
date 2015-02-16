//Marcus Silcox
package com.cousCous.school.lab.eight.three;

public class Student {
    int score;
    String name;

    //Construct a student
    public Student(int scoreIn, String nameIn){
        score = scoreIn;
        name = nameIn;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

}

//Kyle Pittman 11/21/2014.
package com.pitstop.school.lab.eight.two;

import java.util.ArrayList;

public class ScoreSet
{

    private ArrayList<Integer> scores;

    public ScoreSet()

    {
        scores = new ArrayList<Integer>();
    }

    public int bottomTwoSum(){
        int lowestValues;
        int minPlace = 0;
        for(int i = 0; i < scores.size(); i++){
            if(scores.get(i) <= scores.get(minPlace)) minPlace = i;
        }
        lowestValues = scores.get(minPlace);
        scores.remove(minPlace);
        int secondLowest = scores.get(0);
        for(int i = 0; i < scores.size(); i++){
            if(scores.get(i) <= secondLowest) secondLowest = scores.get(i);
        }
        scores.add(minPlace, lowestValues);
        lowestValues += secondLowest;

        return lowestValues;
    }



    public void add(int score)
    {

        scores.add(score);

    }

    public double averageWithoutLowest2() {
        double average = 0;
        for (int i = 0; i < scores.size(); i++) {
            average += scores.get(i);
        }
        average -= this.bottomTwoSum();
        average /= (scores.size()-2);
        return average;
    }


    public String toString(){
        String array = "";
        for(int i : scores){
            array = array + i + " ";
        }
        return array;
    }
}
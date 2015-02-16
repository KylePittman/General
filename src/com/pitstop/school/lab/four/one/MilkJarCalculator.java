package com.pitstop.school.lab.four.one;//General Created by Kyle on 10/13/2014.

public class MilkJarCalculator {
    public static void main(String[] args) {
        double milk = 5.5; //gallons
        double jarCapacity = .75; //gallons
        int completelyFilledJars = (int) (milk/jarCapacity); //needs to be casted as an int
        System.out.println(completelyFilledJars);
    }
}

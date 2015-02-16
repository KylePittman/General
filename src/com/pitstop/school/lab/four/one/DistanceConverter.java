package com.pitstop.school.lab.four.one;//General Created by Kyle on 10/13/2014.

public class DistanceConverter {
    public static final double FEET_IN_A_YARD = 3;
    public static final double INCHES_IN_A_FOOT = 12;
    public static void main(String[] args) {
        double yards = 3.5;
        double feet = yards * FEET_IN_A_YARD;
        double inches = feet * INCHES_IN_A_FOOT;
        System.out.println(yards + " yards is equal to " + feet + " feet.");
        System.out.println(yards + " yards is equal to " + inches + " inches.");
        // I edited the grammar and spacing
    }
}

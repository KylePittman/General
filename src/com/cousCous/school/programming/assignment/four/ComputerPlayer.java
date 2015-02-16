//Kyle Pittman 11/19/2014.
package com.cousCous.school.programming.assignment.four;

public class ComputerPlayer
{
    private int max;
    private int min;
    private int guess;
    private int attempts;

    public ComputerPlayer (int maximum, int minimum)
    {
        max = maximum;
        min = minimum;
        guess = (max + min)/2;
    }

    public static void toHigh()
    {

    }
}

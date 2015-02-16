package com.pitstop.school.lab.four.two;//General Created by Kyle on 10/16/2014.

public class IncrementDemo {
    public static void main(String[] args)
    {
        int x = 10;
        int y = -3;
        int z = Integer.MAX_VALUE;
        x = x+1;
        y++;
        //the z goes from the highest number to the lowest because the value rolls over
        z++;
        System.out.println("x = "+x+" y = "+y+" z = "+z);

    }
}

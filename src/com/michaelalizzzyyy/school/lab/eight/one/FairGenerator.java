//Kyle Pittman 11/20/2014.
package com.michaelalizzzyyy.school.lab.eight.one;

import java.util.Random;
import java.util.Scanner;

public class FairGenerator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int range;
        int otherThing;
        Random generator;
        generator = new Random();
        System.out.println("What is the range of the generator? ");
        range = in.nextInt();
        System.out.println("How many trials would you like to perform? ");
        otherThing = in.nextInt();
        int[] array = new int[range];

        for (int i = 0; i < range; i++)
        {
            array[i] = 0;
        }
        for (int k = 0; k < otherThing; k++)
        {
            array[generator.nextInt(range)]++;
        }
        for (int h = 0; h < range; h++)
        {
            System.out.println(h + ": " + array[h]);

        }
    }
}

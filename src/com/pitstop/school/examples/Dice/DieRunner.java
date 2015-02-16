//This program simulates casting a die ten times.

package com.pitstop.school.examples.Dice;

public class DieRunner
{
    public static void main(String[] args)
    {
        Die d = new Die(6);
        final int TRIES = 12000;
        int c =0;
        for (int i = 1; i <= TRIES; i++)
        {
            int n = d.cast();
            //System.out.print(n + " ");
            //if (i % 20==0)      System.out.println();
            if (n == 4) c++;

        }
        System.out.println( "\n\ncount is " +c);
    }
}

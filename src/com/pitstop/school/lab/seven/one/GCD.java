//Kyle Pittman 11/5/2014.
package com.pitstop.school.lab.seven.one;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class GCD {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            boolean sentinelFound = false;
            final String SENTINEL = "A";
            while(!sentinelFound) {

                System.out.println("Enter the first integer: ");
                String first = in.next();
                if (first.equalsIgnoreCase(SENTINEL)) sentinelFound = true;
                else
                {
                    int x = parseInt(first);
                    System.out.println("x = " + x);
                    System.out.println("Enter the second integer: ");
                    int y = in.nextInt();
                    System.out.println("y = " + y);
                    while (x > 0 && y > 0)
                    {
                        if (x >= y) x = x - y;
                        else y = y - x;
                    }
                    System.out.print("GCD = ");
                    if (y == 0) System.out.println(x);
                    else System.out.println(y);
                }

            }
    }
}

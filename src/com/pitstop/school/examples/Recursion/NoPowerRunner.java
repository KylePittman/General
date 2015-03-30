//Kyle Pittman 3/25/2015.
package com.pitstop.school.examples.Recursion;

public class NoPowerRunner {
    public static void main(String[] args) {
        NoPower test = new NoPower();
        test.mystery(0,16);
        System.out.println("Fib num:");
        System.out.println(test.fib(20));
    }
}

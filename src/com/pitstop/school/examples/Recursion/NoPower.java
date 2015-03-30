//Kyle Pittman 3/25/2015.
package com.pitstop.school.examples.Recursion;

public class NoPower {
    private int count = 0;
    public NoPower(){

    }

    public void mystery(int a, int b) {
        count++;
        System.out.println(a + " ");
        if (a <= b) mystery(a + 5, b - 1);
        System.out.println(count);
        count = 0;
    }

    public int fib(int m){
        count++;
        System.out.println("Stacks: " + count);
        if(m == 0 || m == 1) return 1;
        else return fib(m-1) + fib(m-2);
    }
}

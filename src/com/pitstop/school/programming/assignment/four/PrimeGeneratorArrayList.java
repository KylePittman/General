//Kyle Pittman 11/20/2014.
package com.pitstop.school.programming.assignment.four;

import java.util.ArrayList;

public class PrimeGeneratorArrayList {
    public static int range;
    public static int sqroot;
    public static int primeCount;
    public static int numbersPerLine = 0;
    public static int iterations = 0;
    public static ArrayList<Integer> primes = new ArrayList<Integer>();

    public PrimeGeneratorArrayList (int rangeInput){
        range = rangeInput;
    }
    public int test(){
        primes.add(2);
        System.out.print(primes.get(0) + "  ");
        numbersPerLine++;
        for (int j = 3; j < range; j+=2) {
            primeCount = primes.size();
            sqroot = (int) Math.sqrt(j)+1;
            int factors = 0;
            for (int i = 0;(primes.get(i) < sqroot) && (factors == 0); i++) {
                if(j%primes.get(i) == 0) factors++;
                iterations++;
            }
            if (factors == 0){
                if (numbersPerLine == 4){
                    System.out.println();
                    numbersPerLine = 0;
                }
                primes.add(j);
                System.out.print(primes.get(primes.size()-1) + "  ");
                numbersPerLine++;
            }
        }
        System.out.println("\n Number of primes between 1 and " + range +" :" + primes.size());
        System.out.println("The number of divisions to find these primes was: "+iterations);
        return iterations;
    }
}

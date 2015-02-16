//Kyle Pittman 11/18/2014.
package com.pitstop.school.programming.assignment.four;

public class PrimeGenerator {
    public static int range;
    public static int sqroot;
    public static int primeCount;
    public static int numbersPerLine = 0;
    public static int iterations = 0;

    public PrimeGenerator (int rangeInput){
        range = rangeInput;
    }

    public int test(){
        System.out.print(2 + "  ");
        primeCount++;
        numbersPerLine++;
        for (int j = 1; j < range; j+=2) {
            sqroot = (int) Math.sqrt(j)+1;
            int factors = 0;
            for (int i = 1; i < sqroot && factors < 2; i++) {
                if(j%i == 0 && j!= 1) factors++;
                iterations++;
            }
            if (factors == 1){
                if (numbersPerLine == 4){
                    System.out.println();
                    numbersPerLine = 0;
                }
                System.out.print(j + "  ");
                primeCount++;
                numbersPerLine++;
            }
        }
        System.out.println("\n Number of primes between 1 and " + range +" :" + primeCount);
        System.out.println("The number of divisions to find these primes was: "+iterations);
        return iterations;
    }

}

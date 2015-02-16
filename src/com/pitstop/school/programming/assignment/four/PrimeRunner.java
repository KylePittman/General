//Kyle Pittman 11/19/2014.
package com.pitstop.school.programming.assignment.four;

public class PrimeRunner {
    public static void main(String[] args) {
        double efficiency;
        int iteration1;
        int iteration2;
        final int RANGE = 10000000;
        PrimeGenerator test = new PrimeGenerator(RANGE);
        iteration1 = test.test();

        PrimeGeneratorArrayList test2 = new PrimeGeneratorArrayList(RANGE);
        iteration2 = test2.test();
        efficiency = (iteration1/iteration2) * 100;
        System.out.println("Arraylist makes this "+ efficiency + "% more efficient than without.");
    }
}

package com.pitstop.school.lab.eighteen.one;

/**
 * Created by Kyle on 3/29/2015.
 */
public class PermutationCounter {
    private int n;

    public PermutationCounter(int numberOfItems){
        n = numberOfItems;
    }

    public long getCount(){
        long returnVal = 1;
        for (int i = 1; i <= n; i++) {
            returnVal*=i;
        }
        return returnVal;
        /*if(n == 1) return 1;
        return n * new PermutationCounter(n - 1).getCount();
        */
    }

}

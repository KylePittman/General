//Kyle Pittman 11/3/2014.
package com.pitstop.school.loops;

public class whileForDo {
    public static void main(String[] args) {
        final int START = 200;
        int i;
        int whileVal = 0;
        int forVal = 0;
        int doVal = 0;

        i = START;
        while(i <= 500){
            if (i % 2 == 0) whileVal += i;
            i++;
        }
        for(i = START; i <= 500 ; i++){
            if (i % 2 == 0) forVal += i;
        }
        i = START;
        do {
            if (i % 2 == 0) doVal += i;
            i++;
        }
        while(i <= 500);
        System.out.println("While Value: " + whileVal);
        System.out.println("For Value: " + forVal);
        System.out.println("Do Value: " + doVal);
    }
}

//Kyle Pittman 4/16/2015.
package com.pitstop.school.lab.nineteen.two;

import java.util.Comparator;

public class CityComparator implements Comparator<City>

{
    public int compare(City a, City b)
    {
        char thisChar;
        char thatChar;

        for (int i = 0; i < a.getName().length() && i < b.getName().length(); i++) {
            thisChar = a.getName().charAt(i);
            thatChar = b.getName().charAt(i);
            if(thisChar < thatChar) return -1;
            if (thatChar < thisChar) return 1;
        }

        for (int i = 0; i < a.getState().length() && i < b.getState().length(); i++) {
            thisChar = a.getState().charAt(i);
            thatChar = b.getState().charAt(i);
            if(thisChar < thatChar) return -1;
            if (thatChar < thisChar) return 1;
        }

        return 0;
    }
}

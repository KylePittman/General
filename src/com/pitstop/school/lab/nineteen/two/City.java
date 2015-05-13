//Kyle Pittman 4/16/2015.
package com.pitstop.school.lab.nineteen.two;

import java.util.Comparator;

public class City implements Comparable<City>{
    private String name;
    private String state;

    public City(String name, String state){
        this.name = name;
        this.state = state;
    }

    public String toString(){
        return name +", " + state;
    }

    public String getName(){
        return name;
    }

    public String getState() {
        return state;
    }

    @Override
    public int compareTo(City o) {
        char thisChar = name.charAt(0);
        char thatChar = o.getName().charAt(0);

        for (int i = 0; i < name.length() && i < o.getName().length(); i++) {
            thisChar = name.charAt(i);
            thatChar = o.getName().charAt(i);
            if(thisChar < thatChar) return -1;
            if (thatChar < thisChar) return 1;
        }
        return 0;
    }
}

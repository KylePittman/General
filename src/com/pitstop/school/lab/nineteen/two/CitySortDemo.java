//Kyle Pittman 4/16/2015.
package com.pitstop.school.lab.nineteen.two;

import java.util.Collections;
import java.util.ArrayList;

public class CitySortDemo
{
    public static void main(String[] args)
    {
        ArrayList<City> cities = new ArrayList<City>();

        cities.add(new City("Anchorage", "Alaska"));
        cities.add(new City("Little Rock", "Arkansas"));
        cities.add(new City("Fairbanks", "Alaska"));
        cities.add(new City("Bumblebee", "Arizona"));
        cities.add(new City("Springfield", "Oregon"));
        cities.add(new City("Kodiak", "Alaska"));
        cities.add(new City("Bloomington", "Illinois"));
        cities.add(new City("Pine Bluff", "Arkansas"));
        cities.add(new City("Flagstaff", "Arizona"));
        cities.add(new City("Phoenix", "Arizona"));
        cities.add(new City("Bloomington", "Indiana"));
        cities.add(new City("Tucson", "Arizona"));
        cities.add(new City("Springfield", "Illinois"));
        cities.add(new City("Juneau", "Alaska"));
        cities.add(new City("Arkadelphia", "Arkansas"));

        Collections.sort(cities);

        for (City c : cities)
            System.out.println(c);
    }
}


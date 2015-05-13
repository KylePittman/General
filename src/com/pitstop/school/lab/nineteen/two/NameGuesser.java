//Kyle Pittman 4/16/2015.
package com.pitstop.school.lab.nineteen.two;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameGuesser
{
    private ArrayList<String> lastNames = new ArrayList<String>();

    public void guess() throws IOException {


        URL url = new URL("http://www2.census.gov/topics/genealogy/1990surnames/dist.all.last");
        Scanner web = new Scanner(url.openStream());
        while (web.hasNext())
        {
// Read the last name
            String lastName = web.next();
            lastNames.add(lastName);
// Ignore the statistical information
            web.nextDouble();
            web.nextDouble();
            web.nextInt();
        }
        web.close();

        Collections.sort(lastNames);

        boolean found = false;
        int max = lastNames.size();
        int min = 0;
        int loc = lastNames.size()/2;
        String input;
        Scanner in = new Scanner(System.in);

        while(!found){
            System.out.println(min +", " + max + ", " + loc);
            System.out.println("Is your name before " + lastNames.get(loc) + "?");
            input = in.next();
            if(input.equalsIgnoreCase("y")){
                max = loc - 1;
                loc = max - (max-min)/2;
            }
            else{
                min = loc + 1;
                loc = min + (max - min)/2;
            }
            if(max - min == 1 || max - min == 0) found = true;
        }
        System.out.println("Is your name " + lastNames.get(min) + "?");
        input = in.next();
        if(input.equalsIgnoreCase("y")){
            loc = min;
        }
        else {
            loc = max;
        }
        System.out.println("Your name is " + lastNames.get(loc));
    }

    public void readNames() throws IOException, MalformedURLException
    {
// Read the last names
        URL url = new
                URL("http://www2.census.gov/topics/genealogy/1990surnames/dist.all.last");
        Scanner in = new Scanner(url.openStream());
        while (in.hasNext())
        {
// Read the last name
            String lastName = in.next();
            lastNames.add(lastName);
// Ignore the statistical information
            in.nextDouble();
            in.nextDouble();
            in.nextInt();
        }
        in.close();
// Print out the number of names in the file and
// Sort the names using Collections
        System.out.println(lastNames.size());
        Collections.sort(lastNames);

    }

    public static void main(String[] args) throws IOException {
        try {
            new NameGuesser().readNames();
        } catch (IOException e) {
            e.printStackTrace();
        }
        new NameGuesser().guess();
    }
}

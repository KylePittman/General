//Kyle Pittman 3/19/2015.
package com.pitstop.school.lab.thirteen.one;

public class Card {
    private String name;
    public Card()
    {
        name = "";
    }
    public Card(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
    public boolean isExpired()
    {
        return false;
    }
    public String format()
    {
        return "Card holder: " + name;
    }
}

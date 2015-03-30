//Kyle Pittman 3/19/2015.
package com.pitstop.school.lab.thirteen.one;

public class IDCard extends Card{

    private String idNumber;

    public IDCard(String n, String id)
    {
        super(n);
        idNumber = id;
    }

    public String format()
    {
        return super.format() + " | ID Number: " + idNumber;
    }
}

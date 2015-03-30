//Kyle Pittman 3/19/2015.
package com.pitstop.school.lab.thirteen.one;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DriverLicense extends Card{
    private int expYear;

    public DriverLicense(String n, int exp)
    {
        super(n);
        expYear = exp;
    }

    public String format()
    {
        return super.format() + " | Year of Expiration: " + expYear;
    }

    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        if(expYear <= year)
            return false;
        else
            return true;
    }
}

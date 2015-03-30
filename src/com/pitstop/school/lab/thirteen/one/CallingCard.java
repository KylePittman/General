//Kyle Pittman 3/19/2015.
package com.pitstop.school.lab.thirteen.one;

public class CallingCard extends Card {
    private int cardNumber;
    private String pin;

    public CallingCard(String n, int num, String inPin)
    {
        super(n);
        cardNumber = num;
        pin = inPin;
    }

    public String format()
    {
        return super.format() + " | Card Number: " + cardNumber + " | PIN: " + pin;
    }
}

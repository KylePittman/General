//Kyle Pittman 3/19/2015.
package com.pitstop.school.lab.thirteen.one;

public class BillfoldTester {
    public static void main(String[] args) {
        Billfold wallet = new Billfold();
        wallet.add(new DriverLicense("George", 2015));
        wallet.add(new IDCard("George", "17-4"));
        System.out.println(wallet.format());
    }
}

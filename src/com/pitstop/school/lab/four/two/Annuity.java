package com.pitstop.school.lab.four.two;//General Created by Kyle on 10/16/2014.

import java.util.Scanner;

public class Annuity {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter interest: ");
        double i = in.nextDouble();
        System.out.println("Periodic payment: ");
        double PMT = in.nextDouble();
        System.out.println("Enter number of payments: ");
        double n = in.nextDouble();
        double pv = PMT*(((Math.pow(1+i, n-1)-1) /i) /(Math.pow(1+i, n-1)) +1);
        System.out.println(pv);
    }
}
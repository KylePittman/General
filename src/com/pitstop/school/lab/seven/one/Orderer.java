//Kyle Pittman 11/5/2014.
package com.pitstop.school.lab.seven.one;
import java.util.Scanner;

public class Orderer {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Unit price: ");
        double unitPrice = in.nextDouble();

        System.out.print("Widgets: ");
        int widgets = in.nextInt();

        Order one = new Order(unitPrice);
        one.addWidgets(widgets);
        System.out.println("Total price: " + one.getTotalPrice());
    }
}

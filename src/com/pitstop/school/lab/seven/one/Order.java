//Kyle Pittman 11/5/2014.
package com.pitstop.school.lab.seven.one;

public class Order {
    private int widgets;
    private double price;
    public Order(double undiscountedUnitPrice)
    {
        price = undiscountedUnitPrice;
    }
    public void addWidgets(int quantity)
    {
        widgets = quantity;
    }
    public double getTotalPrice()
    {
        double totalPrice;

            totalPrice = widgets * (price - this.getUnitDiscount());
        return totalPrice;
    }
    public double getUnitDiscount()
    {
        /*double unitDiscount = ((int)((widgets - 10000)/1000)) * .10;
        if (unitDiscount > price/2) unitDiscount = price/2;*/
        double unitDiscount = 0;
        if (widgets >= 10000) unitDiscount = .05;
        if (widgets >= 20000) unitDiscount = .10;
        if (widgets >= 50000) unitDiscount = .20;


        return unitDiscount;
    }
}

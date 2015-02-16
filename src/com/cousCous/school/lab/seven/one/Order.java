//Marcus Silcox 11/5/14
package com.cousCous.school.lab.seven.one;

public class Order {
    private int widgets = 0;
    private double price = 0;
    public Order(double undiscountedUnitPrice)
    {
        price = price + undiscountedUnitPrice;
    }
    public void addWidgets(int quantity)
    {
        widgets = widgets + quantity;
    }
    public double getTotalPrice()
    {
        double totalPrice = widgets * (price - this.getUnitDiscount());

        return totalPrice;
    }
    public double getUnitDiscount()
    {
        double unitDiscount = ((int)((widgets - 10000)/1000)) * .10;
        if (unitDiscount > price/2) unitDiscount = price/2;

        return unitDiscount;
    }
}

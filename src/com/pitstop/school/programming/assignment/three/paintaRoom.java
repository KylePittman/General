//Kyle Pittman 10/25/2014.
package com.pitstop.school.programming.assignment.three;

public class paintaRoom {
    static final int GALLON_PRICE = 32;
    static final int QUART_PRICE = 10;
    static final int GALLON_COVERAGE = 350;
    static final double QUART_COVERAGE = 87.5;
    static final int DOOR_AREA = 20;
    static final int WINDOW_AREA = 15;
    private int height;
    private int length;
    private int width;
    private int doors;
    private int windows;
    private int surfaceArea;
    private int gallons;
    private int quarts;
    private double price;

    paintaRoom(int setHeight, int setLength, int setWidth, int setDoors, int setWindows){
        height = setHeight;
        length = setLength;
        width = setWidth;
        doors = setDoors;
        windows = setWindows;
        surfaceArea = (2 * height * length) + (2 * height * width) - (WINDOW_AREA * windows) - (DOOR_AREA * doors);
        gallons = (int) surfaceArea/GALLON_COVERAGE;
        quarts = (int) ((surfaceArea - gallons * GALLON_COVERAGE) / QUART_COVERAGE);
        if (surfaceArea - gallons * GALLON_COVERAGE - quarts * QUART_COVERAGE > 0) quarts++;
        if(quarts == 4){gallons = quarts/4; quarts = 0;}
        price = Math.round( 100*(1.097 * (gallons*GALLON_PRICE + quarts * QUART_PRICE)));
        price = price/100;
    }

    public double getPrice() {
        return price;
    }

    public int getSurfaceArea() {
        return surfaceArea;
    }

    public int getGallons() {
        return gallons;
    }

    public int getQuarts() {
        return quarts;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }
}

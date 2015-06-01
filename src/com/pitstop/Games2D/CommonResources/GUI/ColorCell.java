//Kyle Pittman 5/23/2015.
package com.pitstop.Games2D.CommonResources.GUI;

import java.awt.*;
import java.awt.image.ImageObserver;

public class ColorCell extends Cell {

    private Color color;

    /**
     * Default Constructor
     * Creates an empty colorless cell
     */
    public ColorCell(){
        super();
        color = null;
    }

    /**
     * Borderless Constructor
     * @param x is the x coordinate of the Cell
     * @param y is the y coordinate of the Cell
     * @param size is the size of the Cell
     * @param color is the Color the Cell will be
     */
    public ColorCell(int x, int y, int size, Color color){
        super(x, y, size);
        this.color = color;
    }

    /**
     * Bordered Cell with a black border
     * @param x is the x coordinate of the Cell
     * @param y is the y coordinate of the Cell
     * @param size is the size of the Cell
     * @param borderWidth is the width of the border of this Cell
     * @param color is the Color the Cell will be
     */
    public ColorCell(int x, int y, int size, int borderWidth, Color color){
        super(x, y, size, borderWidth);
        this.color = color;
    }

    /**
     * Bordered Cell with a black border
     * @param x is the x coordinate of the Cell
     * @param y is the y coordinate of the Cell
     * @param size is the size of the Cell
     * @param borderWidth is the width of the border of this Cell
     * @param color is the Color the Cell will be
     * @param borderColor is the Color of the Cell's border
     */
    public ColorCell(int x, int y, int size, int borderWidth, Color borderColor, Color color){
        super(x, y, size, borderWidth, borderColor);
        this.color = color;
    }

    /**
     * Used to draw the ColorCell into a frame
     * @param g is the Graphics renderer
     * @param i is the ImageObserver this will be drawn to
     */
    @Override
    public void Draw(Graphics g, ImageObserver i) {
        g.setColor(color);
        if(getBorderWidth() == 0)
            g.fillRect(getX(), getY(), getSize(), getSize());
        else{
            g.fillRect(getX() + getBorderWidth(), getY() + getBorderWidth(), getSize() - 2*getBorderWidth(), getSize() - 2*getBorderWidth());
            for (int j = 1; j <= getBorderWidth(); j++) {
                g.setColor(getBorderColor());
                g.drawRect(getX() + j, getY() + j, getSize() - 2*j, getSize() - 2*j);
            }
        }
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

//Kyle Pittman 5/23/2015.
package com.pitstop.Games2D.CommonResources.GUI;

import java.awt.*;
import java.awt.image.ImageObserver;

/**
 * A Cell is an Object which can be drawn to a frame.
 * Intended for sprite, or square game object, usage.
 */
public abstract class Cell{
    private int size;
    private int x;
    private int y;
    private int borderWidth;
    private Color borderColor;

    /**
     * Default Constructor
     * Creates an empty cell
     */
    public Cell(){
        x = 0;
        y = 0;
        size = 0;
        borderWidth = 0;
        borderColor = Color.BLACK;
    }

    /**
     * Creates a borderless Cell
     * @param x is the x coordinate of the Cell
     * @param y is the y coordinate of the Cell
     * @param size is the width and height of the Cell
     */
    public Cell(int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
        borderWidth = 0;
        borderColor = Color.BLACK;
    }

    /**
     * Creates a bordered Cell with a black border
     * @param x is the x coordinate of the Cell
     * @param y is the y coordinate of the Cell
     * @param size is the width and height of the Cell
     * @param borderWidth is the width of the border around the cell
     */
    public Cell(int x, int y, int size, int borderWidth){
        this.x = x;
        this.y = y;
        this.size = size;
        this.borderWidth = borderWidth;
        borderColor = Color.BLACK;
    }

    /**
     * Creates a bordered Cell with a black border
     * @param x is the x coordinate of the Cell
     * @param y is the y coordinate of the Cell
     * @param size is the width and height of the Cell
     * @param borderWidth is the width of the border around the cell
     * @param borderColor is the Color of the border
     */
    public Cell(int x, int y, int size, int borderWidth, Color borderColor){
        this.x = x;
        this.y = y;
        this.size = size;
        this.borderWidth = borderWidth;
        this.borderColor = borderColor;
    }

    /**
     * Gets the x coordinate of the Cell
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * Gets the y coordinate of the Cell
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     * Gets the size of the Cell
     * @return size
     */
    public int getSize(){
        return size;
    }

    /**
     * Gets the border width of the Cell
     * @return borderWidth
     */
    public int getBorderWidth() {
        return borderWidth;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    /**
     * Sets the x coordinate of the Cell
     * @param x the new x coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Sets the y coordinate of the Cell
     * @param y the new y coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Sets the size of the Cell
     * @param size the new size of the cell
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Sets the border width of the cell
     * @param borderWidth the new border width
     */
    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public abstract void Draw(Graphics g, ImageObserver i);

}

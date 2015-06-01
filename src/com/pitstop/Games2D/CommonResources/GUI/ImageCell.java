//Kyle Pittman 5/23/2015.
package com.pitstop.Games2D.CommonResources.GUI;

import java.awt.*;
import java.awt.image.ImageObserver;

public class ImageCell extends Cell {

    private Image image;

    /**
     * Default Constructor
     * Creates an empty cell with no image
     */
    public ImageCell(){
        super();
        image = null;
    }

    /**
     * Borderless Constructor
     * @param x is the x coordinate of the Cell
     * @param y is the y coordinate of the Cell
     * @param size is the size of the Cell
     * @param image is the image the Cell displays
     */
    public ImageCell(int x, int y, int size, Image image){
        super(x, y, size);
        this.image = image;
    }

    /**
     * Bordered Constructor with a black border
     * @param x is the x coordinate of the Cell
     * @param y is the y coordinate of the Cell
     * @param size is the size of the Cell
     * @param borderWidth is the border width of the Cell
     * @param image is the image the Cell displays
     */
    public ImageCell(int x, int y, int size, int borderWidth, Image image){
        super(x, y, size, borderWidth);
        this.image = image;
    }

    /**
     * Bordered Constructor with a black border
     * @param x is the x coordinate of the Cell
     * @param y is the y coordinate of the Cell
     * @param size is the size of the Cell
     * @param borderWidth is the border width of the Cell
     * @param image is the image the Cell displays
     * @param borderColor is the Color of the Cell's border
     */
    public ImageCell(int x, int y, int size, int borderWidth, Color borderColor, Image image){
        super(x, y, size, borderWidth, borderColor);
        this.image = image;
    }

    /**
     * Used to draw the Cell's image into a frame
     * @param g is the Graphics renderer
     * @param i is the ImageObserver this will be drawn to
     */
    @Override
    public void Draw(Graphics g, ImageObserver i) {
        if(getBorderWidth() == 0)
            g.drawImage(image, getX(), getY(), getSize(), getSize(), i);
        else{
            g.drawImage(image, getX() + getBorderWidth(), getY() + getBorderWidth(), getSize()-2*getBorderWidth(), getSize()-2*getBorderWidth(), i);
            for (int j = 1; j <= getBorderWidth(); j++) {
                g.setColor(getBorderColor());
                g.drawRect(getX() + j, getY() + j, getSize() - 2*j, getSize() - 2*j);
            }
        }
    }

    /**
     * Gets the Image
     * @return image
     */
    public Image getImage() {
        return image;
    }

    /**
     * Sets the image
     * @param image is the new Image
     */
    public void setImage(Image image) {
        this.image = image;
    }
}

//Kyle Pittman 4/11/2015.
package com.pitstop.Games2D.SnakeV2.Entities;

import java.awt.*;

public class BodyPart {
    private int xCoord, yCoord;
    private Image img;

    public BodyPart(Image image){
        img = image;
    }

    public BodyPart(int xCo, int yCo, Image image){
        img = image;
        xCoord = xCo;
        yCoord = yCo;
    }

    public void tick(){

    }

    public void setCoordinates(int x, int y){
        setxCoord(x);
        setyCoord(y);
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public Image getImg() {
        return img;
    }
}

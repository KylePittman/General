//Kyle Pittman 4/11/2015.
package com.pitstop.Games.SnakeV2.Entities;

import javax.swing.*;
import java.awt.*;

public class Apple {
    private int xCoord, yCoord;
    private Image img = new ImageIcon("C:\\Java Workspace\\General\\src\\com\\pitstop\\Games\\SnakeV2\\Entities\\apple.png").getImage();

    public Apple(){
    }

    public Apple(int xCo, int yCo){
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

//Kyle Pittman 5/29/2015.
package com.pitstop.Games2D.CommonResources.GUI;

import javax.swing.*;
import java.awt.*;

public class ImageCellPanel extends JPanel{

    private ImageCell imageCell;

    public ImageCellPanel(ImageCell imageCell){
        this.imageCell = imageCell;
    }

    public void setImageCell(ImageCell imageCell) {
        this.imageCell = imageCell;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        imageCell.Draw(g, this);
    }

}

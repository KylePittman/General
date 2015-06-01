//Kyle Pittman 5/29/2015.
package com.pitstop.Games2D.CommonResources.GUI;

import javax.swing.*;
import java.awt.*;

public class ColorCellPanel extends JPanel {

    private ColorCell colorCell;

    public ColorCellPanel(ColorCell colorCell){
        this.colorCell = colorCell;
    }

    public void setColorCell(ColorCell colorCell) {
        this.colorCell = colorCell;
    }

    public ColorCell getColorCell() {
        ColorCell temp = new ColorCell(getX(), getY(), colorCell.getSize(), colorCell.getBorderWidth(), colorCell.getBorderColor(), colorCell.getColor());
        return temp;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        colorCell.Draw(g, this);
    }
}

//Kyle Pittman 5/23/2015.
package com.pitstop.Games2D.CellTest;

import com.pitstop.Games2D.CommonResources.GUI.Cell;
import com.pitstop.Games2D.CommonResources.GUI.ColorCell;
import com.pitstop.Games2D.CommonResources.GUI.ImageCell;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CellTest extends JPanel {

    public static void main(String[] args) {
        Image body = new ImageIcon("C:\\Java Workspace\\General\\src\\com\\pitstop\\Games2D\\SnakeV2\\Entities\\body.png").getImage();
        Image head = new ImageIcon("C:\\Java Workspace\\General\\src\\com\\pitstop\\Games2D\\SnakeV2\\Entities\\head.png").getImage();

        CellArray cellArray = new CellArray();
        cellArray.addCell(new ImageCell(0, 0, 10, head));
        cellArray.addCell(new ColorCell(50, 10, 20, 1, Color.BLUE));
        cellArray.addCell(new ImageCell(20, 10, 30, 2, Color.GREEN, body));
        cellArray.addCell(new ColorCell(10, 20, 4, Color.PINK));
        cellArray.setMinimumSize(new Dimension(100, 100));

        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(100,100));
        frame.setResizable(false);
        frame.add(cellArray);
        frame.setVisible(true);
        frame.pack();
        cellArray.repaint();
    }
}

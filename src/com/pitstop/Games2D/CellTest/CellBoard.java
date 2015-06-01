//Kyle Pittman 5/23/2015.
package com.pitstop.Games2D.CellTest;

import com.pitstop.Games2D.CommonResources.GUI.ColorCell;
import javax.swing.*;
import java.awt.*;

public class CellBoard {
    private final static int WIDTH = 500;
    private final static int HEIGHT = 400;
    private final static int FRAME_WIDTH_BUFFER = 8;
    private final static int FRAME_HEIGHT_BUFFER = 31;
    private final static int SIZE = 25;

    public static void main(String[] args) {

        CellArray cellArray = new CellArray();

        /**
         * Create the Grid of black outlined, white Cells
         */
        for (int i = 0; i < WIDTH; i+=(SIZE)) {
            for (int j = 0; j < HEIGHT; j+=(SIZE)) {
                cellArray.addCell(new ColorCell(i, j, SIZE + 1, 1, Color.WHITE));
            }
        }

        /**
         * Set up CellTest panel
         */
        cellArray.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        cellArray.setBackground(Color.BLACK);
        cellArray.setBounds(0, 0, WIDTH, HEIGHT);

        /**
         * Set up the Frame to display the panel
         */
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(WIDTH + FRAME_WIDTH_BUFFER,HEIGHT + FRAME_HEIGHT_BUFFER));
        frame.setResizable(false);
        frame.add(cellArray);
        frame.setVisible(true);
        frame.pack();

    }
}

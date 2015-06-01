//Kyle Pittman 5/28/2015.
package com.pitstop.Games2D.MapEditor;

import com.pitstop.Games2D.CellTest.CellArray;
import com.pitstop.Games2D.CommonResources.GUI.ColorCell;
import com.pitstop.Games2D.CommonResources.GUI.ColorCellPanel;
import com.pitstop.Games2D.CommonResources.KeyListeners.ArrowListener;
import com.pitstop.Games2D.CommonResources.KeyListeners.EnterListener;
import com.pitstop.Games2D.CommonResources.KeyListeners.NumberListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Editor extends JLayeredPane implements ActionListener, Runnable {
    private static final int MAP_WIDTH = 1201;
    private static final int MAP_HEIGHT = 651;
    private static final int FRAME_WIDTH_BUFFER = 7;
    private static final int FRAME_HEIGHT_BUFFER = 30;
    private static final int SIZE = 10;
    private ColorCell empty = new ColorCell(0, 0, SIZE + 1, 1, Color.WHITE);
    private ColorCell wall = new ColorCell(0, 0, SIZE + 1, Color.BLACK);
    private static final ArrowListener arrowListener = new ArrowListener(false);
    private static final NumberListener numberListener = new NumberListener();
    private static final EnterListener enterListener = new EnterListener();
    private CellArray cellArray;
    private Timer timer;
    private ColorCellPanel tile;
    private int tileXCoord;
    private int tileYCoord;

    public Editor() {
        setLayout(null);
        setPreferredSize(new Dimension(MAP_WIDTH, MAP_HEIGHT));
        addKeyListener(arrowListener);
        addKeyListener(numberListener);
        addKeyListener(enterListener);
        setFocusable(true);
        timer = new Timer(150, this);
        init();


    }

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setBounds(0, 0, MAP_WIDTH, MAP_HEIGHT);


        JFrame frame = new JFrame("Editor");

        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(MAP_WIDTH + FRAME_WIDTH_BUFFER, MAP_HEIGHT + FRAME_HEIGHT_BUFFER));
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(editor);
        editor.run();
        frame.pack();
    }

    public void init() {
        cellArray = new CellArray();
        /**
         * Create the Grid of black outlined, white Cells
         */
        for (int i = 0; i < MAP_WIDTH; i += (SIZE)) {
            for (int j = 0; j < MAP_HEIGHT; j += (SIZE)) {
                if (i == 0 || i == MAP_WIDTH - SIZE - 1 || j == 0 || j == MAP_HEIGHT - SIZE - 1) {
                    cellArray.addCell(new ColorCell(i, j, SIZE + 1, Color.BLACK));
                } else {
                    cellArray.addCell(new ColorCell(i, j, SIZE + 1, 1, Color.WHITE));
                }
            }
        }
        cellArray.setPreferredSize(new Dimension(MAP_WIDTH, MAP_HEIGHT));
        add(cellArray);
        cellArray.setBounds(0, 0, MAP_WIDTH, MAP_HEIGHT);

        timer.start();
        tileXCoord = 0;
        tileYCoord = 0;

        tile = new ColorCellPanel(wall);
        add(tile);
        setLayer(cellArray, 0);
        setLayer(tile, 1);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        cellArray.repaint();
        tile.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        run();
    }

    @Override
    public void run() {
        if (arrowListener.isChange()) {
            if (enterListener.isPressed())
                enterListener.setPressed(false);

            if (arrowListener.getDirection() == 0) {
                tileYCoord -= (SIZE);
            } else if (arrowListener.getDirection() == 1) {
                tileXCoord += (SIZE);
            } else if (arrowListener.getDirection() == 2) {
                tileYCoord += (SIZE);
            } else if (arrowListener.getDirection() == 3) {
                tileXCoord -= (SIZE);
            }
            arrowListener.setChange(false);
        }
        if (numberListener.isChange()) {

            if (numberListener.getLastNumberPressed() == 0) {
                home();
                System.out.println("0 was pressed");
            } else if (numberListener.getLastNumberPressed() == 1) {
                tile.setColorCell(empty);
            } else {
                tile.setColorCell(wall);
            }

            tile.repaint();
            numberListener.setChange(false);
        }
        if (enterListener.isPressed()) {

            System.out.println("Cell Index: " + cellArray.getCellIndex(tileXCoord, tileYCoord));
            System.out.println("Tile x: " + tileXCoord + " Tile Y: " + tileYCoord);

            drawCellToGrid();
            enterListener.setPressed(false);
            repaint();
        }


        tile.setBounds(tileXCoord, tileYCoord, SIZE + 1, SIZE + 1);
    }

    private void home() {
        tileXCoord = 0;
        tileYCoord = 0;
        tile.setColorCell(wall);
        tile.setBounds(tileXCoord, tileYCoord, SIZE + 1, SIZE + 1);
    }

    private void drawCellToGrid() {
        if (cellArray.getCellIndex(tileXCoord, tileYCoord) != -1) ;
        cellArray.setCell(tileXCoord, tileYCoord, tile.getColorCell());
    }
}

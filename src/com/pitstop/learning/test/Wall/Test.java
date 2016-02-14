//Kyle Pittman 2/13/2016.
package com.pitstop.learning.test.Wall;

import com.sun.glass.ui.Size;

import javax.swing.*;
import java.awt.*;

public class Test extends Canvas implements Runnable{

    private static final int SIZE = 93;
    private static final int WIDTH = 8;
    private static final int HEIGHT = 8;

    private Map map;

    public static void main(String[] args) {

        Test test = new Test();
        test.setBounds(0,0,WIDTH * SIZE, HEIGHT * SIZE);

        JFrame frame = new JFrame("Test");

        frame.add(test);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public Test(){
        map = new Map(WIDTH,HEIGHT);

        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                map.setCell(x, y, new Cell(SIZE,(int) (Math.random() * 10) % 2));
            }
        }

        /*
        map.setCell(0,0, new Cell(SIZE, 0));
        map.setCell(0,1, new Cell(SIZE, 0));
        map.setCell(1,0, new Cell(SIZE, 0));
        map.setCell(1,1, new Cell(SIZE, 1));
        map.setCell(2,0, new Cell(SIZE, 1));
        map.setCell(2,1,new Cell(SIZE, 1));
        map.setCell(3,0, new Cell(SIZE, 1));
        map.setCell(3,1, new Cell(SIZE, 0));
        */
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        map.paint(g);
    }

    @Override
    public void run() {
        repaint();
    }
}

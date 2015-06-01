//Kyle Pittman 4/10/2015.
package com.pitstop.Games2D.SnakeV2;

import com.pitstop.Games2D.SnakeV2.Graphics.Screen;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{
    private static final int S_WIDTH = 800;
    private static final int S_HEIGHT = 400;
    private static final int STAT_HEIGHT = 100;
    private static final int S_DELAY = 100;
    private Screen panel;

    public Frame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Frame");
        setPreferredSize(new Dimension(S_WIDTH + 7, STAT_HEIGHT + S_HEIGHT + 29));
        setResizable(false);
        init();
    }

    private void init() {
        setLayout(null);

        panel = new Screen(S_WIDTH,S_HEIGHT,S_DELAY);

        panel.setBounds(0,0,S_WIDTH,S_HEIGHT);
        panel.setFocusable(true);

        add(panel);

        pack();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Frame();
    }


}

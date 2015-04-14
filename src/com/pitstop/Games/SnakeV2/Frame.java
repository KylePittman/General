//Kyle Pittman 4/10/2015.
package com.pitstop.Games.SnakeV2;

import com.pitstop.Games.SnakeV2.Graphics.Screen;
import com.pitstop.Games.SnakeV2.Graphics.StatusBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame{
    private static final int S_WIDTH = 800;
    private static final int S_HEIGHT = 400;
    private static final int STAT_HEIGHT = 100;
    private static final int S_DELAY = 100;
    private Screen panel;
    private StatusBar stat;

    public Frame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Frame");
        setPreferredSize(new Dimension(S_WIDTH, STAT_HEIGHT + S_HEIGHT));
        setResizable(false);
        init();
    }

    private void init() {
        setLayout(null);

        panel = new Screen(S_WIDTH,S_HEIGHT,S_DELAY);
        stat = new StatusBar(S_WIDTH, STAT_HEIGHT, panel);

        stat.setBounds(0,S_HEIGHT,S_WIDTH,STAT_HEIGHT);
        panel.setBounds(0,0,S_WIDTH,S_HEIGHT);
        panel.setFocusable(true);

        add(stat);
        add(panel);

        pack();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Frame();
    }


}

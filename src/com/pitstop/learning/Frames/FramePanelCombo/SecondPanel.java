//Kyle Pittman 4/10/2015.
package com.pitstop.learning.Frames.FramePanelCombo;

import javax.swing.*;
import java.awt.*;

public class SecondPanel extends JPanel{
    private int number = 1;
    public SecondPanel(){
        /**
         * Allows Custom Layout
         */
        setLayout(null);

        /**
         * Components, one with a variable used as a label
         */
        JLabel labelOne = new JLabel("" + number);
        JLabel labelTwo = new JLabel("Two");

        /**
         * set the background of a label
         * MUST SET TO OPAQUE
         */
        labelOne.setBackground(Color.yellow);
        labelOne.setOpaque(true);

        /**
         * Set font color
         */
        labelTwo.setForeground(Color.CYAN);

        /**
         * Set the location of buttons
         */
        labelOne.setBounds(20,20,50,20);
        labelTwo.setBounds(300,100,50,20);

        /**
         * Add components
         */
        add(labelOne);
        add(labelTwo);

        setVisible(true);
    }
}

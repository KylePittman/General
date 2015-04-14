//Kyle Pittman 4/10/2015.
package com.pitstop.learning.Frames.FramePanelCombo;

import javax.swing.*;
import java.awt.*;

public class FirstPanel extends JPanel {
    public FirstPanel(){
        /**
         * Null Layout allows custom layout using .setBounds(int x, int y, int width, int height)
         */
        setLayout(null);

        /**
         * Sets the background of a pane
         */
        setBackground(Color.LIGHT_GRAY);

        /**
         * Components to add
         */
        JButton button = new JButton("Button");
        JLabel labelOne = new JLabel("One");
        JLabel labelTwo = new JLabel("Two");

        /**
         * Set location and size of Components
         */
        button.setBounds(30,5,90,15);
        labelOne.setBounds(200,5,70,10);
        labelTwo.setBounds(400,5,70,10);

        /**
         * Changing the background of a label
         */
        labelOne.setBackground(Color.white);
        labelOne.setOpaque(true);



        /**
         * Add Components to frame
         */
        add(labelOne);
        add(button);
        add(labelTwo);

        setVisible(true);
    }
}

//Kyle Pittman 1/9/2016.
package com.pitstop.learning.Frames.CodependentFrames;

import javax.swing.*;
import java.awt.*;

public class PanelOne extends JPanel{
    public PanelOne(){
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

        /**
         * Set location and size of Components
         */
        button.setBounds(30,5,90,15);

        /**
         * Changing the background of a label
         */



        /**
         * Add Components to frame
         */
        add(button);

        setVisible(true);
    }
}

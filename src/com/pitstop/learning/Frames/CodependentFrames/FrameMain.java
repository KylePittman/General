//Kyle Pittman 1/9/2016.
package com.pitstop.learning.Frames.CodependentFrames;

import javax.swing.*;
import java.awt.*;

public class FrameMain {

    public static void main(String[] args) {
        /**
         * Create main frame which contains everything
         */
        JFrame frame = new JFrame();

        /**
         * Create Panels
         */
        //FirstPanel panelOne = new FirstPanel();
        //SecondPanel panelTwo = new SecondPanel();
        //PicturePanel back = new PicturePanel(new ImageIcon("C:\\Java Workspace\\General\\src\\com\\pitstop\\learning\\Frames\\FramePanelCombo\\Background.png").getImage());

        /**
         * Allows creation of custom layout
         */
        frame.setLayout(null);

        /**
         * Position the frames
         */
        //panelOne.setBounds(0, 0, 500, 100);
        /**
         * back is the background for panelTwo
         */
        //panelTwo.setBounds(0,100,500,300);
        //back.setBounds(0,100,500,300);

        /**
         * Turns off the background for this panel, allowing the background to be seen through it
         */
        //panelTwo.setOpaque(false);

        /**
         * Add components
         * Order is important
         * First panel added will be on top
         * Add backgrounds last
         */
        //frame.add(panelOne);
        //frame.add(panelTwo);
        //frame.add(back);

        /**
         * set the window size
         * for an internal(the non frame part) of 500x429
         * side buffer of 5 pixels and top/bottom buffer
         * of 29 pixels
         */
        frame.setMinimumSize(new Dimension(505, 429));

        /**
         * Sets the top left Icon and the Icon in the
         * toolbar
         * Sets the name of the frame
         */
        frame.setIconImage(new ImageIcon("C:\\Java Workspace\\General\\src\\com\\pitstop\\learning\\SnakeAttempt\\apple.png").getImage());
        frame.setTitle("I'm a Frame");

        /**
         * terminates the program when the top right X is clicked
         */
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**
         * unsure as to importance but is used in a lot of things
         */
        frame.pack();

        /**
         * Doesn't allow you to resize the window
         * Makes the window visible
         */
        frame.setResizable(false);
        frame.setVisible(true);
    }


}

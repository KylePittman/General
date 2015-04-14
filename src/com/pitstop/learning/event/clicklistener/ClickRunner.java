//ClickRunner Created by Kyle on 10/7/2014.
package com.pitstop.learning.event.clicklistener;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ClickRunner {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("C:\\Java Workspace\\General\\src\\com\\pitstop\\learning\\Frames\\apple.png");
        JButton button = new JButton(icon);
        button.setPreferredSize(new Dimension(1,10));
        frame.add(button);

        ActionListener listener = new ClickListener();
        button.addActionListener(listener);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 100;
}

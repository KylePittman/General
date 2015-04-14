//Kyle Pittman 4/9/2015.
package com.pitstop.learning.Frames;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ShowPNG {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("C:\\Java Workspace\\General\\src\\com\\pitstop\\learning\\Frames\\apple.png");
        JLabel label = new JLabel();
        label.setIcon(icon);
        frame.add(label);
        frame.setVisible(true);

    }
}

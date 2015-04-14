//Kyle Pittman 4/10/2015.
package com.pitstop.learning.Frames.FramePanelCombo;

import javax.swing.*;
import java.awt.*;

public class SplitFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        FirstPanel panelOne = new FirstPanel();
        SecondPanel panelTwo = new SecondPanel();
        JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, panelOne, panelTwo);
        split.setContinuousLayout(false);

        frame.add(split);

        frame.setMinimumSize(new Dimension(500,400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);
        frame.setVisible(true);
    }
}

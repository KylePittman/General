//Kyle Pittman 2/4/2016.
package com.pitstop.learning.Frames.SwitchPanels;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private MainFrame mainFrame;
    private JButton button;

    public GamePanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        init();
    }

    private void init() {
        button = new JButton();
        button.setEnabled(true);
        button.setVisible(true);
        button.setText("Quit Game");
        button.addActionListener(new ButtonActionListener(mainFrame));
        button.setBounds(50,50,20,10);
        this.add(button);
        this.setBackground(Color.RED);
    }
}

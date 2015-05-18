//Kyle Pittman 5/12/2015.
package com.pitstop.learning.Frames.PanelsWorkingTogether;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputPanel extends JPanel {
    private MainPanel main;
    private JButton button;
    public InputPanel(final MainPanel main){
        this.main = main;
        button = new JButton("Toggle Image");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                main.toggle();
            }
        });
        button.setPreferredSize(new Dimension(200,20));
        add(button);
    }
}

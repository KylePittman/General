//Kyle Pittman 4/13/2015.
package com.pitstop.Games2D.SnakeV2.Graphics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StatusBar extends JPanel {
    private Screen panel;
    private JButton button;
    public JLabel label;
    private JLabel title;
    private int score = 0;

    public StatusBar(int width, int height, final Screen panel){
        this.panel = panel;
        button = new JButton("Restart");
        label = new JLabel(""+ score);
        title = new JLabel("Snake");
        button.setBounds(3*width/5, height/2 + 20, 30, 20);
        label.setBounds(4*width/5, height/2 + 20, 50, 20);
        title.setBounds(width/5, height/2 + 40, 70, 40);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.stop();
                panel.start();
                panel.requestFocus();
            }
        });
        add(button);
        add(label);
        add(title);
    }

}

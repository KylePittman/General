//Kyle Pittman 4/9/2015.
package com.pitstop.learning.SnakeAttempt;

import javax.swing.*;
import java.awt.*;

public class Snake extends JFrame {
    public Snake(){
        add(new Board());

        setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame ex = new Snake();
                ex.setVisible(true);
            }
        });
    }
}

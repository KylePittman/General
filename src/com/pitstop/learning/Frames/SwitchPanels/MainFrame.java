//Kyle Pittman 2/4/2016.
package com.pitstop.learning.Frames.SwitchPanels;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{

    private static final int WIDTH = 200;
    private static final int HEIGHT = 100;
    private StartPanel startPanel;

    private GamePanel gamePanel;
    private boolean startPanelActive;

    public static void main(String[] args) {
        new MainFrame();
    }

    public MainFrame(){
        startPanel= new StartPanel(this);
        gamePanel = new GamePanel(this);
        init();
    }

    private void init() {
        this.setLayout(null);
        this.setBounds(0, 0, WIDTH, HEIGHT);
        startPanel.setBounds(0, 0, WIDTH, HEIGHT);
        startPanel.setEnabled(true);
        startPanel.setVisible(true);

        gamePanel.setBounds(0,0,WIDTH,HEIGHT);
        gamePanel.setEnabled(true);
        gamePanel.setVisible(true);


        startPanelActive = true;
        this.getContentPane().add(startPanel);
        this.setEnabled(true);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //this.setResizable(false);
        //this.pack();
    }

    public void switchPanel(){
        this.invalidate();
        if (startPanelActive){
            this.getContentPane().removeAll();//(startPanel);
            this.getContentPane().add(gamePanel);

        }
        else{
            this.getContentPane().remove(gamePanel);
            this.getContentPane().add(startPanel);
        }
        this.validate();
        this.update(this.getGraphics());
        startPanelActive = !startPanelActive;
    }
    
}

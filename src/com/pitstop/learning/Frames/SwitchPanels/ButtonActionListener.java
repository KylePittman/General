//Kyle Pittman 2/4/2016.
package com.pitstop.learning.Frames.SwitchPanels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionListener implements ActionListener {

    private MainFrame mainFrame;

    public ButtonActionListener(MainFrame mainFrame){
        this.mainFrame = mainFrame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        mainFrame.switchPanel();
    }
}

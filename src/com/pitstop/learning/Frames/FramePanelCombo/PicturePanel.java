//Kyle Pittman 4/11/2015.
package com.pitstop.learning.Frames.FramePanelCombo;

import javax.swing.*;
import java.awt.*;

public class PicturePanel extends JPanel {
    /**
     * Used to put a background into a panel/frame
     */
    private Image img;
    public PicturePanel(Image img){
        this.img = img;
        repaint();
     setVisible(true);
    }


    public void paint(Graphics g){
        g.drawImage(img , 0, 0, this);
    }
}

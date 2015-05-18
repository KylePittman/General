//Kyle Pittman 5/12/2015.
package com.pitstop.learning.Frames.PanelsWorkingTogether;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class OutputPanel extends JPanel{
    private Image body = new ImageIcon("C:\\Java Workspace\\General\\src\\com\\pitstop\\learning\\Frames\\PanelsWorkingTogether\\body.png").getImage();
    private Image apple = new ImageIcon("C:\\Java Workspace\\General\\src\\com\\pitstop\\learning\\Frames\\PanelsWorkingTogether\\apple.png").getImage();
    private Image currentImage = apple;

    public OutputPanel(){
        this.setPreferredSize(new Dimension(10,10));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(currentImage, 0 ,0, this);
    }

    public void setImage(boolean apple){
        if(apple)
            currentImage = this.apple;
        else
            currentImage = body;
        repaint();
    }
}

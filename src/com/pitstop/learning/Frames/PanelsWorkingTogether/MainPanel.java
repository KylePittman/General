//Kyle Pittman 5/12/2015.
package com.pitstop.learning.Frames.PanelsWorkingTogether;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private static final int HEIGHT = 600;
    private static final int WIDTH = 800;
    private boolean image = false;
    private OutputPanel output;
    public MainPanel(OutputPanel output){
        this.output = output;
        this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
    }

    public void toggle(){
        image = !image;
        output.setImage(image);
    }


}

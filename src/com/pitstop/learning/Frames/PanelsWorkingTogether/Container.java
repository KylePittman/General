//Kyle Pittman 5/12/2015.
package com.pitstop.learning.Frames.PanelsWorkingTogether;

import javax.swing.*;

public class Container extends JFrame{
    public Container(){
        OutputPanel out = new OutputPanel();
        MainPanel main = new MainPanel(out);
        InputPanel in = new InputPanel(main);
        this.setPreferredSize(main.getPreferredSize());
        this.setResizable(false);

        main.setBounds(0,0, (int) main.getPreferredSize().getWidth(),(int) main.getPreferredSize().getHeight());

        add(out);
        out.setBounds(100,100,10,10);
        out.setVisible(true);
        add(in);
        in.setBounds(200,100,300,25);
        in.setVisible(true);
        add(main);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public static void main(String[] args) {
        Container f = new Container();
    }
}

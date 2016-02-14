package com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
 

public class ArrowAction extends AbstractAction{
	
	private Point direction;
	 
    private Game model;
 
    public ArrowAction(Game model, Point direction) {
        this.model = model;
        this.direction = direction;
    }
 
    public void actionPerformed(ActionEvent event) {
        if (model.isGameActive() && !model.isDirectionUpdated()) {
            model.setDirectionUpdated(true);
            model.getSnake().setSnakeDirection(direction);
        }
    }
 

}

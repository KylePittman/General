package com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game.Model;

import javax.swing.*;
import java.awt.Image;
import java.awt.Point;

public class Apple {
	
	private Image appleImage;
	
	private int points;
	
	private Point location;
	
	public Apple(Image appleImage, int x, int y){
		this.appleImage = appleImage;
		setLocation(x,y);
		this.points = 1;
	}
	
	public Apple(Image appleImage, Point location){		
		this.appleImage = appleImage;
		setLocation(location);
		this.points = 1;
	}
	
	public Image getAppleImage() {
		return appleImage;
	}
	
	public Point getLocation() {
		return location;
	}
	
	public void setLocation(int x, int y) {
		this.location = new Point(x, y);
	}
	
	public void setLocation(Point loc) {
		this.location = loc;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	public int appleEaten(Point p, JComboBox dif) {
		if (p.equals(location)) {
            int multiplier = (dif.getSelectedItem().equals("Easy") ? 1 : dif.getSelectedItem().equals("Medium") ? 2 : 3);
			int score = points * multiplier;
			points++;
			return score;
		} else {
			return 0;
		}
	}

}

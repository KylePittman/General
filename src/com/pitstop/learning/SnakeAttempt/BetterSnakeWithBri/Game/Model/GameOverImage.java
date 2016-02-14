package com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game.Model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class GameOverImage {
	
	 private BufferedImage image;
	 
	    private Game model;
	 
	    public GameOverImage(Game model) {
	        this.model = model;
	    }
	 
	    public void run() {
	        String s = "Game Over";
	        Dimension d = model.getPreferredSize();
	        image = new BufferedImage(d.width, d.height,
	                BufferedImage.TYPE_INT_ARGB);
	        Graphics2D g = image.createGraphics();
	 
	        // Black with a 15% transparency
	        Color c = new Color(0.0f, 0.0f, 0.0f, 0.15f);
	        g.setColor(c);
	        g.fillRect(0, 0, d.width, d.height);
	 
	        g.setColor(Color.BLUE);
	        Font font = g.getFont();
	        Font largeFont = font.deriveFont(72.0F);
	        FontRenderContext frc = new FontRenderContext(null, true, true);
	        Rectangle2D r = largeFont.getStringBounds(s, frc);
	        int rWidth = (int) Math.round(r.getWidth());
	        int rHeight = (int) Math.round(r.getHeight());
	        int rX = (int) Math.round(r.getX());
	        int rY = (int) Math.round(r.getY());
	 
	        int x = (d.width / 2) - (rWidth / 2) - rX;
	        int y = (d.height / 2) - (rHeight / 2) - rY;
	 
	        g.setFont(largeFont);
	        g.drawString(s, x, y);
	 
	        g.dispose();
	    }
	 
	    public BufferedImage getImage() {
	        return image;
	    }

}

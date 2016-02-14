package com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game.Model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.util.List;
 
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
 

public class GridPanel extends JPanel{
	
	 private GameOverImage gameOverImage;
	 
	    private Game model;
	 
	    public GridPanel(Game model) {
	        this.model = model;
	        this.gameOverImage = new GameOverImage(model);
	        this.gameOverImage.run();
	 
	        Border border = BorderFactory.createLineBorder(Color.BLACK, 5);
	        this.setBorder(border);
	        this.setPreferredSize(model.getPreferredSize());
	    }
	 
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D g2d = (Graphics2D) g;
	 
	        int cellWidth = Game.getCellWidth();
	        int cellHeight = Game.getCellHeight();
	        int squareWidth = Game.getSquareWidth();
	 
	        int x = 0;
	        int y = 0;
	 
	        for (int w = 0; w < cellWidth; w++) {
	            for (int h = 0; h < cellHeight; h++) {
	                if((h%2 ==0 && w%2 == 0) || (h%2 == 1 && w%2 == 1)) g2d.setColor(Color.GREEN);
                    else g2d.setColor(Color.WHITE);
	                g2d.fillRect(x, y, squareWidth, squareWidth);
	                y += squareWidth;
	            }
	            x += Game.getSquareWidth();
	            y = 0;
	        }
	 
	        drawSnake(g2d, squareWidth);
	        drawApple(g2d, squareWidth);
	 
	        if (model.isGameOver()) {
	            g2d.drawImage(gameOverImage.getImage(), 0, 0, this);
	        }
	    }
	 
	    private void drawSnake(Graphics2D g2d, int squareWidth) {
	        int x;
	        int y;
	        Snake snake = model.getSnake();
	        List<Segment> segments = snake.getSnakeCells();
	        int snakeWidth = squareWidth - 4;
	 
	        for (int i = 0; i < segments.size(); i++) {
	            Segment segment = segments.get(i);
	            Point p = segment.getLocation();
	            x = p.x * squareWidth + 2;
	            y = p.y * squareWidth + 2;
	 
	            g2d.setColor(segment.getColor());
	            g2d.fillRoundRect(x, y, snakeWidth, snakeWidth, snakeWidth / 2,
	                    snakeWidth / 2);
	 
	            if (i == 0) {
	                x += (squareWidth / 2) - 1;
	                y += (squareWidth / 2) - 1;
	 
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(3F));
	                drawCircle(g2d, x, y, (squareWidth / 2) - 6);
	            }
	        }
	    }
	 
	    private void drawCircle(Graphics2D g2d, int x, int y, int radius) {
	        g2d.drawOval(x - radius, y - radius, radius + radius, radius + radius);
	    }
	 
	    private void drawApple(Graphics2D g2d, int squareWidth) {
	        Apple apple = model.getApple();
	        Image image = apple.getAppleImage();
	        Point p = apple.getLocation();
	 
	        int x = p.x * squareWidth + 1;
	        int y = p.y * squareWidth + 1;
	        g2d.drawImage(image, x, y, this);
	    }
	}

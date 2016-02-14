package com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game.Model;


import com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game.View.SnakeGameFrame;

import javax.swing.*;
import java.io.IOException;

public class GameRunnable implements Runnable{
	
	 private volatile boolean running;
	 
	    private SnakeGameFrame frame;
	 
	    private Game model;
	 
	    public GameRunnable(SnakeGameFrame frame, Game model) {
	        this.frame = frame;
	        this.model = model;
	        this.running = true;
	    }
	 
	    public void run() {
	        while (running) {
	            long startTime = System.currentTimeMillis();
                model.setDirectionUpdated(false);
	 
	            if (model.isGameActive()) {
                    frame.getControlPanel().getDifficulty().setEnabled(false);
                    frame.getControlPanel().getBorder().setEnabled(false);
	                Snake snake = model.getSnake();
	                Apple apple = model.getApple();
	                snake.updatePosition();
	                if (snake.isSnakeDead()) {
                        try {
                            frame.getHighscoreManager().addScore(model.getScore());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        frame.getControlPanel().getHighscoreField().setText(frame.getHighscoreManager().toString());
                        model.setGameOver(true);
	                    model.setGameActive(false);
	                }
	                int points = apple.appleEaten(snake.getSnakeHeadLocation(), frame.getControlPanel().getDifficulty());
	                if (points > 0) {
	                    model.addScore(points);
	                    setScoreText();
	                    
	                    apple.setLocation(snake.getRandomNonSnakeLocation());
	                    snake.addSnakeTail();
	                }
	                repaint();
	            }
                else {
                    frame.getControlPanel().getDifficulty().setEnabled(true);
                    frame.getControlPanel().getBorder().setEnabled(true);
                }
	 
	            long elapsedTime = System.currentTimeMillis() - startTime;
	            long sleepTime = Math
	                    .max((model.getSleepTime() - elapsedTime), 10L);
	            sleep(sleepTime);
	        }
	 
	    }
	 
	    private void sleep(long sleepTime) {
	        try {
	            Thread.sleep(sleepTime);
	        } catch (InterruptedException e) {
	 
	        }
	    }
	 
	    private void setScoreText() {
	        SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    frame.setScoreText();
                    ;
                }
            });
	    }
	 
	    private void repaint() {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                frame.repaintGridPanel();
	            }
	        });
	    }
	 
	    public synchronized void setRunning(boolean running) {
	        this.running = running;
	    }

}

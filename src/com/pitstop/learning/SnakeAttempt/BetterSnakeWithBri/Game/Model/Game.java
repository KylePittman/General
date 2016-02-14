package com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game.Model;

import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.text.NumberFormat;

import javax.imageio.ImageIO;

public class Game {

	private static final int SQUARE_WIDTH = 32;
	private static final int CELL_WIDTH = 25;
	private static final int CELL_HEIGHT = 15;

	private boolean firstTimeSwitch;
	private boolean gameActive;
	private boolean gameOver;
    private boolean directionUpdated = false;

	private int score;

	private long sleepTime = 200;

	private Apple apple;

	private Image appleImage;

	private Snake snake;

	public Game() {
		this.score = 0;
		this.firstTimeSwitch = false;
		this.gameActive = false;
		this.gameOver = false;
		this.snake = new Snake();
		setAppleImage();
		this.apple = new Apple(appleImage, snake.getRandomNonSnakeLocation());
		
}

	public void init() {
		if (firstTimeSwitch) {
			snake.createSnake();
			apple.setPoints(1);
			setAppleLocation();
		} else {
			firstTimeSwitch = true;
		}
}

	public Snake getSnake() {
		return snake;
	}

public boolean isGameActive() {
	return gameActive;
}

public void setGameActive(boolean gameActive) {
	this.gameActive = gameActive;
}

public void setDirectionUpdated(boolean updated){
    this.directionUpdated = updated;
}

    public void setSleepTime(long sleepTime) {
        this.sleepTime = sleepTime;
    }

    public boolean isDirectionUpdated(){
    return directionUpdated;
}

public boolean isGameOver() {
	return gameOver;
}
	public void setGameOver(boolean gameOver) {
	this.gameOver = gameOver;
	if (gameOver) {
		setGameActive(false);
		}
}

public String getFormattedScore() {
	NumberFormat nf = NumberFormat.getInstance();
	return nf.format(score);
}

public int getScore() {
	return score;
}

public void addScore(int score) {
	this.score += score;
}

public void setScore(int score) {
	this.score = score;
}

public long getSleepTime() {
	return sleepTime;
}

private void setAppleImage() {
	this.appleImage = null;
	try {
		this.appleImage = ImageIO.read(getClass().getResource("apple-icon.png"));
	} catch (IOException e) {
		e.printStackTrace();
	}
}

public Image getAppleImage() {	
	return appleImage;
}
public Apple getApple() {
	return apple;
}
public void setApple(Apple apple) {	
	this.apple = apple;
}

public void setAppleLocation() {
	this.apple.setLocation(snake.getRandomNonSnakeLocation());
}

public Dimension getPreferredSize() {
	int width  = SQUARE_WIDTH * CELL_WIDTH + 5;
	int height  = SQUARE_WIDTH * CELL_HEIGHT + 5;
	return new Dimension(width, height);
}

public static int getSquareWidth() {
	return SQUARE_WIDTH;
}

public static int getCellWidth() {
	return CELL_WIDTH;
}

public static int getCellHeight() {
	return CELL_HEIGHT;
	}

}
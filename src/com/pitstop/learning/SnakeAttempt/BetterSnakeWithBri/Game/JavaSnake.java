package com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game;

import com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game.Model.Game;
import com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game.View.SnakeGameFrame;

import javax.swing.SwingUtilities;
import java.io.File;


public class JavaSnake implements Runnable{
    private String path = "C:\\Java Workspace\\General\\src\\com\\pitstop\\learning\\SnakeAttempt\\BetterSnakeWithBri\\Game\\Stats\\highscores";
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new JavaSnake());
	}

	@Override
	public void run() {
		new SnakeGameFrame(new Game(), new File(path));
	}
}



package com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game.Model;

import com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game.View.SnakeGameFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.SwingUtilities;
 


public class StartButtonActionListener implements ActionListener{

	private SnakeGameFrame frame;
	 
    private Game model;
 
    public StartButtonActionListener(SnakeGameFrame frame, Game model) {
        this.frame = frame;
        this.model = model;
    }
 
    public void actionPerformed(ActionEvent event) {
        new Thread(new WaitToStartRunnable(frame, model)).start();
    }
 
    private class WaitToStartRunnable implements Runnable {
 
        private long sleepAmount = 100;
 
        private SnakeGameFrame frame;
 
        private Game model;
 
        public WaitToStartRunnable(SnakeGameFrame frame, Game model) {
            this.frame = frame;
            this.model = model;
        }
 
        public void run() {
            model.setGameOver(false);            
            model.setGameActive(false);
            int dif = (frame.getControlPanel().getDifficulty().getSelectedItem().equals("Easy") ? 3 : frame.getControlPanel().getDifficulty().getSelectedItem().equals("Medium") ? 2 : 1);
            model.setScore(0);
            boolean borderless = frame.getControlPanel().getBorder().getSelectedItem().equals("Borderless");
            model.getSnake().setBorderless(borderless);
            model.setSleepTime(100 * dif/2);
            model.init();
            repaint();
            sleep();
            model.setGameActive(true);
        }
 
        public void repaint() {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    frame.setScoreText();
                    frame.repaintGridPanel();
                }
            });
        }
 
        public void sleep() {
            try {
                Thread.sleep(sleepAmount);
            } catch (InterruptedException e) {
                assert false;
            }
        }
 
    }
 
}

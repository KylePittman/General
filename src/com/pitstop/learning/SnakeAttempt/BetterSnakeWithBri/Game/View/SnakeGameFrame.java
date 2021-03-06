package com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game.View;

import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.text.NumberFormat;
 
import javax.swing.BoxLayout;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


import com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game.Model.*;
import com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game.Stats.HighscoreManager;

public class SnakeGameFrame {
	

    private static final NumberFormat NF = NumberFormat.getInstance();
 
    private ControlPanel controlPanel;

    private GameRunnable gameRunnable;
 
    private GridPanel gridPanel;
 
    private JFrame frame;
 
    private Game model;

    private HighscoreManager highscoreManager;
 
    public SnakeGameFrame(Game model, File highscores) {
        highscoreManager = new HighscoreManager(highscores);
        this.model = model;
        createPartControl();
    }


    private void createPartControl() {
        frame = new JFrame();
        frame.setTitle("Retro Snake Game");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent event) {
                exitProcedure();
            }
        });
 
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.LINE_AXIS));
 
        gridPanel = new GridPanel(model);
        mainPanel.add(gridPanel);
 
        controlPanel = new ControlPanel(this, model);
        mainPanel.add(controlPanel.getPanel());
 
        frame.add(mainPanel);
        frame.pack();
 
        setKeyBindings(gridPanel);
 
        frame.setLocationByPlatform(true);
        frame.getRootPane().setDefaultButton(controlPanel.getStartButton());
        frame.setVisible(true);
 
        gameRunnable = new GameRunnable(this, model);
        new Thread(gameRunnable).start();
    }
 
    private void setKeyBindings(JPanel gridPanel) {
        InputMap inputMap = gridPanel
                .getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke("W"), "up arrow");
        inputMap.put(KeyStroke.getKeyStroke("S"), "down arrow");
        inputMap.put(KeyStroke.getKeyStroke("A"), "left arrow");
        inputMap.put(KeyStroke.getKeyStroke("D"), "right arrow");
 
        inputMap.put(KeyStroke.getKeyStroke("UP"), "up arrow");
        inputMap.put(KeyStroke.getKeyStroke("DOWN"), "down arrow");
        inputMap.put(KeyStroke.getKeyStroke("LEFT"), "left arrow");
        inputMap.put(KeyStroke.getKeyStroke("RIGHT"), "right arrow");
 
        inputMap = gridPanel.getInputMap(JPanel.WHEN_FOCUSED);
        inputMap.put(KeyStroke.getKeyStroke("UP"), "up arrow");
        inputMap.put(KeyStroke.getKeyStroke("DOWN"), "down arrow");
        inputMap.put(KeyStroke.getKeyStroke("LEFT"), "left arrow");
        inputMap.put(KeyStroke.getKeyStroke("RIGHT"), "right arrow");
 
        gridPanel.getActionMap().put("up arrow",
                new ArrowAction(model, new Point(0, -1)));
        gridPanel.getActionMap().put("down arrow",
                new ArrowAction(model, new Point(0, 1)));
        gridPanel.getActionMap().put("left arrow",
                new ArrowAction(model, new Point(-1, 0)));
        gridPanel.getActionMap().put("right arrow",
                new ArrowAction(model, new Point(1, 0)));
    }
 
    private void exitProcedure() {
        gameRunnable.setRunning(false);
        frame.dispose();
        System.exit(0);
    }
 
    public void repaintGridPanel() {
        gridPanel.repaint();
    }
 
    public void setScoreText() {
        controlPanel.setScoreText(NF.format(model.getScore()));
    }
 
    public void setPauseButton() {
        controlPanel.setPauseButton(model.isGameActive());
    }

    public ControlPanel getControlPanel(){
        return controlPanel;
    }

    public HighscoreManager getHighscoreManager() {
        return highscoreManager;
    }
}

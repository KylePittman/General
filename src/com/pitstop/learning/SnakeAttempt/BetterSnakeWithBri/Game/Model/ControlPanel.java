package com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game.Model;

import com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game.View.SnakeGameFrame;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;


public class ControlPanel {
	
	 private static final Insets normalInsets = new Insets(10, 10, 0, 10);
	 
	    private JButton startButton;

        private JComboBox<String> difficulty;

        private JComboBox<String> border;

        private JPanel panel;
	 
	    private JTextField scoreField;

        private JTextField highscoreField;
	 
	    private JToggleButton pauseButton;
	 
	    private SnakeGameFrame frame;
	 
	    private Game model;
	 
	    public ControlPanel(SnakeGameFrame frame, Game model) {
	        this.frame = frame;
	        this.model = model;
	        createPartControl();
	    }
	 
	    private void createPartControl() {
	        panel = new JPanel();
	 
	        JPanel innerPanel = new JPanel();
	        innerPanel.setLayout(new GridBagLayout());
	 
	        int gridy = 0;
	 
	        JLabel scoreLabel = new JLabel("Score");
	        Font labelFont = innerPanel.getFont().deriveFont(36.0F);
	        scoreLabel.setFont(labelFont);
	        scoreLabel.setHorizontalAlignment(JLabel.CENTER);
	        addComponent(innerPanel, scoreLabel, 0, gridy++, 1, 1, normalInsets,
	                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);
	 
	        scoreField = new JTextField(6);
	        scoreField.setEditable(false);
	        Font textFont = innerPanel.getFont().deriveFont(48.0F);
	        scoreField.setFont(textFont);
	        scoreField.setHorizontalAlignment(JTextField.CENTER);
	        scoreField.setText(model.getFormattedScore());
	        addComponent(innerPanel, scoreField, 0, gridy++, 1, 1, normalInsets,
	                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);

            difficulty = new JComboBox<String>();
            difficulty.addItem("Easy");
            difficulty.addItem("Medium");
            difficulty.addItem("Hard");
            addComponent(innerPanel, difficulty, 0, gridy++, 1, 1, normalInsets,
                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);

            border = new JComboBox<String>();
            border.addItem("Bordered");
            border.addItem("Borderless");
            addComponent(innerPanel, border, 0, gridy++, 1, 1, normalInsets,
                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);

	        startButton = new JButton("Start Game");
	        startButton.addActionListener(new StartButtonActionListener(frame,
	                model));
	        addComponent(innerPanel, startButton, 0, gridy++, 1, 1, normalInsets,
	                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);
	 
	        pauseButton = new JToggleButton("Pause Game");
	        pauseButton.addActionListener(new PauseButtonActionListener(model));
	        addComponent(innerPanel, pauseButton, 0, gridy++, 1, 1, normalInsets,
	                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);

            highscoreField = new JTextField(6);
            highscoreField.setEditable(false);
            textFont = innerPanel.getFont().deriveFont(12.0F);
            highscoreField.setFont(textFont);
            highscoreField.setHorizontalAlignment(JTextField.CENTER);
            highscoreField.setText(frame.getHighscoreManager().toString());
            addComponent(innerPanel, highscoreField, 0, gridy++, 1, 1, normalInsets,
                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);
	 
	        panel.add(innerPanel);
	    }
	 
	    private void addComponent(Container container, Component component,
	            int gridx, int gridy, int gridwidth, int gridheight, Insets insets,
	            int anchor, int fill) {
	        GridBagConstraints gbc = new GridBagConstraints(gridx, gridy,
	                gridwidth, gridheight, 1.0D, 1.0D, anchor, fill, insets, 0, 0);
	        container.add(component, gbc);
	    }
	 
	    public JToggleButton getPauseButton() {
	        return pauseButton;
	    }
	 
	    public void setPauseButton(boolean selected) {
	        this.pauseButton.setSelected(selected);
	    }
	 
	    public JButton getStartButton() {
	        return startButton;
	    }
	 
	    public JPanel getPanel() {
	        return panel;
	    }

    public JComboBox<String> getDifficulty() {
        return difficulty;
    }

    public JComboBox<String> getBorder() {
        return border;
    }

    public void setScoreText(String scoreText) {
	        this.scoreField.setText(scoreText);
	    }

    public JTextField getHighscoreField() {
        return highscoreField;
    }
}

package com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game.Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JToggleButton;

public class PauseButtonActionListener implements ActionListener {
	 
private Game model;

public PauseButtonActionListener(Game model) {
    this.model = model;
}

@Override
public void actionPerformed(ActionEvent event) {
    JToggleButton button = (JToggleButton) event.getSource();
    if (button.isSelected()) {
        model.setGameActive(false);
    } else {
        model.setGameActive(true);
    }
}

}

//Kyle Pittman 5/29/2015.
package com.pitstop.Games2D.CommonResources.KeyListeners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class NumberListener extends KeyAdapter {

    private int lastNumberPressed;
    private boolean change = false;

    public NumberListener(){
        super();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key >= 48 && key <= 57) {
            lastNumberPressed = key - 48;
            change = true;
        }
    }

    public void setLastNumberPressed(int lastNumberPressed) {
        this.lastNumberPressed = lastNumberPressed;
    }

    public int getLastNumberPressed() {
        return lastNumberPressed;
    }

    public boolean isChange() {
        return change;
    }

    public void setChange(boolean change) {
        this.change = change;
    }
}
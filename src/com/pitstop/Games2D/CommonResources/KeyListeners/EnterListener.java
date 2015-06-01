//Kyle Pittman 5/29/2015.
package com.pitstop.Games2D.CommonResources.KeyListeners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EnterListener extends KeyAdapter {

    private boolean pressed = false;

    public EnterListener(){
        super();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key= e.getKeyCode();

        if (key == KeyEvent.VK_ENTER){
            pressed = true;
        }
    }

    public boolean isPressed() {
        return pressed;
    }

    public void setPressed(boolean pressed) {
        this.pressed = pressed;
    }
}

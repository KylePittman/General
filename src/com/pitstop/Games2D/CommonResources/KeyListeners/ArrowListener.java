//Kyle Pittman 5/28/2015.
package com.pitstop.Games2D.CommonResources.KeyListeners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ArrowListener extends KeyAdapter {
    private int direction = 0;
    private boolean change = false;
    private boolean restricted = true;

    public ArrowListener(){
        super();
    }

    public ArrowListener(boolean restricted){
        super();
        this.restricted = restricted;
    }

    @Override
    public void keyPressed(KeyEvent e){

        int key = e.getKeyCode();
        if(!change) {
            if ((key == KeyEvent.VK_LEFT) && (!restricted || restricted && direction != 1)) {
                direction = 3;
                change = true;
            }
            if ((key == KeyEvent.VK_RIGHT) && (!restricted || restricted && direction != 3)) {
                direction = 1;
                change = true;
            }
            if ((key == KeyEvent.VK_DOWN) && (!restricted || restricted && direction != 0)) {
                direction = 2;
                change = true;
            }
            if ((key == KeyEvent.VK_UP) && (!restricted || restricted && direction != 2)) {
                direction = 0;
                change = true;
            }
        }
    }

    public int getDirection() {
        return direction;
    }

    public boolean isChange() {
        return change;
    }

    public void setChange(boolean change) {
        this.change = change;
    }
}

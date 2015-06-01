//Kyle Pittman 4/10/2015.
package com.pitstop.Games2D.SnakeV2.Graphics;

import com.pitstop.Games2D.SnakeV2.Entities.BodyPart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Screen extends JPanel implements Runnable, ActionListener{

    private static int WIDTH, HEIGHT, DELAY;
    private int dir;

    private Thread thread;

    private boolean running = false;
    private boolean change = false;

    private Timer timer;

    private Image body = new ImageIcon("C:\\Java Workspace\\General\\src\\com\\pitstop\\Games\\SnakeV2\\Entities\\body.png").getImage();
    private Image head = new ImageIcon("C:\\Java Workspace\\General\\src\\com\\pitstop\\Games\\SnakeV2\\Entities\\head.png").getImage();
    private Image appleImg = new ImageIcon("C:\\Java Workspace\\General\\src\\com\\pitstop\\Games\\SnakeV2\\Entities\\apple.png").getImage();

    private BodyPart apple;
    private ArrayList<BodyPart> snake;

    private static final int xCoord = 10, yCoord = 10, APPLESTARTX = 20, APPLESTARTY = 20;

    public Screen(int width, int height, int delay){
        WIDTH = width;
        HEIGHT = height;
        DELAY = delay;
        /**
         * Used for arrow key controls
         * setFocusable is important
         * won't work unless set true
         */
        addKeyListener(new TAdapter());
        setFocusable(true);

        setBackground(Color.black);

        setPreferredSize(new Dimension(WIDTH,HEIGHT));

        snake = new ArrayList<BodyPart>();
        start();
    }

    public void start(){
        running = true;
        thread = new Thread(this, "Game Thread");
        thread.start();
        timer = new Timer(DELAY, this);
        timer.start();
        dir = 1;
        apple = new BodyPart(APPLESTARTX, APPLESTARTY, appleImg);
        snake.add(new BodyPart(xCoord, yCoord,head));
        snake.add(new BodyPart(xCoord - 10, yCoord, body));
        snake.add(new BodyPart(xCoord - 20, yCoord, body));
    }

    public void stop(){
        while(snake.size() > 0){
            snake.remove(0);
        }

        timer.stop();
    }

    private void gameOver(Graphics g){

        String message = "Game Over";
        Font small = new Font("Helvetica", Font.BOLD, 14);
        FontMetrics metr = getFontMetrics(small);

        g.setColor(Color.white);
        g.setFont(small);
        g.drawString(message, (WIDTH - metr.stringWidth(message)) / 2, HEIGHT/ 2);
    }



    private void move(){
        if(snake.size() == 0) return;
        for(int i = snake.size()-1; i > 0; i--){
            snake.get(i).setxCoord(snake.get(i-1).getxCoord());
            snake.get(i).setyCoord(snake.get(i-1).getyCoord());
        }

        change = false;

        if(dir == 0){
            snake.get(0).setyCoord(snake.get(0).getyCoord() - 10);
        }

        if(dir == 1){
            snake.get(0).setxCoord(snake.get(0).getxCoord() + 10);
        }

        if(dir == 2){
            snake.get(0).setyCoord(snake.get(0).getyCoord() + 10);
        }

        if(dir == 3){
            snake.get(0).setxCoord(snake.get(0).getxCoord()-10);
        }
    }

    private void newApple(){
        int r = (int) (Math.random() * (WIDTH));
        r = r - r%10;
        apple.setxCoord(r);
        r = (int) (Math.random() * (HEIGHT));
        r = r - r%10;
        apple.setyCoord(r);
    }

    private void checkApple(){
        if(snake.size() == 0) return;
        if(apple.getxCoord() == snake.get(0).getxCoord() && apple.getyCoord() == snake.get(0).getyCoord()){
            snake.add(new BodyPart(body));
            newApple();
        }
    }

    private void checkCollision(){
        if(snake.size() == 0) return;
        for (int i = snake.size() - 1; i > 0; i--) {

            if((snake.get(0).getxCoord() == snake.get(i).getxCoord()) && (snake.get(0).getyCoord() == snake.get(i).getyCoord()))
                running = false;
        }

        if(snake.get(0).getyCoord() >= HEIGHT || snake.get(0).getyCoord() < 0 || snake.get(0).getxCoord() >= WIDTH || snake.get(0).getxCoord() < 0)
            running = false;
        if(!running) stop();
    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        if(running) {
            g.setColor(Color.white);
            for (int i = 0; i < WIDTH / 10; i++) g.drawLine(i * 10, 0, i * 10, HEIGHT);
            for (int i = 0; i < HEIGHT / 10; i++) g.drawLine(0, i * 10, WIDTH, i * 10);

            for (int i = 0; i < snake.size(); i++)
                g.drawImage(snake.get(i).getImg(), snake.get(i).getxCoord(), snake.get(i).getyCoord(), this);
            g.drawImage(appleImg, apple.getxCoord(), apple.getyCoord(), this);
        }
        else gameOver(g);
    }

    @Override
    public void run() {

        if(running) {
            checkApple();
            move();
            checkCollision();
        }
        else{
            stop();
        }
            repaint();
    }

    public int getScore(){
        return snake.size()-3;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
          run();
    }

    private class TAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e){
            int key = e.getKeyCode();
            if(!change) {
                if ((key == KeyEvent.VK_LEFT) && dir != 1) {
                    dir = 3;
                    change = true;
                }
                if ((key == KeyEvent.VK_RIGHT) && dir != 3) {
                    dir = 1;
                    change = true;
                }
                if ((key == KeyEvent.VK_DOWN) && dir != 0) {
                    dir = 2;
                    change = true;
                }
                if ((key == KeyEvent.VK_UP) && dir != 2) {
                    dir = 0;
                    change = true;
                }
            }
            if(!running && key == KeyEvent.VK_ENTER){
                start();
            }
        }
    }
}

//Kyle Pittman 1/23/2016.
package com.pitstop.learning.Frames.GUIExample;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class ImageBackground extends JPanel {

    private Point leftEye = new Point(130,150);
    private Point rightEye = new Point(225, 150);
    private Dimension eyeSize = new Dimension(50, 40);

    public static void main(String[] args) {
        JFrame frame = new JFrame("Image");
        ImageBackground background = new ImageBackground();
        frame.add(background);

        frame.setLayout(null);
        background.setBounds(-3, -3, 397, 397);

        frame.setPreferredSize(new Dimension(400, 400));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }

    private BufferedImage image;

    public ImageBackground() {
        URL resource = getClass().getResource("ME.jpg");
        try {
            image = ImageIO.read(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 3, 4, this);
        g.drawOval(leftEye.x, leftEye.y, (int) eyeSize.getWidth(), (int) eyeSize.getHeight());
        g.drawOval(rightEye.x, rightEye.y, (int) eyeSize.getWidth(),(int) eyeSize.getHeight());
        g.setColor(Color.WHITE);
        g.fillOval(leftEye.x, leftEye.y, (int) eyeSize.getWidth() - 1, (int) eyeSize.getHeight() - 1);
        g.fillOval(rightEye.x ,rightEye.y ,(int) eyeSize.getWidth() - 1,(int) eyeSize.getHeight() - 1);
    }
}

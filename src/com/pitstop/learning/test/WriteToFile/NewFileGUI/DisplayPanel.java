//Kyle Pittman 5/28/2015.
package com.pitstop.learning.test.WriteToFile.NewFileGUI;

import com.pitstop.learning.test.WriteToFile.ImageFile.ImageReader;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DisplayPanel extends JPanel{


    public static void writePhoto(BufferedImage image, File outputFile) throws IOException {
        try {
            ImageIO.write(image, "png", outputFile);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //final static String CLASS_PATH = "C:\\Java Workspace\\General\\src\\com\\pitstop\\learning\\test\\WriteToFile\\NewFileGUI\\";
    final static String CLASS_PATH = "C:\\TestFolder\\";
    public static void main(String[] args) {

        File imageFile = new File("C:\\Java Workspace\\General\\src\\com\\pitstop\\learning\\SnakeAttempt\\apple.png");
        final ImageReader imageReader = new ImageReader(imageFile);
        imageReader.getImage().setRGB(0,0, Color.WHITE.getRGB());

        JFrame frame = new JFrame();

        final JTextField textField = new JTextField();
        textField.setBounds(0, 0, 70, 20);

        String[] foods = {".jpg", ".png", ".gif"};
        final JComboBox<String> comboBox = new JComboBox<String>(foods);
        comboBox.setBounds(0,21,70,20);

        JButton button = new JButton("Print");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file = new File(CLASS_PATH + textField.getText() + comboBox.getSelectedItem());

                try {
                    writePhoto(imageReader.getImage(), file);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

                System.out.println(CLASS_PATH + textField.getText() + comboBox.getSelectedItem());
                System.out.println(textField.getText() + comboBox.getSelectedItem());
                textField.setText("");
            }
        });
        button.setBounds(0,41,70,20);

        frame.setLayout(null);
        frame.add(textField);
        frame.add(comboBox);
        frame.add(button);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(80,100));
        frame.setResizable(false);
        frame.setVisible(true);
        frame.pack();

    }
}

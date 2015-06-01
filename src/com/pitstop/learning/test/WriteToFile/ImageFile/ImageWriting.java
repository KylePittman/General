//Kyle Pittman 5/24/2015.
package com.pitstop.learning.test.WriteToFile.ImageFile;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ImageWriting {
    public static void writePhoto(BufferedImage image) throws IOException {
        try {
            File outputFile = new File("C:\\Java Workspace\\General\\src\\com\\pitstop\\learning\\test\\WriteToFile\\ImageFile\\apple.png");
            ImageIO.write(image, "png", outputFile);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {



        try{
            File imageFile = new File("C:\\Java Workspace\\General\\src\\com\\pitstop\\learning\\SnakeAttempt\\apple.png");
            ImageReader imageReader = new ImageReader(imageFile);
            imageReader.getImage().setRGB(0,0, Color.WHITE.getRGB());
            writePhoto(imageReader.getImage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

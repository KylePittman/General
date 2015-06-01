//Kyle Pittman 5/24/2015.
package com.pitstop.learning.test.WriteToFile.ImageFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageReader {
    private BufferedImage image;
    public ImageReader(File file){
        try{
            image = ImageIO.read(file);
        }catch (IOException e) {
            e.printStackTrace();
        } ;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(File file) {
        try{
            image = ImageIO.read(file);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

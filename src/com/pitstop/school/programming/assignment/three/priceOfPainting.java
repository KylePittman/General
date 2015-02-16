//Kyle Pittman 10/25/2014.
package com.pitstop.school.programming.assignment.three;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class priceOfPainting {
    public static void main(String[] args) throws IOException {
        String pathToFile = "C:\\Users\\Kyle\\IdeaProjects\\General\\src\\com\\pitstop\\school\\programming\\assignment\\three";
        File inFile = new File(pathToFile, "PaintData.txt");
        Scanner inData = new Scanner(inFile);
        paintaRoom[] room = new paintaRoom[6];
        for (int i = 0; i < 6; i++) {
            room[i] = new paintaRoom(inData.nextInt(), inData.nextInt(), inData.nextInt(), inData.nextInt(), inData.nextInt());
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("Height: " + room[i].getHeight() + " feet. Length: " + room[i].getLength() + " feet. Width: " + room[i].getWidth() + " feet. Doors: " + room[i].getDoors() +  " doors. Windows: " + room[i].getWindows() + " windows.\nGallons: "+ room[i].getGallons() +" gallon(s). Quarts: " + room[i].getQuarts() + " quart(s). Price: $" + room[i].getPrice());
        }
    }
}

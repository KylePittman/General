//Kyle Pittman 1/30/2016.
package com.pitstop.learning.test.WriteToFile.HighScores;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HighScore {
    public static void main(String[] args) throws IOException {
        System.out.println(getScores().toString());
        addScore(75);
        System.out.println(getScores().toString());
    }

    /**
     * Adds a score to the list of high scores if it is high enough
     * @param score score to be added
     * @throws IOException
     */
    public static void addScore(int score) throws IOException {
        ArrayList scores = getScores();
        if (!scores.get(0).equals("---------")) {
            boolean scoreInserted = false;
            for (int i = 0; i < scores.size() && !scoreInserted; i++) {
                System.out.println(scores.get(i));
                if (scores.get(i).equals("---------") || score > Integer.parseInt((String) scores.get(i))) {
                    scores.add(i, score+"");
                    scores.remove(scores.size()-1);
                    scoreInserted = true;
                }
            }
        }
        else
            scores.set(0, score + "");

        try{
            File file = new File("C:\\Java Workspace\\General\\src\\com\\pitstop\\learning\\test\\WriteToFile\\HighScores\\HighScores.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < scores.size(); i++) {
                bufferedWriter.write(scores.get(i) + "\n");
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeScores(ArrayList scores){
        try{
            File file = new File("C:\\Java Workspace\\General\\src\\com\\pitstop\\learning\\test\\WriteToFile\\HighScores\\HighScores.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < scores.size(); i++) {
                bufferedWriter.write(scores.get(i) + "\n");
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return ArrayList of the top 10 scores
     *      if there are less than 10 scores
     *      the remaining spaces will be filled
     *      with "-------";
     */
    public static ArrayList getScores() throws IOException{
        ArrayList scores = new ArrayList();
        for (int i = 0; i < 10; i++) {
            scores.add("---------");
        }
        String fileToString;
        String input;
        fileToString = "HighScores.txt";
        String pathToFile = "C:\\Java Workspace\\General\\src\\com\\pitstop\\learning\\test\\WriteToFile\\HighScores\\";
        File inFile = new File(pathToFile, fileToString);
        Scanner inData = new Scanner(inFile);

        for (int i = 0; i < scores.size() && inData.hasNext(); i++) {
            input = inData.nextLine();
            if (input != "")
            scores.set(i, input);
        }

        return scores;
    }

}

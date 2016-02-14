//Kyle Pittman 1/31/2016.
package com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game.Stats;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HighscoreManager {
    private File highscores;
    

    public HighscoreManager(File highscores){
        this.highscores = highscores;
    }

    /**
     * Adds a score to the list of high scores if it is high enough
     * @param score score to be added
     * @throws java.io.IOException
     */
    public void addScore(int score) throws IOException {
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
            FileWriter fileWriter = new FileWriter(highscores);
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

    public void writeScores(ArrayList scores){
        try{
            FileWriter fileWriter = new FileWriter(highscores);
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
    public ArrayList getScores() throws IOException{
        ArrayList scores = new ArrayList();
        for (int i = 0; i < 10; i++) {
            scores.add("---------");
        }
        String input;
        Scanner inData = new Scanner(highscores);

        for (int i = 0; i < scores.size() && inData.hasNext(); i++) {
            input = inData.nextLine();
            if (input != "")
                scores.set(i, input);
        }

        return scores;
    }

    @Override
    public String toString() {
        ArrayList scores = new ArrayList();
        try {
            scores = getScores();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String toString = "";

        for (int i = 0; i < scores.size(); i++) {
            toString+= (scores.get(i) +"\n");
        }
        return toString;
    }
}

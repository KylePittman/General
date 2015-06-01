//Kyle Pittman 5/23/2015.
package com.pitstop.learning.test.WriteToFile.TextFile;

import java.io.*;

public class Writer {
    public static void main(String[] args) {
        try{
            String verify, putData;
            File file = new File("C:\\Java Workspace\\General\\src\\com\\pitstop\\learning\\test\\WriteToFile\\TextFile\\FileToWrite.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Dishes0\nSome text here");
            bufferedWriter.flush();
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((verify = bufferedReader.readLine()) != null) {
                if (verify != null) ;
                putData = verify.replaceAll("here", "there");
                bufferedWriter.write("\n" + putData);
            }

            bufferedWriter.flush();
            bufferedWriter.close();
            bufferedReader.close();


            } catch (IOException e) {
            e.printStackTrace();

        }
        File file = new File("C:\\Java Workspace\\General\\src\\com\\pitstop\\learning\\test\\WriteToFile\\TextFile\\FileToWrite.txt");
        EditFile editFile = new EditFile(file);
        editFile.replaceSelected("Dishes", "1");
    }
}

//Kyle Pittman 5/23/2015.
package com.pitstop.learning.test.WriteToFile.TextFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

public class EditFile {
    private File file;
    public EditFile(File file){
        this.file = file;
    }

    public void replaceSelected(String replaceWith, String type){
        try{
            // input the file content to the string
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            String input = "";

            while ((line = bufferedReader.readLine()) != null) input += line + '\n';

            bufferedReader.close();

            System.out.println(input); // check that it's inputted right

            // this if structure determines whether or not to replace "0" or "1"
            if (Integer.parseInt(type) == 0) {
                input = input.replace(replaceWith + "1", replaceWith + "0");
            }
            else if (Integer.parseInt(type) == 1) {
                input = input.replace(replaceWith + "0", replaceWith + "1");
            }

            // check if the new input is right
            System.out.println("----------------------------------"  + '\n' + input);

            // write the new String with the replaced line OVER the same file
            FileOutputStream fileOut = new FileOutputStream(file);
            fileOut.write(input.getBytes());
            fileOut.close();
        } catch(Exception e){
            System.out.println("Problem reading file");
        }
    }
}

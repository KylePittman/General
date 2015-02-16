//Kyle Pittman 12/18/2014.
package com.pitstop.school.lab.eight.four;

public class Sudoku

{
    private String[][] numbers;
    private final int SIZE = 9;
    public Sudoku(String s)
    {
        int k = 0;
        numbers = new String[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                numbers[i][j] = s.substring(k ,k + 1);
                k++;
            }
        }
    }
    public String toString()
    {
        String temp = "";
        for (int i = 0; i < SIZE; i++)
        {
            if ((i == 3) || (i == 6))
            {
                temp = temp + "=================\n";
            }
            for (int j = 0; j < SIZE; j++)
            {
                if ((j == 3) || (j == 6))
                {
                    temp = temp + " || ";
                }
                temp = temp + numbers[i][j];
            }
            temp = temp + "\n";
        }
        return temp;
    }

    public boolean colsAreLatin(){
        boolean isLatin = true;
        boolean[] latin = {false, false, false, false, false, false, false, false, false};

        for (int i = 0; i < numbers.length && isLatin; i++) {
            for (int j = 0; j < numbers.length && isLatin; j++) {
                if (latin[Integer.parseInt(numbers[j][i])-1]){ //checks if the number is already in column
                    isLatin = false;
                }
                else{
                    latin[Integer.parseInt(numbers[j][i])-1] = true;
                }
            }
            for (int h = 0; h < latin.length; h++) {
                latin[h] = false;
            }
        }
        return isLatin;
    }
    public boolean rowsAreLatin(){
        boolean isLatin = true;
        boolean[] latin = {false, false, false, false, false, false, false, false, false};

        for (int i = 0; i < numbers.length && isLatin; i++) {
            for (int j = 0; j < numbers.length && isLatin; j++) {
                if (latin[Integer.parseInt(numbers[i][j])-1]){ //checks if number is already in row
                    isLatin = false;
                }
                else{
                    latin[Integer.parseInt(numbers[i][j])-1] = true;
                }
            }
            for (int h = 0; h < latin.length; h++) {
                latin[h] = false;
            }
        }
        return isLatin;
    }
    public boolean boxsAreLatin(){
        boolean isLatin = true;
        boolean[] latin = {false, false, false, false, false, false, false, false, false};

        for (int i = 0; i < 9 && isLatin; i+=3) {   //finds box starting column
            for (int j = 0; j < 9 && isLatin; j+=3) {   //finds box starting row
                for (int k = 0; k < 3 && isLatin; k++) {    //selects column to begin searching on
                    for (int l = 0; l < 3 && isLatin; l++) {    //searches through row
                        if (latin[Integer.parseInt(numbers[i+k][j+l])-1]){
                            isLatin = false;
                        }
                        else{
                            latin[Integer.parseInt(numbers[i+k][j+l])-1] = true;
                        }
                    }
                }
                for (int h = 0; h < latin.length; h++) {
                    latin[h] = false;
                }
            }
        }

        return isLatin;
    }






    public boolean isValidSudoku()
    {

        return (this.boxsAreLatin() && this.colsAreLatin() && this.rowsAreLatin()); // This needs to be changed!
    }
}
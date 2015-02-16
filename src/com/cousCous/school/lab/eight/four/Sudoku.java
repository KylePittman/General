//Marcus Silcox 12/18/14
package com.cousCous.school.lab.eight.four;

public class Sudoku

{
    private String[][] numbers = new String[9][9];
    public Sudoku(String s)
    {
        int x = 0;
        for (int i = 0; i < numbers[0].length; i++)
        {
            for (int j = 0; j < numbers[0].length; j++)
            {
                numbers[i][j] = s.substring(x ,x + 1);
                x++;
            }
        }
    }
    public String toString()
    {
        String board = "";
        for (int i = 0; i < numbers[0].length; i++)
        {
            if ((i == 3) || (i == 6))
            {
                board = board + "=================\n";
            }
            for (int j = 0; j < numbers[0].length; j++)
            {
                if ((j == 3) || (j == 6))
                {
                    board = board + " || ";
                }
                board = board + numbers[i][j];
            }
            board = board + "\n";
        }
        return board;
    }

    public boolean checkColumn(){
        boolean isit = true;
        boolean[] check = new boolean[9];
        for (int i = 0; i < 8; i++)
        {
            check[i]=false;
        }
        for (int i = 0; i < numbers.length && isit; i++) {
            for (int j = 0; j < numbers.length && isit; j++) {
                if (check[Integer.parseInt(numbers[j][i])-1]){
                    isit = false;
                }
                else{
                    check[Integer.parseInt(numbers[j][i])-1] = true;
                }
            }
            for (int h = 0; h < check.length; h++) {
                check[h] = false;
            }
        }
        return isit;
    }
    public boolean checkRow(){
        boolean isit = true;
        boolean[] check = new boolean[9];
        for (int i = 0; i < 8; i++)
        {
            check[i]=false;
        }
        for (int i = 0; i < numbers.length && isit; i++) {
            for (int j = 0; j < numbers.length && isit; j++) {
                if (check[Integer.parseInt(numbers[i][j])-1]){
                    isit = false;
                }
                else{
                    check[Integer.parseInt(numbers[i][j])-1] = true;
                }
            }
            for (int h = 0; h < check.length; h++) {
                check[h] = false;
            }
        }
        return isit;
    }
    public boolean checkBoxes(){
        boolean isit = true;
        boolean[] check = new boolean[9];
        for (int i = 0; i < 8; i++)
        {
            check[i]=false;
        }
        for (int i = 0; i < 9 && isit; i = i + 3) {   //goes to the boxes starting column
            for (int j = 0; j < 9 && isit; j = j + 3) {   //goes to the boxes starting row
                for (int k = 0; k < 3 && isit; k++) {    //goes to the column to search
                    for (int l = 0; l < 3 && isit; l++) {    //searches through row
                        if (check[Integer.parseInt(numbers[i+k][j+l])-1]){
                            isit = false;
                        }
                        else{
                            check[Integer.parseInt(numbers[i+k][j+l])-1] = true;
                        }
                    }
                }
                for (int h = 0; h < check.length; h++) {
                    check[h] = false;
                }
            }
        }

        return isit;
    }






    public boolean isValidSudoku()
    {

        return (this.checkColumn() && this.checkRow() && this.checkBoxes());
    }
}
//Kyle Pittman 12/18/2014.
package com.pitstop.school.lab.eight.four;

public class SudokuRunner
{



    public static void main(String[] args)
    {
// Row and column Latin but with invalid subsquares
        String config1 = "123456789234567891345678912456789123567891234678912345789123456891234567912345678";
                Sudoku puzzle1 = new Sudoku(config1);
// Row Latin but column not Latin and with invalid subsquares
        String config2 = "123456789123456789123456789123456789123456789123456789123456789123456789123456789";
                Sudoku puzzle2 = new Sudoku(config2);
// A valid sudoku
        String config3 = "258137649146985327793246851472863195581492736639571482315728964824619573967354218";
                Sudoku puzzle3 = new Sudoku(config3);
        System.out.println(puzzle1);
        System.out.println("­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­");
                System.out.println(puzzle2);
        System.out.println("­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­");
                System.out.println(puzzle3);
        System.out.println("Puzzle 1 is valid: " + puzzle1.isValidSudoku());
        System.out.println("Puzzle 2 is valid: " + puzzle2.isValidSudoku());
        System.out.println("Puzzle 3 is valid: " + puzzle3.isValidSudoku());
        }
}
//Marcus Silcox 12/18/14
package com.cousCous.school.lab.eight.four;

/**
   A 3 x 3 tic-tac-toe board.
*/
public class TicTacToe
{
   private String[][] board;

   /**
      Constructs an empty board.
   */
   public TicTacToe()
   {
      board = new String[3][3];
      for (int i = 0; i < board[0].length; i++)
         for (int j = 0; j < board[0].length; j++)
            board[i][j] = " ";
   }

   /**
      Sets a field in the board. The field must be unoccupied.
      @param i the row index 
      @param j the column index 
      @param player the player ("x" or "o")
   */
   public void set(int i, int j, String player)
   {
      if (board[i][j].equals(" "))
         board[i][j] = player;
   }

   public void verticalFlip(){
       String [][] copy = new String[3][3];
       for (int i = 0; i < board.length; i++) {
           copy[0][i] = board[2][i];
           copy[1][i] = board[1][i];
           copy[2][i] = board[0][i];
       }
       for (int i = 0; i < board.length; i++) {
           board[0][i] = copy[0][i];
           board[1][i] = copy[1][i];
           board[2][i] = copy[2][i];
       }
   }

    public void horizontalFlip(){
        String [][] copy = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            copy[i][0] = board[i][2];
            copy[i][1] = board[i][1];
            copy[i][2] = board[i][0];
        }
        for (int i = 0; i < board.length; i++) {
            board[i][0] = copy[i][0];
            board[i][1] = copy[i][1];
            board[i][2] = copy[i][2];
        }
    }

   /**
      Creates a string representation of the board, such as
      |x  o|
      |  x |
      |   o|
      @return the string representation
   */
   public String toString()
   {
      String r = "";
      for (int i = 0; i < board[0].length; i++)
      {
         r = r + "|";
         for (int j = 0; j < board[0].length; j++)
            r = r + board[i][j];
         r = r + "|\n";
      }
      return r;
   }
}

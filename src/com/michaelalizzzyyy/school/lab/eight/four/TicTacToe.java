package com.michaelalizzzyyy.school.lab.eight.four;

public class TicTacToe
{
    private String[][] board;
    private String[][] saveone = new String[3][3];
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;
    private static String save;

    public TicTacToe()
    {
        board = new String[ROWS][COLUMNS];

        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLUMNS; j++)
                board[i][j] = " ";
    }

    public void set(int i, int j, String player)
    {
        if (board[i][j].equals(" "))
            board[i][j] = player;
    }

    public void flipHorizontal()
    {
        for (int k = 0; k < board.length; k++)
        {
            saveone[k][0] = board[k][0];
            saveone[k][2] = board[k][2];
        }

        for (int k = 0; k < board.length; k++)
        {
            board[k][2] = saveone[k][0];
            board[k][0] = saveone[k][2];
        }
    }

    public void flipVertical()
    {
        for (int k = 0; k < board.length; k++)
        {
            saveone[0][k] = board[0][k];
            saveone[2][k] = board[2][k];
        }

        for (int k = 0; k < board.length; k++)
        {
            board[2][k] = saveone[0][k];
            board[0][k] = saveone[2][k];
        }
    }

    public String toString()
    {
        String r = "";
        for (int i = 0; i < ROWS; i++)
        {
            r = r + "|";
            for (int j = 0; j < COLUMNS; j++)
                r = r + board[i][j];
            r = r + "|\n";
        }
        return r;
    }
}
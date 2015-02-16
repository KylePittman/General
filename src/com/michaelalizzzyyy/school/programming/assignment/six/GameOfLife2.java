package com.michaelalizzzyyy.school.programming.assignment.six;//Michaela Dinman
import java.util.Random;
/*
 * 1. The game is played on an unbounded matrix or rectangular grid. For this program you will 

limit your grid.

2. Every location is either empty or contains a live cell.

3. A cell can have up to eight neighbors, vertically, horizontally or diagonally.

4. The cells reproduce or die at each generation of the grid. 

5. If an empty cell location is surrounded by exactly three live neighbors, a new cell is born to 

that location at the next generation.

6. If a live cell has zero or one neighbor it will die of loneliness at the next generation.

7. If a live cell has two or three neighbors it will survive to the next generation.

8. If a live cell has four or more neighbors it will die of overcrowding at the next generation. 

9. All births and deaths take place simultaneously when the next generation is produced.
 */
public class GameOfLife2 
{
	private String[][] game;
	private String[][] copy;
	private int cellCount = 0;
	private String cell;
	private int count;
	private int Rows;
	private int Cols;

	public GameOfLife2(int rows, int columns)
	{
		game = new String[rows + 2][columns + 2];
		copy = new String[rows + 2][columns + 2];
		Rows = rows;
		Cols = columns;
		
		for (int c = 0; c < game.length; c++)
		{
			for (int f = 0; f < game.length; f++)
			{
				game[c][f] = ".";
				copy[c][f] = ".";
			}
		}
	}
	
	public void NextGen()
	{
		for (int x = 1; x < game.length - 1; x++)
		{
			for (int y = 1; y < game.length - 1; y++)
			{
				count = this.CheckCells(x, y);
				if (count == 3) System.out.println(x + " " + y);
				if (game[x][y].equals("*"))
				{
					if (count == 3 || count == 2) copy[x][y] = "*";
					else copy[x][y] = ".";
				}
				
				if (game[x][y].equals("."))
				{
					if (count == 3) copy[x][y] = "*";
					else copy[x][y] = ".";
				}
			}
		}
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game.length; j++) {
                game[i][j] = copy[i][j];
            }
        }

	}
	
	private int CheckCells(int x, int y)
	{
		count = 0;
			if (game[x - 1][y - 1].equals("*")) count++;
			if (game[x - 1][y].equals("*"))	count++;
			if (game[x - 1][y + 1].equals("*")) count++;
			if (game[x][y - 1].equals("*")) count++;
			if (game[x][y + 1].equals("*")) count++;
			if (game[x + 1][y - 1].equals("*")) count++;
			if (game[x + 1][y].equals("*")) count++;
			if (game[x + 1][y + 1].equals("*")) count++;
			
			if(x > 3 && x < 7 && y >5){
				 System.out.println("X: " + x + " Y: " + y + "State: " + game[x][y]);
				 System.out.println(game[x - 1][y - 1] + "\nX: " + (x-1) + " Y: " + (y-1));
				 System.out.println(game[x - 1][y] + "\nX: " + (x-1) + " Y: " + (y));
				 System.out.println(game[x - 1][y + 1] + "\nX: " + (x-1) + " Y: " + (y+1));
				 System.out.println(game[x][y - 1] + "\nX: " + (x) + " Y: " + (y-1));
				 System.out.println(game[x][y + 1] + "\nX: " + (x) + " Y: " + (y+1));
				 System.out.println(game[x + 1][y - 1] + "\nX: " + (x+1) + " Y: " + (y-1));
				 System.out.println(game[x + 1][y] + "\nX: " + (x+1) + " Y: " + (y));
				 System.out.println(game[x + 1][y + 1] + "\nX: " + (x+1) + " Y: " + (y+1));
				 System.out.println(count +"\n\n");
			}
			
		return count;
	}
	
	public String getPoint(int x, int y)
	{
		String star = game[x][y];
		return "X: " + x + "Y: " + y + ": " + star;
	}
	
	public void randomBuild()
	{
		Random ran = new Random();
		
		for (int c = 1; c < game.length - 1; c++)
		{
			for (int f = 1; f < game.length - 1; f++)
			{
				int chara = ran.nextInt(10 + 1);
				if (chara == 1 || chara == 2 || chara == 3)
				{
					game[c][f] = "*";
					copy[c][f] = "*";
				}
				else
				{
					game[c][f] = ".";
					copy[c][f] = ".";
				}
			}
		}
		System.out.println(this.toString());
	}

	public void fileInput()
	{
		
	}

	public void initialGrid()
	{
		int r = Rows / 3;
		int c = Cols / 3;
		for (int a = 0; a < Rows; a++)
		{
			for (int k = 0; k < Cols; k++)
			{
				game[a][k] = ".";
			}
		}
				game[r][c + 3] = game[r][c + 8] = "*";
				game[r + 1][c + 1] = game[r + 1][c + 2] = "*";
				game[r + 1][c + 9] = game[r + 1][c + 10] = "*";
				game[r + 1][c + 4] = game[r + 1][c + 5] = "*";
				game[r + 1][c + 6] = game[r + 1][c + 7] = "*";
				game[r + 2][c + 3] = game[r + 2][c + 8] = "*";
				
				System.out.println(this.toString());
	}
	
	public String toString()
	{
		String board = "";
		for (int y = 1; y < game.length - 1; y++)
		{
			for (int u = 1; u < game.length - 1; u++)
			{
				board = board + game[y][u];
			}
			board = board +"\n";
		}
		return board;
	}
}
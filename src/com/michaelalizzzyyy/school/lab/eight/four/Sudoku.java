package com.michaelalizzzyyy.school.lab.eight.four;

//Michaela Dinman
public class Sudoku 
{
	private String[][] game;
	private boolean[] bool = new boolean[10];
	private final int SIZE = 9;

	public Sudoku(String s)
	{
		int k = 0;
		game = new String[SIZE][SIZE];
		for (int i = 0; i < SIZE; i++)
		{
			for (int j = 0; j < SIZE; j++)
			{
				game[i][j] = s.substring(k, k + 1);
				k++;
			}
		}
	}
	
	public boolean checkRows()
	{
		bool[0] = true;
		
		for (int y = 1; y <= 9; y++)
		{
			bool[y] = false;
		}
		
		for (int row = 0; row <= 8; row++)
		{
			for (int num = 0; num <= 8; num++)
			{
				for (int boole = 1; boole <= 9; boole++)
				{
					if (Integer.parseInt(game[row][num]) == boole && bool[boole] == false)
						bool[boole] = true;
					else if (Integer.parseInt(game[row][num]) == boole && bool[boole] == true)
						return false;
				}
			}
			for (int y = 1; y <= 9; y++)
			{
				bool[y] = false;
			}
		}
		return true;
	}
	
	public boolean checkColumns()
	{
		bool[0] = true;
		
		for (int y = 1; y <= 9; y++)
		{
			bool[y] = false;
		}
		
		for (int row = 0; row <= 8; row++)
		{
			for (int num = 0; num <= 8; num++)
			{
				for (int boole = 1; boole <= 9; boole++)
				{
					if (Integer.parseInt(game[num][row]) == boole && bool[boole] == false)
						bool[boole] = true;
					else if (Integer.parseInt(game[num][row]) == boole && bool[boole] == true)
						return false;
				}
			}
			for (int y = 1; y <= 9; y++)
			{
				bool[y] = false;
			}
		}
		return true;
	}
	
	public boolean checkSquares()
	{
		bool[0] = true;
		
		for (int y = 1; y <= 9; y++)
		{
			bool[y] = false;
		}
        for (int i = 0; i < 9; i+=3)
        {
            for (int j = 0; j < 9; j += 3)
            {
                for (int b = 0; b <= 2; b = b + 3)
                {
                    for (int w = 0; w <= 2; w++)
                    {
                        for (int boole = 1; boole <= 9; boole++)
                        {
                            if (Integer.parseInt(game[b + j][w + i]) == boole && bool[boole] == false)
                                bool[boole] = true;
                            else if (Integer.parseInt(game[b + j][w + i]) == boole && bool[boole] == true)
                                return false;
                        }
                    }
                }
                for (int y = 1; y <= 9; y++)
                {
                    bool[y] = false;
                }
            }
		}
		return true;
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
				temp = temp + game[i][j];
			}
			temp = temp + "\n";
		}
		return temp;
	}
	
	public boolean isValidSudoku()
	{
		boolean valid = false;
		if (this.checkColumns() && this.checkRows() && this.checkSquares())
			valid = true;
		
		return valid;
	}
}
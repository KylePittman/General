//Marcus Silcox
package com.cousCous.school.lab.eight.three;

import java.util.ArrayList;

public class HundredDoorsRunner
{
	public static void main(String[] args)
	{
        ArrayList<HundredDoors> doors = new ArrayList<HundredDoors>();
		/*
		 * 1
		 * 4
		 * 9
		 * 16
		 * 25
		 * 36
		 * 49
		 * 64
		 * 81
		 * 100
		 */
		

		
		for (int r = 1; r < 101; r++)
		{
            doors.add(new HundredDoors("Open",r));
		}
		
		int n = 2; //up to 100
		//int m = 1; //multiplies n
		int f = 0; //variable
		
		while (n < 100)
		{
			f = n;// * m;
			while (f < 100)
			{
				if (doors.get(f).isOpen()) doors.get(f).setState("Closed");
				else if (doors.get(f).isClosed()) doors.get(f).setState("Open");
				f = f + n;
			}
			n++;
		}
		
		for (int y = 1; y < 100; y++)
		{
			System.out.println("Door Number " + doors.get(y).getNumber() + " is " + doors.get(y).getState());
		}
	}
}
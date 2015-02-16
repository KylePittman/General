//Kyle Pittman
package com.pitstop.school.lab.eight.three;

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

		for (int r = 0; r <= 100; r++)
		{
            doors.add(new HundredDoors("Open", r));
		}

        for(int i = 2; i <= 100; i++){
            for (int j = i; j <= 100; j+=i) {
                doors.get(j).changeState();
            }
        }

		for (int i = 0; i <= 100; i++)
		{
			System.out.println("Door Number " + doors.get(i).getNumber() + " is " + doors.get(i).getState());
		}
	}
}
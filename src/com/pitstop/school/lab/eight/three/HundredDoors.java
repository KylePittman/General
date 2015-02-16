//Kyle Pittman
package com.pitstop.school.lab.eight.three;

public class HundredDoors
{
	private boolean state;//True is closed, False is open
	private int doorNumber;
	
	public HundredDoors(String State, int Number)
	{
		state = false;
		doorNumber = Number;
	}
	
	public boolean isOpen()
	{
		return !state;
	}
	
	public boolean isClosed()
	{
		return state;
	}

    public void changeState(){
        state = !state;
    }

	public void setState(String newState)
	{
        if(newState.equalsIgnoreCase("open"))
		state = false;
        else if(newState.equalsIgnoreCase("closed"))
            state = true;
	}
	
	public int getNumber()
	{
		return doorNumber;
	}
    public String getState(){
        if(state) return "Closed";
        else return "Open";
    }
	
	public void OpenIt()
	{
		if (!state)
		{
			System.out.println("The door is already open.");
		}
		else
		{
			state = false;
		}
	}
	
	public void CloseIt()
	{
		if (!state)
		{
			state = true;
		}
		else 
		{
			System.out.println("The door is already closed.");
		}
	}
	
	public String toString()
	{
		return "Door number " + doorNumber + " is " + state + ".";
	}
}
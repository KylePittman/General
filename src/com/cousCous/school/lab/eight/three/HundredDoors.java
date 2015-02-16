//Marcus Silcox
package com.cousCous.school.lab.eight.three;

public class HundredDoors
{
	private String state;
	private int doorNumber;
	
	public HundredDoors(String State, int Number)
	{
		state = State;
		doorNumber = Number;
	}
	
	public boolean isOpen()
	{
		return state.equals("Open");
	}
	
	public boolean isClosed()
	{
		return state.equals("Closed");
	}
	
	public void setState(String newstate)
	{
		state = newstate;
	}
	
	public int getNumber()
	{
		return doorNumber;
	}
	
	public void OpenIt()
	{
		if (state.equals("open"))
		{
			System.out.println("The door is already open.");
		}
		else
		{
			state = "open";
		}
	}
	
	public void CloseIt()
	{
		if (state.equals("open"))
		{
			state = "closed";
		}
		else 
		{
			System.out.println("The door is already closed.");
		}
	}

    public String getState() {
        return state;
    }

    public String toString()
	{
		return "Door number " + doorNumber + " is " + state + ".";
	}
}
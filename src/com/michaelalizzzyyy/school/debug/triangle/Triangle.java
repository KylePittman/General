//Michaela Dinman
package com.michaelalizzzyyy.school.debug.triangle;
public class Triangle 
{
	private int SideOne;
	private int SideTwo;
	private int SideThree;
	//private boolean isScalene;
	//private boolean isRight;
	//private boolean isIsosceles;
	//private boolean isEquilateral;
	
	public Triangle()
	{
		SideOne = 1;
		SideTwo = 2;
		SideThree = 3;
	}
	
	public Triangle(int one, int two, int three)
	{
		SideOne = one;
		SideTwo = two;
		SideThree = three;
	}
	
	public boolean isEquilateral;
	{
        isEquilateral = false;
		if (SideOne == SideTwo && SideOne == SideThree)
		{
			isEquilateral = true;
		}
	}
	
	public boolean isScalene;
	{
        isScalene = false;
		if (SideOne != SideTwo && SideOne != SideThree)
		{
			isScalene = true;
		}
	}
	
	public boolean isIsosceles;
	{
        isIsosceles = false;
		if ((SideOne == SideTwo && SideOne != SideThree) || (SideOne == SideThree && SideOne != SideTwo) || (SideTwo == SideThree && SideOne != SideTwo))
		{
			isIsosceles = true;
		}
	}
	
	public boolean isRight;
	{
		if (SideOne > SideTwo && SideOne > SideThree && Math.pow(SideThree, 2) + Math.pow(SideTwo, 2) == Math.pow(SideOne, 2))
		{
			isRight = true;
		}
		if (SideTwo > SideOne && SideTwo > SideThree && Math.pow(SideThree, 2) + Math.pow(SideOne, 2) == Math.pow(SideTwo, 2))
		{
			isRight = true;
		}
		if (SideThree > SideTwo && SideThree > SideOne && Math.pow(SideOne, 2) + Math.pow(SideTwo, 2) == Math.pow(SideThree, 2))
		{
			isRight = true;
		}
	}
	
}

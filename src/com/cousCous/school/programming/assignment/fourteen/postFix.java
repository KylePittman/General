package com.cousCous.school.programming.assignment.fourteen;

import java.util.Stack;
//Marcus Silcox
public class postFix {
	private String equation;
	private Stack stack = new Stack();
	public postFix(String equ)
	{
		equation = equ;
	}
	public String makePostfix()
	{
		String workinWith = "";
		String toPrint = "";
		for(int i=0; i<equation.length(); i++)
		{
			workinWith = ""  + equation.charAt(i);
			if(workinWith.equals("1") ||
					workinWith.equals("2") || 
					workinWith.equals("3") || 
					workinWith.equals("4") ||
					workinWith.equals("5") ||
					workinWith.equals("6") ||
					workinWith.equals("7") ||
					workinWith.equals("8") ||
					workinWith.equals("9") ||
					workinWith.equals("0"))
			{
				toPrint += workinWith;
			}
			else if (workinWith.equals("("))
			{
				stack.push(workinWith);
			}
			else if (workinWith.equals(")"))
				{
					while(!stack.peek().equals("("))
					{
						toPrint += stack.pop();
					}
					stack.pop();
				}
			else
			{
				if(!shouldIPop(workinWith))
				{
					stack.push(workinWith);
				}
				else if (shouldIPop(workinWith))
				{
					while(!stack.isEmpty()) //while(shouldIPop(workinWith))
					{
						toPrint+=stack.pop();
					}
					stack.push(workinWith);
				}
			}
		}
		while(!stack.isEmpty())
		{
			toPrint += stack.pop();
		}
		return toPrint;
	}
	private boolean shouldIPop(String throwIn){
		int topStack=0;
		int putIn=0;
		if(stack.isEmpty())
		{
			return false;
		}
		//Assigns each operator on top of stack a numerical value
		if (stack.peek().equals("("))
		{	topStack = 0;	}
		if (stack.peek().equals("+") || stack.peek().equals("-"))
		{	topStack = 1;	}
		if (stack.peek().equals("*") || stack.peek().equals("/"))
		{	topStack = 2;	}
		if (stack.peek().equals("^"))
		{	topStack = 4;	}
		//Assigns each operator on diving board a numerical value
		if (throwIn.equals("("))
		{	putIn = 0;	}
		if (throwIn.equals("+") || stack.peek().equals("-"))
		{	putIn = 1;	}
		if (throwIn.equals("*") || stack.peek().equals("/"))
		{	putIn = 2;	}
		if (throwIn.equals("^"))
		{	putIn = 4;	}

		//returns if you should push or pop
		if(putIn < topStack) //if(putIn >= topStack)
		{return true;}
		else
			return false;
		
		
	}
	
	

}

//Michaela Dinman
package com.michaelalizzzyyy.school.programming.assignment.fourteen;

public class FinalNode
{
	private String value;
	private FinalNode left, right;
	
	public FinalNode()
	{
		value = null;
		right = null;
		left = null;
	}
	
	public FinalNode(String str)
	{
		value = str;
		right = null;
		left = null;
	}
	
	public void setRight(FinalNode r)
	{
		right = r;
	}
	
	public void setLeft(FinalNode l)
	{
		left = l;
	}
	
	public void setRight(String str)
	{
		right = new FinalNode(str);
	}
	
	public void setLeft(String str)
	{
		left = new FinalNode(str);
	}
	
	public FinalNode getLeft()
	{
		return left;
	}
	
	public FinalNode getRight()
	{
		return right;
	}
	
	public String getInfo()
	{
		return value;
	}
	
	public void setInfo(String str)
	{
		value = str;
	}
}
package com.michaelalizzzyyy.school.programming.assignment.thirteen;

//Michaela Dinman
public class TreeNode
{
	private Integer value;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(int val)
	{
		value = val;
		right = null;
		left = null;
	}
	
	public TreeNode getLeft()
	{
		return left;
	}
	
	public TreeNode getRight()
	{
		return right;
	}
	
	public Integer getInfo()
	{
		return value;
	}
	
	public void setRight(TreeNode neww)
	{
		right = neww;
	}
	
	public void setLeft(TreeNode neww)
	{
		left = neww;
	}
	
	public void setInfo(Integer toBeChanged)
	{
		value = toBeChanged;
	}
}
//****************************************************************************
//   Node.java                                                  
//  Class Node contains information and methods for a single node of
//  a linked list. Methods will allow one to set and get info and next values.
//****************************************************************************
package com.pitstop.school.examples.DataStructures.LinkedLists;

public class Node 
{

	protected int info;			// protected instead of private, allowing the NodeList class access
	protected Node next;

	public Node(int val) 
	{
		info = val;
		next = null;
	}
	 
	public Node(int val, Node link) 
	{
		info = val;
		next = link;
	}
	 
	public int getInfo() 
	{
		return info;
	}
	 
	public Node getNext() 
	{
		return next;
	}
	 
	public void setInfo(int val) 
	{
		info = val;
	}
	 
	public void setNext(Node ptr) 
	{
		next = ptr;
	}

}
//****************************************************************************
//   RunNodeList.java                                           
//  Class RunNodeList contains a main method to test the Node and the
//  NodeList classes.
//*****************************************************************************
package com.pitstop.school.examples.DataStructures.LinkedLists;

public class RunNodeList 
{
	public static void main(String args[]) {
		NodeList alist = new NodeList();
	
		alist.insert(15);
		alist.insert(30);
		alist.insert(25);
		alist.insert(8);
		alist.insert(60);
		alist.writeList();
		alist.delete(25);
		alist.delete(8);
		alist.delete(60);
		alist.writeList();
	}
}

/**** output from RunNodeList.java ********
inserted 15
inserted 30
inserted 25
inserted 8
inserted 60
8  15  25  30  60
deleted 25
deleted 8
deleted 60
15  30

*******************************************/


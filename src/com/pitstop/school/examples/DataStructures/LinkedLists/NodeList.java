//*******************************************************************
//   NodeList.java                                           
//  Class NodeList contains methods to load, and manage a linked list.
//	The data are integers and they are inserted in numerical order.
//  Stacks are Queues are structures that insert and delete items using 
//	other methods. 
//*******************************************************************
package com.pitstop.school.examples.DataStructures.LinkedLists;

public class NodeList 
{
	private Node head;
	private Node current, previous;
	
	// constructor
  public NodeList() 
  {
	  head = null;
	  current = null;
	  previous = null;
  }
  
  	// delete a given value
  public void delete(int deleteVal) 
  {
	  find(deleteVal);  
	  if (current == null || current.getInfo() != deleteVal)
		  System.out.println("Cannot find " + deleteVal + " in the list");
	  else 
	  {
		  if (previous == null)                // delete the first node
			    head = head.next;
		  else
			    previous.setNext(current.getNext());
		  System.out.println("deleted " + deleteVal + "\n");
	  }
	  current = null;
  }

  	//find the position of findVal within the list
  private void find(int findVal) 
  {
	current = head;
  	previous = null;
  	while (current != null && current.info < findVal) 
  	{
	  	previous = current;
	  	current = current.next;
	 }
  }

	//insert a value into the list
  public void insert(int insertVal) 
  {
  	find(insertVal);
  	Node temp = new Node(insertVal, current);
  	if (previous == null)
  		head = temp;
  	else
	  	previous.setNext(temp);
  	System.out.println("inserted " + insertVal);
  }
  
  public void writeList() 
  {
  	Node p = head;				// p will traverse the list
  	while (p != null) {
	  	System.out.print(p.getInfo() + "\t");
	  	p = p.next;
	  }
	  System.out.println();
  }
}
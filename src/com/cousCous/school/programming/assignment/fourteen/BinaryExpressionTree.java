package com.cousCous.school.programming.assignment.fourteen;

import java.util.Stack;


public class BinaryExpressionTree {
	private String postFix = "";
	private String currentChar = "";     //changed workinWith to currentChar because I hate you
	private String temp = "";     //changed justBecause because you're an feg to temp
	private stringNode root;
	private Stack stack = new Stack();
	public BinaryExpressionTree(String postfix)
	{
		postFix = postfix;
		for (int i=0; i < postFix.length(); i++)
		{
			temp = "" + postFix.charAt(i);
			stack.push(temp);
		}
        System.out.println(stack.toString());
        root = new stringNode((String) stack.pop());
		makeBinaryTree(root);
		
	}
	private void makeBinaryTree(stringNode startingOn)
	{
		
		if(stack.isEmpty())
		{
			return;
		}
		currentChar = (String) stack.pop();
		stringNode addingOn = new stringNode(currentChar);
		
		//startingOn.setLeft(addingOn);         Always go right first. *you ask why because you're a dumb fuck* because I said so, that's why
		startingOn.setRight(addingOn);

		if(!currentChar.equals("1") &&          //fixed this fuckup
				!currentChar.equals("2") &&
				!currentChar.equals("3") &&
				!currentChar.equals("4") &&
				!currentChar.equals("5") &&
				!currentChar.equals("6") &&
				!currentChar.equals("7") &&
				!currentChar.equals("8") &&
				!currentChar.equals("9") &&
				!currentChar.equals("0"))
				{
					makeBinaryTree(addingOn);
				}
		
		if(stack.isEmpty())
		{
			return;
		}
		
		currentChar = (String) stack.pop();
		stringNode addingOnAgain = new stringNode(currentChar);
		
		//startingOn.setRight(addingOnAgain);
		startingOn.setLeft(addingOnAgain);

		if(!currentChar.equals("1") &&
				!currentChar.equals("2") &&
				!currentChar.equals("3") &&
				!currentChar.equals("4") &&
				!currentChar.equals("5") &&
				!currentChar.equals("6") &&
				!currentChar.equals("7") &&
				!currentChar.equals("8") &&
				!currentChar.equals("9") &&
				!currentChar.equals("0"))
				{
					makeBinaryTree(addingOnAgain);
				}
	}
	
	public String getPostFix()
	{
		return postFix;
	}
	
	public void preorder() 
	{
		do_preorder(root);
		System.out.println();
	} 

	private void do_preorder(stringNode t) 
	{ 
		if (t != null) 
		{ 
			System.out.print(t.getNum() + "\t");
			do_preorder(t.getLeft());
            do_preorder(t.getRight());
		}
    }

}

package com.cousCous.school.programming.assignment.fourteen;

public class RunnerClass {
	
	public static void main(String args[]) {

//	postFix equation = new postFix("2^3+(4-2-1)");
//	System.out.println(equation.makePostfix());
        System.out.println("Get Postfix From Tree Infix");
        System.out.println("Expected: 342-*58^/");
    	System.out.println(new postFix("3*(4-2)/5^8").makePostfix());
    	//System.out.println(new postFix("3^2-5/7").makePostfix());

        System.out.println("Get Prefix From Tree:");
        System.out.println("Expected: /*3-42^58");
	//new BinaryExpressionTree(new postFix("(2+3)/(4*6)").makePostfix()).preorder();
	new BinaryExpressionTree(new postFix("3*(4-2)/5^8").makePostfix()).preorder();

	
	
	

	}
}

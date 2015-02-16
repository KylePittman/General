//This program computes how long it takes for an investment to double.

package com.pitstop.school.examples.Debugging;

public class InvestmentRunner
{
   public static void main(String[] args)
   {
      final double INITIAL_BALANCE = 10000;
      final double RATE = 5;
      
      Investment invest = new Investment(INITIAL_BALANCE, RATE);
      
      invest.waitForBalance(2 * INITIAL_BALANCE);
       
      System.out.println("The investment doubled after " + invest.getYears() + " years");
   }   
}

//A class to monitor the growth of an investment that 
//accumulates interest at a fixed annual rate.
 
package com.pitstop.school.examples.Debugging;

public class Investment
{
   private double balance;
   private double rate;
   private int years;

   //Constructs an Investment object from a starting balance and
   // interest rate. 
   public Investment(double aBalance, double aRate)
   {
      balance = aBalance;
      rate = aRate;
      years = 0;
   }

   // Keeps accumulating interest until a target balance has
   //   been reached.   
   public void waitForBalance(double targetBalance)
   {
      while (balance < targetBalance)
      {
         years++;   
         double interest = balance * rate / 100;
         balance = balance + interest;
         System.out.println(balance);
      }
   }

   // Gets the current investment balance.
    public double getBalance()
   {
      return balance;
   }

   // Gets the number of years this investment has accumulated interest.
    public int getYears()
   {
      return years;
   }
}

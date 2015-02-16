package com.pitstop.school.examples.bankaccount;
import java.text.DecimalFormat;
/**
 * A class to test the BankAccount class.
 */
public class BankAccountTester 
{

	// Tests the methods of the BankAccount class.
	public static void main(String[] args) 
	{
        DecimalFormat df = new DecimalFormat("###.##");
		BankAccount b1 = new BankAccount(1000);
		b1.withdraw(500);
        b1.withdraw(400.00);
		System.out.println("Remaining funds: $" +df.format(b1.getBalance()));
        BankAccount mom = new BankAccount(1000);
        mom.addInterest(5);
        System.out.println(mom.getBalance());
    }
}


/********************** output ***********************
100
*****************************************************/
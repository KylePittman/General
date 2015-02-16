package com.pitstop.school.examples.bankaccount;

// A bank account has a balance that can be changed by deposits and withdrawals.
public class BankAccount 
{
	private double balance;

	// Constructs a bank account with a zero balance.
	public BankAccount() 
	{
		balance = 0;
	}

	// Constructs a bank account with a given balance.
	public BankAccount(double initialBalance) 
	{
		balance = initialBalance;
	}

	// Deposits money into the bank account.
	public void deposit(double amount) 
	{
		double newBalance = balance + amount;
		balance = newBalance;
	}

	// Withdraws money from the bank account.
	public void withdraw(double amount) 
	{
		balance = balance - amount;
	}

	// Gets the current balance of the bank account.
	public double getBalance() 
	{
		return balance;
	}

	// a method demonstrating the "this" command
	public void mystery(BankAccount passedInBankAccount, double amount) 
	{
		// balance = balance - amount;
		this.withdraw(amount);
		passedInBankAccount.deposit(amount);

	}
    public void addInterest(double rate){
        this.balance = balance*(1+rate/100);
    }

}

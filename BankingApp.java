package com.exe;

public class BankingApp {
	
	int accountNo; // Variable to store the account number
	int balance;   // Variable to store the balance
	
	// Constructor to initialize account number and balance
	public BankingApp(int accountNo, int balance) {
		super(); // Call to the superclass constructor (Object class)
		this.accountNo = accountNo; // Set the account number
		this.balance = balance;     // Set the balance
	}
	
	// Method for depositing amount to the Account
	void deposit(int amt) {
		balance += amt; // Add the deposited amount to the balance
		System.out.println("New Balance: " + balance); // Print the new balance
	}
	
	// Method for withdrawing amount
	void WithDraw(int amt) throws InsufficientBalanceException {
		if (balance > amt) { // Check if the balance is sufficient for withdrawal
			balance -= amt; // Deduct the withdrawn amount from the balance
			System.out.println("Amount Withdraw Successfully: " + amt + "\nNew Balance: " + balance); // Print the withdrawn amount and new balance
		} else {
			throw new InsufficientBalanceException("Insufficient Balance:"); // Throw an exception if the balance is insufficient
		}
	}
	
	// Main method to execute the BankingApp class
	public static void main(String[] args) {
		BankingApp ba = new BankingApp(1000023456, 1200000); // Create a new BankingApp object with account number and initial balance
		ba.deposit(1200); // Deposit an amount to the account
		try {
			ba.WithDraw(200000); // Attempt to withdraw an amount
		} catch (InsufficientBalanceException e) {
			System.out.println(e); // Print the exception message if balance is insufficient
		}
	}
}

// Custom exception class for insufficient balance
class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message); // Call the superclass constructor with the exception message
	}
}

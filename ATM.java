package Corejava;

import java.util.Scanner;

public class ATM {

	
		    private static final int DAILY_WITHDRAWAL_LIMIT = 500000;
		    private static final int INITIAL_BALANCE = 120000;

		    public static void main(String[] args) {
		        int amount, sumAmount = 0, balance = INITIAL_BALANCE, totalAmount = 0;
		        int totalWithdrawnToday = 0;
		        Scanner sc = new Scanner(System.in);

		        int pinNumber = enterPin(sc);

		        while (true) {
		            System.out.println("1. Add Amount");
		            System.out.println("2. Withdraw");
		            System.out.println("3. Total Amount");
		            System.out.println("4. Exit");
		            System.out.println("Enter your choice:");

		            int choice = sc.nextInt();
		            switch (choice) {
		                case 1:
		                    System.out.println("Enter amount to add:");
		                    int addAmount = sc.nextInt();
		                    balance += addAmount;
		                    totalAmount += addAmount;
		                    System.out.println("Amount added successfully.");
		                    break;
		                case 2:
		                    System.out.println("Enter amount to withdraw:");
		                    amount = sc.nextInt();

		                    if (amount <= 0) {
		                        System.out.println("Invalid amount");
		                        continue;
		                    }

		                    if (totalWithdrawnToday + amount > DAILY_WITHDRAWAL_LIMIT) {
		                        System.out.println("Daily withdrawal limit exceeded");
		                        break;
		                    }

		                    if (balance < amount) {
		                        System.out.println("Insufficient balance");
		                        continue;
		                    }

		                    sumAmount += amount;
		                    totalWithdrawnToday += amount;
		                    balance -= amount;
		                    totalAmount -= amount;
		                    System.out.println("Balance=" + balance + " Amount withdrawn=" + amount);
		                    break;
		                case 3:
		                    System.out.println("Total amount: " + totalAmount);
		                    break;
		                case 4:
		                    System.out.println("Exiting...");
		                    return;
		                default:
		                    System.out.println("Invalid choice");
		            }
		        }
		    }

		    private static int enterPin(Scanner sc) {
		        System.out.println("Enter PIN number:");
		        return sc.nextInt();
		    }
}
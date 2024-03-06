package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char initial = sc.next().charAt(0);
		
		if (initial == 'y' || initial == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new BankAccount(number, holder, initialDeposit);
		} else {
			account = new BankAccount(number, holder);
		}
		
		System.out.println("\nAccount data: ");
		System.out.println("Account " + account.getAccountNumber() 
							+ ", Holder: " + account.getAccountOwner() 
							+ ", Balance: $" + String.format("%.2f", account.getBalance()));
		
		System.out.print("\nEnter a deposit value: ");
		account.deposit(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println("Account " + account.getAccountNumber() 
							+ ", Holder: " + account.getAccountOwner() 
							+ ", Balance: $" + String.format("%.2f", account.getBalance()));
		
		System.out.print("\nEnter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println("Account " + account.getAccountNumber() 
							+ ", Holder: " + account.getAccountOwner() 
							+ ", Balance: $" + String.format("%.2f", account.getBalance()));
		
		sc.close();
	}

}

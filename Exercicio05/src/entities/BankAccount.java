package entities;

public class BankAccount {
	private int accountNumber;
	private String accountOwner;
	private double balance;
	
	public BankAccount(int accountNumber, String accountOwner, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		deposit(initialDeposit);
	}
	
	public BankAccount(int accountNumber, String accountOwner) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double value) {
		balance += value;
	}
	
	public void withdraw(double value) {
		balance -= value + 5;
	}
}

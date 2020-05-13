package com.revature.Services;

public class Account {
	private String accountType;
	private String accountPassword;
	private double amount;
	private int accountNumber;
	private double accountBalance;
	public static final double MIN_ACCOUNT_BALANCE = 100;

	
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAcountNumber(int acountNumber) {
		this.accountNumber = acountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public double getAccounBalance() {
		return accountBalance;
	}

	public void setAccounBalance(double accounBalance) {
		this.accountBalance = accounBalance;
	}

	public void generateAcNo() {
		int acNo = (int) (Math.random() * 100000);
		System.out.println("Your A/C No is: " + acNo);
		
	}

	public void createAccount(String accountType) {
		accountType = this.getAccountType();
		if (accountType.equalsIgnoreCase("Checking a/c"))
			;
		generateAcNo();

	}

	@Override
	public String toString() {
		return "Account [accountType=" + accountType + ", amount=" + amount + ", accountNumber=" + accountNumber
				+ ", accountBalance=" + accountBalance + "]";
	}

	public void showAccount() {
		toString();
	}

	public void printStatement() {
		showAccount();

	}

}
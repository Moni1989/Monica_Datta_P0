package com.revature.Services;

public interface BankingServices {
	
	/*
	 * public void printStatement(); public void showAccount();
	 */
	public void depositAmount(double amount);
	public void withdraw(double amount);
	public void transfer(String accountName, double amount, double accountBalance);

}

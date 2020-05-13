
package com.revature.Services;

import com.revature.BankException.InSufficientFundsException;

public class SavingAccount extends Account implements BankingServices{
  
  private static final double RATE_OF_INTEREST=3;
  
  public SavingAccount(int accountNumber, double accountBalance) { 
	  super();
	  accountNumber=super.getAccountNumber();
	  accountBalance=super.getAccountBalance();
	  }
  
  public void addInterest() { 
	  double interest=getAccountBalance()*RATE_OF_INTEREST/100; 
	  depositAmount(interest); }


  public void depositAmount(double amount) {
	  if (amount<=0)
			throw new IllegalArgumentException(String.format("Invalid deposit amount %s, amount"));
		else setAccountBalance(getAccountBalance() + amount);
	
}
  public void getInterest() {
	  
  }

  public void withdraw(double amount) throws InSufficientFundsException {
		
		if(amount>Account.MIN_ACCOUNT_BALANCE) {
		throw new InSufficientFundsException(String.format("Amount requested %d is more than Minimum A/C balance %d, balance, amount));"));
		}else
			setAccountBalance(getAccountBalance() -(amount));
	}	

  public void transfer(String accountName, double amount, double accountBalance) {
}
  
  
  }
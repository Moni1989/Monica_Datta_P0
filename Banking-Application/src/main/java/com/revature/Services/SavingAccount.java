
  package com.revature.Services;
  
 
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

public void printStatement() {
	// TODO Auto-generated method stub
	
}

public void showAccount() {
	// TODO Auto-generated method stub
	
}

public void depositAmount(double amount) {
	// TODO Auto-generated method stub
	
}

public void withdraw(double amount) {
	// TODO Auto-generated method stub
	
}

public void transfer(String accountName, double amount, double accountBalance) {
	// TODO Auto-generated method stub
	
}
  
  
  }
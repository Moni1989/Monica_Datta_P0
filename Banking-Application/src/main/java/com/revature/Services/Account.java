package com.revature.Services;

  
  public class Account {
	  private String accountType; 
	  private String accountPassword; 
	  private double amount; 
	  private int accountNumber;
	  private double accountBalance;
  

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
	  this.accountPassword= accountPassword; 
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
	  this.accountBalance =accounBalance; 
	  }  
  
  public void createAccount(String accountType) {
	  accountType=this.getAccountType();
	  if(accountType.equalsIgnoreCase("Checking a/c"));
	  
  }
  public void showAccount() {
		System.out.println("Details: ");
		System.out.println("A/C number: "+getAccountNumber()+" "+"Current A/C Balance: "+getAccountBalance());
	}
  public void printStatement() {
		showAccount();
		
	}
  
  }

  package com.revature.Services;
  
    
  public class CheckingAccount extends Account implements BankingServices{
	  
	  private static final int TRANSACTION_FEE=5; 
	  private int NO_OF_FREE_TRANSACTION=3; 
	  private int txn_count;
	  private static final double MIN_ACCOUNT_BALANCE=100;
	  	  
	  public CheckingAccount(int accountNumber, double accountBalance) {
		super();
		accountNumber=super.getAccountNumber();
		accountBalance=super.getAccountBalance();
		}

	/*
	 * public void printStatement() { showAccount();
	 * 
	 * }
	 */

	/*
	 * public void showAccount() { System.out.println("Details: ");
	 * System.out.println("A/C number: "+getAccountNumber()+" "
	 * +"Current A/C Balance: "+getAccountBalance()); }
	 */

	public void depositAmount(double amount) {
		setAccountBalance(getAccountBalance() + amount);
		
	}

	public void withdraw(double amount) {
		
		if(amount>getAccounBalance()) {
			System.out.println("Account Balance is low");
		}else
			txn_count++;
			setAccountBalance(getAccountBalance() -(amount+withdrawlFee(txn_count)));
		
					
		}
	public int withdrawlFee(int counter) {
		if(txn_count>NO_OF_FREE_TRANSACTION) {
			double charges=TRANSACTION_FEE*(txn_count-NO_OF_FREE_TRANSACTION);
		}
		return counter;
		
	}

	public void transfer(String accountName, double amount, double accountBalance) {
				if(accountBalance>MIN_ACCOUNT_BALANCE) {
					accountBalance-=amount;
				}
	}

	
	  }
 
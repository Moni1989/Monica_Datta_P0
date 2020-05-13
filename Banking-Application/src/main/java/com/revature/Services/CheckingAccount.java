
  package com.revature.Services;

import com.revature.BankException.InSufficientFundsException;

public class CheckingAccount extends Account implements BankingServices{
	  
	  private static final int TRANSACTION_FEE=5; 
	  private int NO_OF_FREE_TRANSACTION=3; 
	  private int txn_count;
	  private double charges;
	  private static final double MIN_ACCOUNT_BALANCE=100;
	  	  
	  public CheckingAccount(int accountNumber, double accountBalance) {
		super();
		accountNumber=super.getAccountNumber();
		accountBalance=super.getAccountBalance();
		}


	public void depositAmount(double amount) {
		if (amount<=0)
			throw new IllegalArgumentException(String.format("Invalid deposit amount %s, amount"));
		else setAccountBalance(getAccountBalance() + amount);
		
	}

	public void withdraw(double amount) throws InSufficientFundsException {
		
		if(amount>getAccounBalance()) {
		throw new InSufficientFundsException(String.format("Current balance %d is less than requested amount %d, balance, amount));"));
		}else
			txn_count++;
			setAccountBalance(getAccountBalance() -(amount+withdrawlFee(charges)));
	}		

	public int withdrawlFee(double charges) {
		if(txn_count>NO_OF_FREE_TRANSACTION) {
			this.charges=TRANSACTION_FEE*(txn_count-NO_OF_FREE_TRANSACTION);
		}
		return 0;
		
	}

	public void transfer(String accountName, double amount, double accountBalance) {
				if(accountBalance>MIN_ACCOUNT_BALANCE) {
					accountBalance-=amount;
				}
	}

	
	  }
 
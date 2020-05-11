
  package com.revature.Bank;

import com.revature.Services.Account;

public class Customer extends Account{
  
  public Customer(int account_type, String accountPassword, double amount) {
  super();
  } 
  private static String customerFirstName; private static
  String customerLastName; private static String emailId; private String
  userName;
  
  public String getCustomerFirstName() { 
	  return customerFirstName; 
	  } 
  public void setCustomerFirstName(String customerFirstName) {
	  this.customerFirstName= customerFirstName; 
	  }
  public String getCustomerLastName() 
  {
	  return customerLastName; 
	  } 
  public void setCustomerLastName(String customerLastName){ 
	  this.customerLastName = customerLastName; 
	  }
  public String getEmailId() {
  return emailId; 
  }
  public void setEmailId(String emailId) {
	  this.emailId =emailId; 
	  }
  
   }
 
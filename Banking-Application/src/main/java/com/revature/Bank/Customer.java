
  package com.revature.Bank;

import java.io.Serializable;
import java.util.logging.Logger;


public class Customer implements Serializable{
 
  	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getAnonymousLogger();//
	
		private String customerFirstName; 
		private String customerLastName; 
		private String emailId; 
		private String userName;				
  
	public Customer(String customerFirstName, String customerLastName, String emailId, String userName) {
		super();
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.emailId = emailId;
		this.userName = userName;
		}
		public String getCustomerFirstName() { 
			return customerFirstName; 
	  } 
		public void setCustomerFirstName(String customerFirstName) {
			this.customerFirstName= customerFirstName; 
	  }
		public String getCustomerLastName(){
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
 
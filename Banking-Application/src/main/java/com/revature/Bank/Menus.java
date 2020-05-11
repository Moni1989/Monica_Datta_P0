package com.revature.Bank;

import java.util.Scanner;
import com.revature.Services.Account;
import com.revature.Services.CheckingAccount;

public class Menus{
	Account ac=new Account();
	CheckingAccount ca=new CheckingAccount(ac.getAccountNumber(),ac.getAccounBalance());
	Scanner sc=new Scanner(System.in);
	int choice = sc.nextInt();
	
		
	//Initial screen of the application
	public void welcome() {
		System.out.println("---------------------------------");
		System.out.println("||  Welcome to Online Banking  ||");
		System.out.println("---------------------------------");
	}
	public void accountSelection() {
		System.out.println("Select type of A/C to create");
		System.out.println("1.Checking Account");
		System.out.println("2.Saving Account");
		System.out.println("Enter your option:"+choice);
	}
	//Main Menu
	public void mainMenu() {
		System.out.println("Select an option:");
		System.out.println("1.New Customer");
		System.out.println("2.Existing Customer");
		System.out.println("Enter your option:"+choice);
		if(choice==1)
			newCustomerMenu();
		else if(choice==2)
			existingCustomerMenu();
		else 
			System.out.println("Wrong Selection");
	}
	public void newCustomerMenu() {	
		System.out.println("Enter First Name: ");
		String customerFirstName=sc.nextLine();
		System.out.println("Enter Last Name: ");
		String customerLastName=sc.nextLine();
		System.out.println("Enter EmailId");
		String EmailId=sc.nextLine();
		System.out.println("Congratulations "+customerFirstName+" "+customerLastName);
		System.out.println("You have successfully created your Online Banking Account");
		System.out.println("Select type of A/C to create");
		accountSelection();
		if(choice==1) {
			ca.
		}else if(choice==2) {
			
		}else
			System.out.println("Wromg Selection!");
		
		
	}
	public void existingCustomerMenu() {
		System.out.println("Enter UserName ");
		String userName=sc.nextLine();
		System.out.println("Enter Password: ");
		String accountPassword=sc.nextLine();
				
	}
	
}


	/*public void customerSelection(int choice) {
		choice=sc.nextInt();

		switch(choice) {
			//If customers choose 1
			case 1: newCustomerMenu();
					break;
					System.out.println("1.Checking A/C");
					System.out.println("2.Saving A/C");
					int ch=sc.nextInt();
					if(ch==1) {
					CheckingAccount();
				
				//If customers choose 2
			case 2:	System.out.println("Enter UserName ");
					String userName=sc.nextLine();
					System.out.println("Enter Password: ");
					String accountPassword=sc.nextLine();
					break;
				
			default:System.out.println("Invalid Input!!");
					//printMenu();
				
	}*/
		

package com.revature.Main;

import java.util.Scanner;

import com.revature.Services.Account;
import com.revature.Services.CheckingAccount;
import com.revature.Services.SavingAccount;

//import com.revature.Bank.Menus;

public class BankApp {
	static Account ac = new Account();
	CheckingAccount ca = new CheckingAccount(ac.getAccountNumber(), ac.getAccounBalance());
	SavingAccount sa = new SavingAccount(ac.getAccountNumber(), ac.getAccountBalance());
	static Scanner sc = new Scanner(System.in);
	// int sc.nextInt() = sc.nextInt();

	// Initial screen of the application
	public static void welcome() {
		System.out.println("---------------------------------");
		System.out.println("||  Welcome to Online Banking  ||");
		System.out.println("---------------------------------");
	}

	// Main Menu
	public static void mainMenu() {

		System.out.println("1.New Customer");
		System.out.println("2.Existing Customer");
		System.out.println("Select an option:");
		int choice = sc.nextInt();
		if (choice == 1)

			newCustomerMenu();
		else if (choice == 2)

			existingCustomerMenu();
		else
			System.out.println("Wrong Selection");
	}

	// new customer menu
	public static void newCustomerMenu() {

		System.out.println("Enter First Name: ");
		String customerFirstName = sc.next();
		System.out.println("Enter Last Name: ");
		String customerLastName = sc.next();
		System.out.println("Enter EmailId");
		String EmailId = sc.next();

		System.out.println("Congratulations " + customerFirstName + " " + customerLastName);
		System.out.println("You have successfully created your Online Banking Account");
		accountSelection();
	}

	// a/c selection for new customer
	public static void accountSelection() {
		System.out.println("Select type of A/C to create");
		System.out.println("1.Checking Account");
		System.out.println("2.Saving Account");
		System.out.println("Enter your option:");
		int choice1 = sc.nextInt();

		if (choice1 == 1) {
			ac.generateAcNo();
			System.out.println("Your initial A/C balance is $" + 500);
			System.out.println("Account created successfully!!");
		} else if (choice1 == 2) {
			ac.generateAcNo();
			System.out.println("Your initial A/C balance is $" + ac.MIN_ACCOUNT_BALANCE);
			System.out.println("Account created successfully!!");

		} else
			System.out.println("Wrong Selection!");

	}

	// existing customer menu
	public static void existingCustomerMenu() {
		System.out.println("Enter UserName ");
		String userName = sc.next();
		System.out.println("Enter Password: ");
		String accountPassword = sc.next();
		System.out.println("Enter A/C Type");
		String type = sc.next();
	}

// a/c service selection 
	public static void serviceSelection() {
		System.out.println("Selection type of operation:");
		System.out.println("1.Withdraw");
		System.out.println("2.Deposit");
		System.out.println(sc.nextInt());
		if (sc.nextInt() == 1) {

		}
	}

	public static void main(String[] args) {

		welcome();
		mainMenu();

	}

}

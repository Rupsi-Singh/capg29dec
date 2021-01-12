package com.cg.accmgmt.util;

import java.util.List;
import java.util.Scanner;

import com.cg.accmgmt.domain.Account;
import com.cg.accmgmt.domain.CurrentAccount;
import com.cg.accmgmt.domain.SavingAccount;
import com.cg.accmgmt.service.AccountService;
import com.cg.accmgmt.serviceimpl.AccountServiceImpl;

public class MenuUtil {
	private AccountService accountService;
	
	public MenuUtil() {
		accountService=new AccountServiceImpl();
	}

	public void start() {
		int choice;
		Scanner sc=new Scanner(System.in);
		String continueChoice;
		do {
			showMenu();
			System.out.println("Enter Your Choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("------create account-----");
				System.out.println("Which type of account you want to open [1. Saving, 2. Current] : ");
				int accType = sc.nextInt();
				System.out.println("What is your name");
				String accountHolder = sc.next();
				accountService.createAccount(accType, accountHolder);
				System.out.println("Success! Your Account is Opened with PBI Bank");
				break;
			case 2:
				System.out.println("------List all account-----");
				List<Account> accounts =  accountService.showAllAccounts();
				for (Account account : accounts) {
					System.out.println("Account No : "+account.getAccNo());
					System.out.println("Account Holder : "+account.getAccountHolder());
					if(account instanceof SavingAccount) {
						System.out.println("Account Type : Saving Account");
						System.out.println("Balance : "+ ((SavingAccount) account).getBalance());
					}
					if(account instanceof CurrentAccount) {
						System.out.println("Account Type : Current Account");
						System.out.println("Balance : "+ ((CurrentAccount) account).getOverDrawLimit());
					}
					System.out.println("=================================================");
					
				}
				break;
				
			case 0:
				System.exit(0);
				break;
			default:
				break;
			}
			System.out.println("Do you want to continue (yes/no : ");
			continueChoice=sc.next();
			
		}while(continueChoice.equalsIgnoreCase("yes"));
		
	}

	private void showMenu() {
		System.out.println("-----------PBI Bank-------------");
		System.out.println("1. Create Account");
		System.out.println("2. Show All Accounts");
		System.out.println("0. Exit");
		
		
	}

}

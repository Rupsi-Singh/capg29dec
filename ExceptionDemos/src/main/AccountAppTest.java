package main;

import customexception.AccountService;
import customexception.AccountServiceImpl;
import exception.InsufficientBalanaceException;
import exception.InvalidAccountNumberException;

public class AccountAppTest {

	public static void main(String[] args) {
		AccountService accountService =  new AccountServiceImpl();
		try {
			accountService.withdraw(100, 200);
		} catch (InvalidAccountNumberException e) {
			System.out.println("Problem is : "+e.getMessage());
		} catch (InsufficientBalanaceException e) {
			System.out.println("Problem is : "+e.getMessage());
		}

	}

}

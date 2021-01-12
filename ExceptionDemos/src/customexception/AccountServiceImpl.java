package customexception;

import exception.InsufficientBalanaceException;
import exception.InvalidAccountNumberException;

public class AccountServiceImpl implements AccountService{

	private int balance;
	public AccountServiceImpl() {
		balance = 500;
	}
	@Override
	public void withdraw(final int accNo, final int amount) throws InvalidAccountNumberException, InsufficientBalanaceException {
		
		if(accNo!=101) {
			throw new InvalidAccountNumberException("Your Account Number is not valid");
		}
		if(amount>balance) {
			throw new InsufficientBalanaceException("You do not have sufficient balance");
		}
		
		System.out.println("Initial Balance : "+balance);
		balance=balance-amount;
		System.out.println("Account number :"+accNo);
		System.out.println("Amount withdrawn : "+amount);
		System.out.println("Available Balance : "+balance);
		
	}

}

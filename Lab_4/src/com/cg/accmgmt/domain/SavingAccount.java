package com.cg.accmgmt.domain;

/**
 * This SavingAccount will be used as data traveller object
 * @author panka
 *
 */
public class SavingAccount extends Account{
	
	private double balance;
	
	public SavingAccount(final Long accNo, final String accountHolder, final double balance) {
		super(accNo, accountHolder);
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
}

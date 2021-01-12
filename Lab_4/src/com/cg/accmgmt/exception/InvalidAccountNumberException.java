package com.cg.accmgmt.exception;

public class InvalidAccountNumberException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Createing InvalidAccountNumberException object without error message
	 */
	public InvalidAccountNumberException() {
		super();
	}
	
	/**
	 * Createing InvalidAccountNumberException object with error message
	 */
	public InvalidAccountNumberException(String errMsg) {
		super(errMsg);
	}

}

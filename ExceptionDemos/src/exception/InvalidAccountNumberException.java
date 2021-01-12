package exception;

public class InvalidAccountNumberException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create InvalidAccountNumberException object without error message
	 */
	public InvalidAccountNumberException() {
		super();
		
	}
	
	/**
	 * Create InvalidAccountNumberException object with error message
	 */
	public InvalidAccountNumberException(String errMsg) {
		super(errMsg);
	}
	
}

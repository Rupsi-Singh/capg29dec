package exception;

public class InsufficientBalanaceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create InsufficientBalanaceException object without error message
	 */
	public InsufficientBalanaceException() {
		super();
	}
	/**
	 * Create InsufficientBalanaceException object with error message
	 */
	public InsufficientBalanaceException(String errMsg){
		super(errMsg);
	}

}

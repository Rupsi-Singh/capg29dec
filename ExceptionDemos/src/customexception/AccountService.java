package customexception;

import exception.InsufficientBalanaceException;
import exception.InvalidAccountNumberException;

public interface AccountService {
	
	void withdraw(final int accNo, final int amount) throws InvalidAccountNumberException,InsufficientBalanaceException ;

}

package com.cg.cms.service;

import java.util.List;

import com.cg.cms.domain.User;
import com.cg.cms.exception.UserNotFoundException;

/**
 * This UserService will perform all the User related services
 * @author panka
 *
 */
public interface UserService {
	
	
	int ROLE_GUEST_USER =1;
	int ROLE_ADMIN = 2;
	int STATUS_ACTIVE=1;
	int STATUS_INACTIVE=2;
	
	/**
	 * This registerUser Method will register the user in system
	 * @param user to be registered
	 */
	 void registerUser(User user);
	 /**
	  * This authenticateUser method will check the authenticity of the user
	  * @param loingname of the user
	  * @param pwd of the user
	  * @return user if authenticated successfully of UserNotFoundException in case there is no user in DB.
	  */
	 User authenticateUser(String loingname,String pwd) throws UserNotFoundException;
	 
	 /**
	  * This showAllUsers method will return the list of users
	  * @return the list of users if found otherwise null.
	  */
	 List<User> showAllUsers();

}

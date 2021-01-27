package com.cg.cms.dao;

import java.util.List;

import com.cg.cms.domain.User;

/**
 * This UserDAO interface will perform CRUD Operations on User
 * @author panka
 *
 */
public interface UserDAO {
	
	/**
	 * This save method will save the user object in users table
	 * @param user object to be saved
	 */
	void save(User user);
	/**
	 * This delete method will delete the user object from users table
	 * @param user to be deleted
	 */
	void delete(User user);
	/**
	 * This delete method will delete the user based on id from users table
	 * @param id of the user to be deleted
	 */
	void delete(int id);
	/**
	 * This update method will update the user in the users table 
	 * @param user to be updated
	 */
	void update(User user);
	/**
	 * This findAll method will return the list of users if found 
	 * @return list of users if found otherwise null
	 */
	List<User> findAll();

}

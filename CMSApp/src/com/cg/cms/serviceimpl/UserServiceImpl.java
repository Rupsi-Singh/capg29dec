package com.cg.cms.serviceimpl;

import java.util.List;

import com.cg.cms.dao.UserDAO;
import com.cg.cms.daoimpl.UserDAOImpl;
import com.cg.cms.domain.User;
import com.cg.cms.exception.UserNotFoundException;
import com.cg.cms.factory.ObjectFactory;
import com.cg.cms.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO;

	public UserServiceImpl() {
		userDAO =  (UserDAO)ObjectFactory.getBean("userDAOImpl"); // Demanding Object
	}

	@Override
	public void registerUser(User user) {
		// TODO Check the user available in DB , if yes Throw exception that UserAlreadyAvailable. If user is not available let it be created. 
		user.setRole(ROLE_GUEST_USER);
		user.setStatus(STATUS_ACTIVE);
		userDAO.save(user);

	}

	@Override
	public User authenticateUser(String loingname, String pwd) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> showAllUsers() {		
		return userDAO.findAll();
	}

}

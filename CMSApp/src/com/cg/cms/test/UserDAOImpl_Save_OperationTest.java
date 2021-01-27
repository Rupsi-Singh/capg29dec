package com.cg.cms.test;

import com.cg.cms.dao.UserDAO;
import com.cg.cms.daoimpl.UserDAOImpl;
import com.cg.cms.domain.User;

public class UserDAOImpl_Save_OperationTest {

	public static void main(String[] args) {
		UserDAO userDAO =  new UserDAOImpl();
		User user=new User();
		user.setName("Rishita");
		user.setContact("9876543218");
		user.setEmail("rishita@gmail.com");
		user.setLoginname("rishita");
		user.setPwd("rishita@123");
		user.setRole(1);
		user.setStatus(1);
		userDAO.save(user);
		System.out.println("Success! User Saved.");
	}

}

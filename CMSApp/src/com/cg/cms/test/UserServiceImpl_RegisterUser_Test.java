package com.cg.cms.test;

import com.cg.cms.domain.User;
import com.cg.cms.service.UserService;
import com.cg.cms.serviceimpl.UserServiceImpl;

public class UserServiceImpl_RegisterUser_Test {

	public static void main(String[] args) {
		UserService userService=new UserServiceImpl();
		User user = new User();
		user.setName("pranjali");
		user.setContact("8632487628");
		user.setEmail("pranjali@gmail.com");
		user.setLoginname("pranjali");
		user.setPwd("pranjali@12");
		userService.registerUser(user);
	}

}

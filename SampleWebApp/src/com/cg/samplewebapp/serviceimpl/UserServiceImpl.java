package com.cg.samplewebapp.serviceimpl;

import com.cg.samplewebapp.domain.User;
import com.cg.samplewebapp.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public void createUser(User user) {
		System.out.println("---------User Created Successfully-----------");
		System.out.println(user);

	}

}

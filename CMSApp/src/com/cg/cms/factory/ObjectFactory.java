package com.cg.cms.factory;

import com.cg.cms.daoimpl.UserDAOImpl;
import com.cg.cms.serviceimpl.UserServiceImpl;

public class ObjectFactory {

	public static Object getBean(String className) {
		Object object = null;
		if(className.equals("userDAOImpl")) {
			object=new UserDAOImpl();
		}
		
		if(className.equals("userServiceImpl")) {
			object=new UserServiceImpl();
		}
		return object;
	}
}

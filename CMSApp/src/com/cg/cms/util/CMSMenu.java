package com.cg.cms.util;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.cg.cms.domain.User;
import com.cg.cms.factory.ObjectFactory;
import com.cg.cms.service.UserService;

public class CMSMenu {
	
	private UserService userService;
	private static Logger logger = Logger.getLogger(CMSMenu.class);
	
	public CMSMenu() {
		userService = (UserService) ObjectFactory.getBean("userServiceImpl");
		logger.info(userService);
	}
	
	public void start() {
		int choice;
		String continueChoice;
		Scanner sc=  new Scanner(System.in);
		do {
			showMenu();		
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("-------Please Provide below details---------");
				User user = new User();
				System.out.println("Enter your name : ");
				user.setName(sc.next());
				System.out.println("Enter your contact no : ");
				user.setContact(sc.next());
				System.out.println("Enter your Email : ");
				user.setEmail(sc.next());
				System.out.println("Enter your Login Name : ");
				user.setLoginname(sc.next());
				System.out.println("Enter your Password : ");
				user.setPwd(sc.next());
				userService.registerUser(user);
				System.out.println("Success! You are Registered.");
				break;
			case 2:
				System.out.println("-------Here is the list of users---------");
				List<User> users =  userService.showAllUsers();
				for (User usr : users) {
					System.out.println(usr);
					System.out.println("------------------------------------------------------------");
				}
				break;
			case 3:
				System.out.println("-------Remove User---------");
				break;
			case 4:
				System.out.println("-------Edit User---------");
				break;
			case 5:
				System.out.println("-------Find User---------");
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
			System.out.println("Do you want to continue : [yes/no]");
			continueChoice = sc.next();
		}while(continueChoice.equalsIgnoreCase("yes"));
	}
	
	private void showMenu() {
		System.out.println("---------CMS Menu-----------");
		System.out.println("1. Register User");
		System.out.println("2. Show All Users");
		System.out.println("3. Remove User");
		System.out.println("4. Edit User");
		System.out.println("5. Find User");
		System.out.println("0. Exit");
	}

}

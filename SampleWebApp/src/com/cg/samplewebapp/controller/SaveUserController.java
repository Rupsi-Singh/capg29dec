package com.cg.samplewebapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.samplewebapp.domain.User;
import com.cg.samplewebapp.service.UserService;
import com.cg.samplewebapp.serviceimpl.UserServiceImpl;

@WebServlet("/SaveUserController")
public class SaveUserController extends HttpServlet {	
	private static final long serialVersionUID = 1L;
	private UserService userService=null;
	public SaveUserController() {
		userService=new UserServiceImpl(); // getBean("userService");
	}
 	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. Read Input
 		String userName = request.getParameter("userName");
		String contact = request.getParameter("contact");
		//2. Creating model
		User user= new User();
		user.setName(userName);
		user.setContact(contact);
		//3. Share the model with service
		userService.createUser(user);
		//4. Redirection
		response.sendRedirect("welcome.jsp");
		
 	}

}

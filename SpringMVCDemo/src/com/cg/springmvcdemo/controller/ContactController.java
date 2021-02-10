package com.cg.springmvcdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.springmvcdemo.model.Contact;
import com.cg.springmvcdemo.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/contactform")
	public String showContactForm(Model model) {
		model.addAttribute("contact", new Contact());
		return "contactform"; // view name
	}
	
	@RequestMapping(value = "/processContactForm", method = RequestMethod.POST)
	public String processContactForm(@ModelAttribute("contact") Contact contact) {
		//Read data, prepare model and share with service
		contactService.createContact(contact);
		
		//Redirection
		return "welcome";
	}
	

}

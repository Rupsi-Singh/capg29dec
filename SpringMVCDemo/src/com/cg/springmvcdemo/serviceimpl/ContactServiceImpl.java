package com.cg.springmvcdemo.serviceimpl;

import org.springframework.stereotype.Service;

import com.cg.springmvcdemo.model.Contact;
import com.cg.springmvcdemo.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Override
	public void createContact(Contact contact) {
		System.out.println(contact);

	}

}

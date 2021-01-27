package com.cg.cms.domain;

/**
 * This class will work as a super class and will provide the common attributes
 * to its sub classes.
 * 
 * @author panka
 *
 */
public class Person {

	/**
	 * id of the person
	 */
	private int id;
	/**
	 * name of the person
	 */
	private String name;
	/**
	 * contact number of the person
	 */
	private String contact;
	/**
	 * email of the person
	 */
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", contact=" + contact + ", email=" + email + "]";
	}
	
	

}

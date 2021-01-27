package com.cg.embededdemo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.embededdemo.model.Address;
import com.cg.embededdemo.model.UserDetail;

public class ApplicationStartup {
	
	public static void main(String[] args) {
		UserDetail userDetail = new UserDetail();
		userDetail.setName("Pankaj Sharma");
		
		Address address = new Address();
		address.setHouseNo("168B");
		address.setStreet("Shri Krishna Avannue");
		address.setCity("Indore");
		address.setZip("442061");
		userDetail.setAddress(address);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(userDetail);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}

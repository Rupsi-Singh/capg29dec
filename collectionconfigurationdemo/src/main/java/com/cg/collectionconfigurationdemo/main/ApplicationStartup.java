package com.cg.collectionconfigurationdemo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.collectionconfigurationdemo.model.Address;
import com.cg.collectionconfigurationdemo.model.UserDetail;

public class ApplicationStartup {
	
	public static void main(String[] args) {
		UserDetail userDetail = new UserDetail();
		userDetail.setName("Pankaj Sharma");
		
		Address homeAddress = new Address();
		homeAddress.setHouseNo("168B");
		homeAddress.setStreet("Shri Krishna Avannue");
		homeAddress.setCity("Indore");
		homeAddress.setZip("442061");
		
		Address officeAddress = new Address();
		officeAddress.setHouseNo("150");
		officeAddress.setStreet("Hinjewadi");
		officeAddress.setCity("Pune");
		officeAddress.setZip("452020");
		
		userDetail.getAddresses().add(homeAddress);
		userDetail.getAddresses().add(officeAddress);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(userDetail);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}

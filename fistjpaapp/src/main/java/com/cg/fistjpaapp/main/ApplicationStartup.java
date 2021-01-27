package com.cg.fistjpaapp.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.fistjpaapp.model.UserDetail;

public class ApplicationStartup {
	
	public static void main(String[] args) {
		UserDetail userDetail = new UserDetail();
		userDetail.setName("Pankaj Sharma");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(userDetail);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}

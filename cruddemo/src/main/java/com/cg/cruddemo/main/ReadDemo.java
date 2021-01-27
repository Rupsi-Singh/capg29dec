package com.cg.cruddemo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.cruddemo.model.UserDetail;

public class ReadDemo {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		//get data from entitymanager
		UserDetail userDetail = entityManager.find(UserDetail.class, 2);
		System.out.println("User id : "+userDetail.getId());
		System.out.println("User Name : "+userDetail.getName());
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}

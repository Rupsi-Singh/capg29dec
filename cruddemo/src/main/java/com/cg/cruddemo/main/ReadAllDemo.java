package com.cg.cruddemo.main;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.cruddemo.model.UserDetail;

public class ReadAllDemo {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Query query =entityManager.createQuery("from UserDetail");
		List<UserDetail> users =  query.getResultList();
		for (UserDetail user : users) {
			System.out.println("ID : "+user.getId());
			System.out.println("Name : "+user.getName());
			System.out.println("-----------------------------");
		}
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}

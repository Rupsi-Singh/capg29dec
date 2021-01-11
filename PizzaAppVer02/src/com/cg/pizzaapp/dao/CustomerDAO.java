package com.cg.pizzaapp.dao;

import java.util.List;

import com.cg.pizzaapp.domain.Customer;

public interface CustomerDAO {
	

	void save(Customer customer);
	
	List<Customer> findAll();
	
	void update(Customer customer);
	
	void delete(Customer customer);
	
	void delete(Long id);

}

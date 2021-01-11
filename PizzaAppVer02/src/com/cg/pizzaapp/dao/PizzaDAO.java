package com.cg.pizzaapp.dao;

import java.util.List;

import com.cg.pizzaapp.domain.Pizza;

/**
 * This PizzaDAO will be performing all CRUD operations on Pizza
 * @author panka
 *
 */
public interface PizzaDAO {
	/**
	 * This save method will save the pizza in the local repository
	 * @param pizza to be saved
	 */
	void save(Pizza pizza);
	/**
	 * This findAll() method will return the list of Pizzas
	 * @return list of pizza if found otherwise null
	 */
	List<Pizza> findAll();
	/**
	 * This update method will update the pizza information
	 * @param pizza to be updated
	 */
	void update(Pizza pizza);
	/**
	 * This delete method will delete the pizza 
	 * @param pizza to be deleted
	 */
	void delete(Pizza pizza);
	/**
	 * This delete method will delete the pizza based on id
	 * @param id of the pizza to be deleted.
	 */
	void delete(Long id);

}

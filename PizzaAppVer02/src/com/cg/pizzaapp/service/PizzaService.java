package com.cg.pizzaapp.service;

import java.util.List;

import com.cg.pizzaapp.domain.Pizza;

/**
 * This PizzaService will perform all pizza related operations
 * @author panka
 *
 */
public interface PizzaService {
	
	/**
	 * This orderPizza will order the pizza
	 * @param pizza to be ordered
	 */
	void orderPizza(Pizza pizza);
	/**
	 * Pizza will be cooked based on the tokenNo
	 * @param tokenNo of the pizza to be cooked
	 * @return pizza if cooked, otherwise null
	 */
	Pizza cookPizza(String tokenNo);
	/**
	 * This cancelPizza method will cancel the pizza
	 * @param pizza to be canceled
	 */
	void cancelPizza(Pizza pizza);
	/**
	 * This method will show the available pizzas
	 * @return the list of available pizzas if found otherwise null
	 */
	List<Pizza> showAllPizzas();

}

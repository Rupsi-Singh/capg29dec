package com.cg.pizzaapp.serviceimpl;

import java.util.List;

import com.cg.pizzaapp.dao.PizzaDAO;
import com.cg.pizzaapp.daoimpl.PizzaDAOImpl;
import com.cg.pizzaapp.domain.Pizza;
import com.cg.pizzaapp.service.PizzaService;

public class PizzaServiceImpl implements PizzaService {
	private PizzaDAO pizzaDAO;
	
	public PizzaServiceImpl() {
		pizzaDAO =  new PizzaDAOImpl();
	}

	@Override
	public void orderPizza(Pizza pizza) {
		// TODO : Business Logic for implementing orderPizza
		pizzaDAO.save(pizza);

	}

	@Override
	public Pizza cookPizza(String tokenNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelPizza(Pizza pizza) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Pizza> showAllPizzas() {
		// TODO Show the list of available pizzas
		return pizzaDAO.findAll();
	}

}

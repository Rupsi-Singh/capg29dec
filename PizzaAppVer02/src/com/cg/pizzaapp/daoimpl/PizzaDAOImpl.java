package com.cg.pizzaapp.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.cg.pizzaapp.dao.PizzaDAO;
import com.cg.pizzaapp.domain.Pizza;

public class PizzaDAOImpl implements PizzaDAO{
	
	private List<Pizza> pizzaLocalRepository=null;	

	public PizzaDAOImpl() {
		this.pizzaLocalRepository=new ArrayList<>();
	}

	@Override
	public void save(Pizza pizza) {
		pizza.setId(System.currentTimeMillis());
		pizzaLocalRepository.add(pizza);
		
	}

	@Override
	public List<Pizza> findAll() {
		return pizzaLocalRepository;
	}

	@Override
	public void update(Pizza pizza) {
		// TODO compelte this
		
	}

	@Override
	public void delete(Pizza pizza) {
		// TODO Call delete (Loing id)  method here it will be deleting by id
		
	}

	@Override
	public void delete(Long id) {
		// TODO complete this by tomorrow
		
	}

}

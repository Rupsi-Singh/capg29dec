package com.cg.pizzaapp.test;

import java.util.List;

import com.cg.pizzaapp.dao.PizzaDAO;
import com.cg.pizzaapp.daoimpl.PizzaDAOImpl;
import com.cg.pizzaapp.domain.Pizza;

public class PizzaDAOImpl_SaveOpeationTest {

	public static void main(String[] args) {
		PizzaDAO pizzaDAO;
		pizzaDAO=new PizzaDAOImpl();
		
		Pizza pizza = new Pizza();
		pizza.setName("Farmhouse");
		pizza.setCrust("Hand Tosted");
		pizza.setSize("Medium");
		
		pizzaDAO.save(pizza); // Declarative way of doing something.
		List<Pizza> pizzas =  pizzaDAO.findAll();
		System.out.println(pizzas);

	}

}

package com.cg.pizzaapp.util;

import java.util.List;
import java.util.Scanner;

import com.cg.pizzaapp.domain.Pizza;
import com.cg.pizzaapp.service.PizzaService;
import com.cg.pizzaapp.serviceimpl.PizzaServiceImpl;

public class PizzaUtil {
	private PizzaService pizzaService;
	
	public PizzaUtil() {
		pizzaService=new PizzaServiceImpl();
	}

	public void start() {
		Scanner sc=new Scanner(System.in);
		int choice;
		String contiChoice;
	
		do {
		
		showPizzaMenu();
		System.out.println("Enter your choice : ");
		choice = sc.nextInt();
			switch (choice) {
			case 1:
				Pizza pizza =  new Pizza();
				System.out.println("Enter Pizza Name : ");
				pizza.setName(sc.next());
				System.out.println("Enter Crust : ");
				pizza.setCrust(sc.next());
				System.out.println("Enter size : ");
				pizza.setSize(sc.next());
				pizzaService.orderPizza(pizza);
				System.out.println("Success ! Thanks for your order");
				break;
			case 2:
				List<Pizza> pizzas =  pizzaService.showAllPizzas();	
				for (Pizza p : pizzas) {
					System.out.println("Name : "+p.getName()+"="+p.getSize()+"="+p.getCrust());
				}
				break;
			case 3:
				System.out.println("------3. Cook Pizza--------");			
				break;
			case 4:
				System.out.println("------4. Cancel Pizza--------");			
				break;
			case 0:
				System.out.println("------0. Exit--------");	
				System.exit(0);
				break;


			default:
				System.out.println("---------Wrong Choice----------");
				break;
			}
			System.out.println("Do you want to continue : (yes | no) : ");
			contiChoice=sc.next();
		} while(contiChoice.equalsIgnoreCase("yes"));

	}

	private void showPizzaMenu() {
		System.out.println("----------Pizza Menu------------");
		System.out.println("1. Order Pizza");
		System.out.println("2. Show All Pizzas");
		System.out.println("3. Cook Pizza");
		System.out.println("4. Cancel Pizza");
		System.out.println("0. Exit");

	}

}

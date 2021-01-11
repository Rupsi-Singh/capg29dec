package com.cg.pizzaapp.domain;

/**
 * This Pizza model will be used as a data traveller object from layer to layer
 * 
 * @author panka
 *
 */
public class Pizza {

	/**
	 * id of Pizza. Should be unique
	 */
	private Long id;
	/**
	 * name of the pizza
	 */
	
	private Long customerId;
	private String name;
	/**
	 * size of the pizza
	 */
	private String size;
	/**
	 * crust of the pizza
	 */
	private String crust;
	/**
	 * default toppings of the pizza. which can be customized.
	 */
	private String toppings;
	
	/**
	 * Pice of pizza
	 * Should be updated as per ordering
	 */
	private double price;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCrust() {
		return crust;
	}

	public void setCrust(String crust) {
		this.crust = crust;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Pizza [id=" + id + ", name=" + name + ", size=" + size + ", crust=" + crust + ", toppings=" + toppings
				+ ", price=" + price + "]";
	}
	
	

}

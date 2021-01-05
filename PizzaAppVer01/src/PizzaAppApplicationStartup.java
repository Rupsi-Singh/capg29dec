import java.util.Scanner;

/**
 * This is the startup class for the app
 * @author panka
 *
 */
public class PizzaAppApplicationStartup {	
	
	 static String pizzaName;
	 static String size;
	 static String crust; 
	 static double price;
	 static String toppings;

	public static void main(String[] args) {		

		// order pizza :  pizzaName, size, crust
		String tokenNo = orderPizza(PizzaConstants.VEG_EXTRAVAGENZA,
				PizzaConstants.VEG_EXTRAVAGENZA_MEDIUM,
				PizzaConstants.NEW_HAND_TOSTED_CRUST);
		cookPizza(tokenNo);
		// displayPizza
		
		displayDetail();
	}

	private static void displayDetail() {
		System.out.println("---------------Your Pizza Detail-------------------");
		System.out.println("Pizza Name : "+pizzaName);
		System.out.println("Size : "+size);
		System.out.println("Crust : "+crust);
		System.out.println("Price : "+price);
		System.out.println("Toppings : "+toppings);
	}

	private static void cookPizza(String tokenNo) {
		System.out.println("Wait for 30 mins! Your order is in queue");
		if(tokenNo.equalsIgnoreCase(PizzaAppApplicationStartup.pizzaName+"101")) {
			PizzaAppApplicationStartup.price = PizzaConstants.VEG_EXTRAVAGENZA_MEDIUM_PRICE;
			PizzaAppApplicationStartup.toppings = PizzaConstants.VEG_EXTRAVEGANZA_TOPPINGS;
		}
	}

	//Helper Method
	private static String orderPizza(String pizzaName, String size, String crust) {
		PizzaAppApplicationStartup.pizzaName = pizzaName;
		PizzaAppApplicationStartup.size = size;
		PizzaAppApplicationStartup.crust =  crust;
		return pizzaName+101;
	}

}

package inheritance;

public class Animal {
	private String name;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	//Overloading of Constructor
	public Animal(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void eat() {
		System.out.println(getName()+" is eating");
	}
	
	public void run() {
		System.out.println(getName()+" is running");
	}


}

package inheritance;

public class Dog extends Animal{	
	
	public Dog() {
		this("Unknown"); // call diversion
	}

	public Dog(String name) {
		super(name); // super class parameterized constructor calling
	}
	public void bark() {
		System.out.println(getName()+" is barking");
	}
}

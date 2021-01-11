package inheritance;

public class Cat extends Animal {

	
	public Cat(String name) {
		super(name);		
	}

	public void bite() {
		System.out.println(getName()+" is biting");
	}
}

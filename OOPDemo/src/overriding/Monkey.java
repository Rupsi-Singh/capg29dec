package overriding;



public class Monkey extends Animal {
	
	public Monkey() {
		// TODO Auto-generated constructor stub
	}
	
	public Monkey(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName()+" Intake food from Hand to mouth");
	}

}

package special_interface;

public class Tester extends Employee {

	public Tester(String name) {
		super(name);
	}
	@Override
	public void doSomething() {		
		System.out.println(getName()+" is Testing");
	}
}

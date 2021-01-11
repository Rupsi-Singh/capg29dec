package special_interface;

public class TestEmployee {

	public static void main(String[] args) {
		Employee [] employees = {
				new Programmer("Rishita"),
				new Tester("Pranjali"),
				new Programmer("Shrihari"),
				new Programmer("T Sheya"),
				new Tester("Pankaj")
		};
		
		for (Employee employee : employees) {
			if(employee instanceof Expert) {
				employee.doSomething();
			}
		}

	}

}

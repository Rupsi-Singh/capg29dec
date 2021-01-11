package abstraction_abstractclass;

public class HondaCity extends Car {
	
	public HondaCity() {
		// TODO Auto-generated constructor stub
	}

	public HondaCity(int regNo) {
		super(regNo);
		
	}

	@Override
	public void drive() {
		System.out.println("drive HondaCity with power steering");
		
	}

	@Override
	public void stop() {
		System.out.println("stop HondaCity with power break");
		
	}

}

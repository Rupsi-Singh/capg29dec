package abstraction_abstractclass;

public class Maruti800 extends Car{
	public Maruti800() {
		// TODO Auto-generated constructor stub
	}
	
	public Maruti800(int regNo) {
		super(regNo);
	}

	@Override
	public void drive() {
		System.out.println("drive Maruti 800 with normal steering");
		
	}

	@Override
	public void stop() {
		System.out.println("stop Maruti 800 with normal break");
		
	}

}

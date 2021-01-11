package abstraction_abstractclass;

public abstract class Car {
	
	private int regNo;
	
	public Car() {
		drive();
		fillTank();
		drive();
		stop();
	}
	
	public Car(int regNo) {
		this.regNo=regNo;
	}
	
	public int getRegNo() {
		return regNo;
	}
	public void fillTank() {
		System.out.println("Car is getting fulled : RegNo : "+getRegNo());
	}
	public abstract void drive();
	public abstract void stop();

}

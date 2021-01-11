package encapsulation;

public class Dog {
	
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if(age<0) {
			throw new RuntimeException("Negative Age is not Allowed");
		}
		this.age = age;
	}

	void eat() {
		System.out.println(name+" is eating : Age :"+age);
	}
	
	void run() {
		System.out.println(name+" is running : Age : "+age);
	}

}

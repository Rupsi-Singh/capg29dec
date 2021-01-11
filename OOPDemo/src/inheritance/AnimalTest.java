package inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal; // Rule :  ComilerRule :  call methods of reference type
		//animal=new Dog("Tommy");//Rule :  JVM Rule :  method call will be redirected to object type
		//animal=new Cat("Cuty");
		animal =new Dog();
		animal.eat();
		animal.run();
		if(animal instanceof Dog) { // animal IS-A Dog
			((Dog) animal).bark();//----Specialization (Downcasting)
		}
		if(animal instanceof Cat) { // animal IS-A Cat
			((Cat) animal).bite();//----Specialization (Downcasting)
		}

	}

}

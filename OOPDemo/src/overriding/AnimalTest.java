package overriding;

import javax.swing.JOptionPane;

public class AnimalTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		Animal animal;
//		animal =  new Monkey("Bajrangi");
//		animal.eat();
//		animal.run();
		
		
		String className = JOptionPane.showInputDialog("Enter the ObjectName");
		String objectName = JOptionPane.showInputDialog("Name of the Object");
		Class c = Class.forName("overriding."+className);
		Animal animal = (Animal)c.newInstance();
		animal.setName(objectName);
		animal.eat();
		animal.run();
	}

}

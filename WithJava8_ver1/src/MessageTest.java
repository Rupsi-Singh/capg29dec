
public class MessageTest {

	public static void main(String[] args) {
		MessageType messageType=()->System.out.println("Welcome in Java 8");
		//System.out.println(messageType);
		display(messageType);

	}

	private static void display(MessageType messageType) {
		messageType.perform();
		
	}

}

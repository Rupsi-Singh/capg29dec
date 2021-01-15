
public class MessageTest {

	public static void main(String[] args) {
		MessageType messageType=new WelcomeMessage();
		display(messageType);

	}

	private static void display(MessageType messageType) {
		messageType.perform();
		
	}

}

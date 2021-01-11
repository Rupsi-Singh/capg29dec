package interface_demo;

public class OracleDriver implements ConnectDB {

	@Override
	public void connect() {
		System.out.println("Connecting Oracle ......");
		
	}

	@Override
	public void use() {
		System.out.println("Using Oracle ...........");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected from Oracle");
		
	}

}

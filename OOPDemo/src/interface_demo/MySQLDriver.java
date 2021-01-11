package interface_demo;

public class MySQLDriver implements ConnectDB {

	@Override
	public void connect() {
		System.out.println("Connecting Mysql ......");
		
	}

	@Override
	public void use() {
		System.out.println("Using Mysql ...........");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected from Mysql");
		
	}

}

package interface_demo;

public class ConnectionTest {

	public static void main(String[] args) {
		ConnectDB con=new OracleDriver();
		
		con.connect();
		con.use();
		con.disconnect();

	}

}

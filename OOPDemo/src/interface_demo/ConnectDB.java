package interface_demo;
/**
 * ConnectDB interface will be performing common DB related operations
 * @author panka
 *
 */
public interface ConnectDB {
	/**
	 * this method is used for connecting with DB
	 */
	public void connect();
	
	/**
	 * this use method is use to perform DB transaction
	 */
	public void use();
	
	/**
	 * This disconnect method is used to disconnect from database
	 */
	public void disconnect();

}

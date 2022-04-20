package assignment3;

public class User {
	
	private static String userName;
	private static String password;
	
	
	
	public static String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		User.userName = userName;
	}
	public static String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		User.password = password;
	}

}

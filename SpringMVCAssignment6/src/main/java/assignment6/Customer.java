package assignment6;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Customer {
	
	
	@NotEmpty(message = "Should not be Empty")
	@Pattern(regexp = "[A-Za-z0-9]{8,20}",message = "Must be Alphanumeric and should have lenght 8 to 20")
	private static String userName;
	
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&.])[A-Za-z\\d$@$!%*?&.]{8,20}",
			message = "Password should contain at least one upper- case letter, lower-case letter, a digit or special character (_, $, #, ., @). Password should also be 8 to 20 characters long.")
	private static String password;
	
	@Email
	private static String eMail;
	
	@NotNull
	private static long contantNumber;
	
	@NotEmpty
	private static String city;
	
	@Pattern(regexp = "[0-9]{6}",message = "Length should be 6")
	private static int zipCode;
	
	
	
	public static String getUserName() {
		return userName;
	}
	public static void setUserName(String userName) {
		Customer.userName = userName;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		Customer.password = password;
	}
	public static String geteMail() {
		return eMail;
	}
	public static void seteMail(String eMail) {
		Customer.eMail = eMail;
	}
	public static long getContantNumber() {
		return contantNumber;
	}
	public static void setContantNumber(long contantNumber) {
		Customer.contantNumber = contantNumber;
	}
	public static String getCity() {
		return city;
	}
	public static void setCity(String city) {
		Customer.city = city;
	}
	public static int getZipCode() {
		return zipCode;
	}
	public static void setZipCode(int zipCode) {
		Customer.zipCode = zipCode;
	}

}

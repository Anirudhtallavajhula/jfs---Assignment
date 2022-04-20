package main.assignment;

public class ZipCode {

	private int ID;
	private String city;
	private String state;
	private String country;
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
		
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

	public ZipCode(int Id, String state, String city, String country) {
		super();
		ID = Id;
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

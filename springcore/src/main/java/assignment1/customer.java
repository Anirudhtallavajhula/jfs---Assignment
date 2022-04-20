package assignment1;

public class customer  {
	int Customerid;
	String Customername;
	Long CustomerContact;
	Address adress;
	public customer(int customerid, String customername, Long customerContact,Address ADress) {
		super();
		Customerid = customerid;
		Customername = customername;
		CustomerContact = customerContact;
		adress = ADress;
	}
	@Override
	public String toString() {
		return "Customer [Customerid=" + Customerid + ", Customername=" + Customername + ", CustomerContact="
				+ CustomerContact +" Adress="+ adress +"]";
	}

		
	
	
}

public class Address {
	
	private int house_no;
	private String street ;
	private String landmark ;
	private int pincode ;
	
	public Address(int house_no , String street , String landamrk , int pincode)
	{
		this.house_no = house_no;
		this.street = street;
		this.landmark = landamrk;
		this.pincode = pincode;
	}

	public int getHouse_no() {
		return house_no;
	}

	public String getStreet() {
		return street;
	}

	public String getLandmark() {
		return landmark;
	}

	public int getPincode() {
		return pincode;
	}
	
}

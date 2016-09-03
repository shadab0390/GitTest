import java.util.Map;

public class EmployeeAdd {
	
	private String building ;
	private String street ;
	private String landmark ;
	private int pin ;
	
	//private int houseNo ;
	//private int pin ;
	
	
	
	public EmployeeAdd(String building, String street, String landmark, int pin) {
		
		this.building = building;
		this.street = street;
		this.landmark = landmark;
		this.pin = pin;
	}
	
	public String getBuilding() {
		return building;
	}
	
	public String getStreet() {
		return street;
	}
	public String getLandmark() {
		return landmark;
	}
	public int getPin1() {
		return pin;
	}
	/*public int getHouseNo() {
		return houseNo;
	}
	public int getPin2() {
		return pin2;
	}*/	
	
}

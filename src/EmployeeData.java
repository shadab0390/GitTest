import java.util.HashMap;
import java.util.Map;

public class EmployeeData {
	private String name ;
	private int basSal ;
	private int age ;
	private String compName ;
	
	
	
	Map<String,EmployeeAdd> addMap = new HashMap<String,EmployeeAdd>();
	
	
	


	public EmployeeData(String name, int basSal, int age, String compName, Map<String, EmployeeAdd> addMap) {
		super();
		this.name = name;
		this.basSal = basSal;
		this.age = age;
		this.compName = compName;
		this.addMap = addMap;
	}


	public String getName() {
		return name;
	}


	public int getBasSal() {
		return basSal;
	}


	public int getAge() {
		return age;
	}


	public String getCompName() {
		return compName;
	}


	


	public Map<String, EmployeeAdd> getAddMap() {
		return addMap;
	}

	
}

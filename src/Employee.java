
 public class Employee
{
	private int empId ;
	private int empSal ;
	private	String empName;
	
	
	private Address add ;
	
	public Employee(int id , int sal , String name , Address add)
	{
		this.empId = id;
		this.empSal = sal;
		this.empName = name;
		this.add = add;
	}

	public int getEmpId() {
		return empId;
	}

	public int getEmpSal() {
		return empSal;
	}

	public String getEmpName() {
		return empName;
	}

	public Address getAdd() {
		return add;
	}
}
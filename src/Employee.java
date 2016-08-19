
 public class Employee
{
	private int empId ;
	private int empSal ;
	private	String empName;
	
	public Employee(int id , int sal , String name)
	{
		this.empId = id;
		this.empSal = sal;
		this.empName = name;
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
	}
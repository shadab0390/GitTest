import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmpSal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		EmployeeData[]  arr =  new EmployeeData[2];
		
		Tax tax = new Tax();
		
		for(int i=0 ; i<2 ;i++)
		{
			System.out.println("Enter Employee's name : ");
			String name = sc.next();
			
			System.out.println("Enter Employee's Basic Salary : ");
			int bSal =  sc.nextInt();
			
			System.out.println("Enter Employee's age :");
			int age = sc.nextInt();
			
			System.out.println("Enter Employee's Company name : ");
			String cName = sc.next();
			
			System.out.println("Enter building : ");
			String bName = sc.next();
			
			System.out.println("Enter Street : ");
			String street = sc.next();
			
			System.out.println("Enter Landmark : ");
			String lName = sc.next();
			
			System.out.println("Enter PinCode : ");
			int pin = sc.nextInt();
			
			
			EmployeeAdd add = new EmployeeAdd(bName,street , lName , pin);
			
			Map<String,EmployeeAdd> addMap = new HashMap<String,EmployeeAdd>();
			addMap.put("Office", add);
			addMap.put("Home", add);
			
			//EmployeeAdd add1 = addMap.get("Office");
			
			
			EmployeeData emp = new EmployeeData(name, bSal, age, cName, addMap);
			arr[i]= emp;
		}
		
		System.out.println("Name"+"          "+"BasicSal"+"         "+"Age"+"          "+"Company Building"+"          "+"Company Street"+"          "+"Copmany Landmark"+"          "+"Pin"+"          "+"NetSalary");
		for(int i =0 ; i<2 ;i++)
		{
			EmployeeData emp1 = arr[i];
			//EmployeeAdd add1 = emp1.getAdd();
			Map<String,EmployeeAdd> addMap1 = emp1.getAddMap();
			EmployeeAdd add1= addMap1.get("Office");
			System.out.println(emp1.getName() +"          "+ emp1.getBasSal()+"          "+emp1.getAge()+"           "+add1.getBuilding()+"           "+add1.getStreet()+"          "+add1.getLandmark()+"         "+add1.getPin1()+"          "+tax.taxpay(emp1.getBasSal()) );
		}

	}

}

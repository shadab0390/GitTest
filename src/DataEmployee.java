import java.util.Scanner;

public class DataEmployee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee[] arr = new Employee[2];
		
		for(int i=0;i<2;i++)
		{
			System.out.print("Enter employee id : ");
			int id = sc.nextInt();
			
			System.out.print("Enter employee name : ");
			String name = sc.next();			
			
			System.out.print("Enter employee salary : ");
			int sal = sc.nextInt();
			
			System.out.print("Enter house no.");
			int house_no = sc.nextInt();
			
			System.out.print("Enter street name : ");
			String street = sc.next();
			
			System.out.print("Enter landmark name : ");
			String landmark = sc.next();
			
			System.out.print("Enter pincode ");
			int pin = sc.nextInt();
			
			Address add = new Address(house_no, street,landmark, pin);
			
			Employee emp = new Employee(id, sal, name , add);
			arr[i]=emp;
		}
		
		System.out.println("ID     Name     Salary     House_No     Street    Landmark     Pincode");
		for(int i=0;i<2;i++)
		{
			Employee emp1 = arr[i];
			Address add = emp1.getAdd();
			
			System.out.println(emp1.getEmpId()+"     "+emp1.getEmpName()+"     "+emp1.getEmpSal()+"       "+add.getHouse_no()+"       "+add.getStreet()+"       "+add.getLandmark()+"       "+add.getPincode());
		}

	}

}

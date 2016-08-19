import java.util.Scanner;

public class DataEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] arr = new Employee[5];
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter employee id : ");
			int id = sc.nextInt();
			
			System.out.print("Enter employee name : ");
			String name = sc.next();
			
			System.out.print("Enter employee salary : ");
			int sal = sc.nextInt();
			
			Employee emp = new Employee(id, sal, name);
			arr[i]=emp;
		}
		
		System.out.println("ID  Name  Salary");
		for(int i=0;i<5;i++)
		{
			Employee emp1 = arr[i];
			
			System.out.println(emp1.getEmpId()+"  "+emp1.getEmpName()+"  "+emp1.getEmpSal());
		}

	}

}

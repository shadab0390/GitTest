import java.util.ArrayList;
import java.util.Scanner;

public class PersonRel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Person> relative = new ArrayList<Person>(5);
		
		relative.add(new Person("father","Male",6,69,null));
		relative.add(new Person("Mother","Female",5,65,null));
		relative.add(new Person("Sister1","Female",5,55,null));
		relative.add(new Person("Sister1","Female",5,50,null));
		
		Person per = new Person("Shadab", "Male", 6, 80,relative);
		
		ArrayList<Person> relative1 = new ArrayList<Person>(5);
		relative1.add(new Person("father","Male",5,69,null));
		relative1.add(new Person("Mother","Female",5,60,null));
		relative1.add(new Person("Brother1","Male",5,65,null));
		relative1.add(new Person("Brother2","Male",5,78,null));
		
		Person per1 = new Person("Harki", "Male", 6, 80,relative1);
		
		System.out.println("Enter Name of person to find his Relative :");
		String name = sc.next();
		
		if(per.getName().equalsIgnoreCase(name))
		{
			System.out.println(per.getName()+"     "+per.getSex()+"     "+per.getHt()+"     "+per.getWt());
			System.out.println("His Relatives are : ");
			for(Person str : relative)
			{
				System.out.println(str.getName()+"     "+str.getSex()+"     "+str.getHt()+"     "+str.getWt());
			}
		}
		
		else
		
		if(per1.getName().equalsIgnoreCase(name))
		{
			System.out.println(per1.getName()+"     "+per1.getSex()+"     "+per1.getHt()+"     "+per1.getWt());
			System.out.println("His Relatives are : ");
			for(Person str : relative1)
			{
				System.out.println(str.getName()+"     "+str.getSex()+"     "+str.getHt()+"     "+str.getWt());
			}
		}
		

	
	}
	

}

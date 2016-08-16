import java.util.Scanner;

public class SqFirstCubeSec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a two digit no. : ");
		int num = sc.nextInt();
		
		SqFirstCubeSec dig = new SqFirstCubeSec();
		dig.sqNumber(num);
		dig.cubeNumber(num);

	}
	void sqNumber(int num)
	{
		int x;
		x=num/10;
		System.out.println("Square of 1st Digit is : "+(x*x));
	}
	
	void cubeNumber(int num)
	{
		int x;
		x=num%10;
		System.out.println("Cube of 2nd Digit is : "+(x*x*x));
	}

}

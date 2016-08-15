import java.util.Scanner;

public class DoubleDigitOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("First 10 two digit odd numbers are :- ");
		for(int i=10  ; i<100  ; i++)
		{
			if(i%2!=0 && count<10)
				{
				System.out.println(i);
				count++;
				}
				}		
		}

	}

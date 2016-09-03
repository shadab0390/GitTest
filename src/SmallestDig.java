import java.io.IOException;
import java.util.Scanner;

public class SmallestDig {

	public static void main(String[] args) throws IOException {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter a 6 Digit no. : ");
		int num = sc.nextInt();
		
		SmallestDig dig =  new SmallestDig();
		
		int num1 = dig.smallestDigit(num);
		System.out.println("Smallest no.in 6 digit : "+num1);
		
	}
	
	int smallestDigit(int num)
	{
		int i=0;
		int[] arr =  new int[6];
			while(num>0)
			{				
				arr[i]=num%10;
				num=num/10;
				i++;				
			}	
			int temp = 0;
			for( i=0 ; i<arr.length ; i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]<arr[j])
					{
						temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				
			}
			return arr[arr.length-1];
	}
	}


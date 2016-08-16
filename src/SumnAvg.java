import java.io.IOException;
import java.util.Scanner;

public class SumnAvg {

	public static void main(String[] args) throws IOException {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a 6 Digit no. : ");
		int num = sc.nextInt();
		
		SumnAvg dig =  new SumnAvg();
		
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
				System.out.println(" Array element is "+arr[i]);
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
	
	
	/*int smallestno(int[] arr1)
	{
		int temp = 0;
		for(int i=0 ; i<arr1.length ; i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]<arr1[j])
				{
					temp = arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		return arr1[arr1.length-1];
	}*/

}


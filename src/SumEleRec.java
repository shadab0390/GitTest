import java.util.Scanner;

public class SumEleRec {

	public static void main(String[] args) {
		SumEleRec s = new SumEleRec();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of Elements : ");
		int n = sc.nextInt();
		int[] arr =  new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Element : ");
			arr[i]=sc.nextInt();
		}
		
		System.out.println(s.sumEle(arr, n-1));

	}
	int sum = 0;
	  int sumEle(int[] arr , int size)
	{
		
		
			if(size==0)
				return arr[size] ;
			else
			{
				sum = sum + arr[size] + sumEle(arr,size-1);
				
			}
		
		return sum;
	}

}

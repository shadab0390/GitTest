import java.io.*;

public class ArraySum {

	public static void main(String[] args) throws IOException {
		ArraySum arraySum = new ArraySum();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter No. Of Elements : ");
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0 ; i<n ; i++)     // Store elements in Array
		{
			System.out.print("Enter Element : ");
			arr[i]=Integer.parseInt(br.readLine());
			
		}		
		System.out.println("Array Elements are :");
		for(int i=0 ; i<n ; i++)
		{			
			System.out.println(arr[i]);
		}
		arraySum.sumElement(arr);
		
	}
	
	 void sumElement(int arr1[])
		{
			int sum = 0 ;
			for(int i=0 ; i<arr1.length; i++)
				sum+= arr1[i];
			System.out.println("Sum Of all Array elemnts are :"+ sum);
		}

	

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No. Of Elements : ");
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		SortArray sortarray = new SortArray();
		
		for(int i=0 ; i<n ; i++)     
		{
			System.out.print("Enter Element : ");
			arr[i]=Integer.parseInt(br.readLine());			
		}		
		System.out.println("Array Elements are :");
		for(int i=0 ; i<n ; i++)
		{			
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter Choice ");
		System.out.println("1.Ascending");
		System.out.println("2.Descending");
		System.out.println("3.Exit");
		int choice = Integer.parseInt(sc.next());
		switch(choice)
		{
		
		case 1 : sortarray.ascArray(arr);
		break;
		
		case 2 :sortarray.dscArray(arr);
		break;
		
		case 3 :exit();		
		break ;
		}

	}
	
	
	private static void exit() {
			}


	void ascArray(int[] arr1)
	{   int temp;
		for(int i=0 ; i<arr1.length ; i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]>arr1[j])
				{
					temp = arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		System.out.println("sorted array is ");
		for(int i=0 ; i<arr1.length;i++)
			System.out.println(arr1[i]);
	}
	
	void dscArray(int[] arr1)
	{   int temp;
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
		System.out.println("sorted array is ");
		for(int i=0 ; i<arr1.length;i++)
			System.out.println(arr1[i]);
	}
	

}

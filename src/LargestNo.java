import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestNo {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LargestNo large = new LargestNo();
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
		int l = large.largestno(arr);
		System.out.println("Largest No. is "+ l);		
	}
	
	int largestno(int[] arr1)
	{
		int temp = 0;
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
		return arr1[arr1.length-1];
	}
	}



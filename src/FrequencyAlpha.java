import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FrequencyAlpha {

	public static void main(String[] args) throws IOException {
	
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		FrequencyAlpha freq = new FrequencyAlpha();
		String str;
		System.out.print("Enter a sentence: ");
		str = sc.nextLine();
		System.out.println("Your sentence is : "+str );
		freq.countAlpha(str);
	}
	void countAlpha(String str1)
	{
		int count1=0;
		// int count2=0;
		boolean count2 = false;
	
		for(char i=0;i<str1.length();i++)
		{
			for(int j=0;j<str1.length();j++)
			{
				if(str1.charAt(i)==str1.charAt(j) )
					count1++;				 
			}
			for(int k=0;k<i;k++)
				{
				if(str1.charAt(i)==str1.charAt(k) )
					//count2=0;
					count2=true;
				}
			if(count2==false)
			System.out.println("Character "+str1.charAt(i)+" occurs "+count1+" times ");
			count1=0;
			//count2=0;
			count2=false;
		}		
	}
}

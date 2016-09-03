import java.util.Scanner;

public class FindVowel {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter a sentence : ");
		String str = sc.nextLine();
		
		FindVowel vowel = new FindVowel();
		vowel.findvowel(str);
		}
	
	void findvowel(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='o')
				countAlpha(str);
		}
	}
		
	public void countAlpha(String str1)
		{
			int count1=0;
			
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
				
				count2=false;
			}		
		}
	}


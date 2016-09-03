import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter a sentence : ");
		String str = sc.nextLine();
		
		ReverseString str1 = new ReverseString();
		System.out.println("Reverse ");
		str1.reverseStr(str);
	}
	
	void reverseStr(String str)
	{
		char[] arr = str.toCharArray();
		for(int i=arr.length-1 ; i>=0;i--)
			System.out.print(arr[i]);
		
			
	}

}

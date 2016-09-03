import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseStrRec {
	

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String str =  sc.next();
				
		ReverseStrRec rev = new ReverseStrRec();
			
		System.out.println("Reverse of String is :"+rev.reverseStr(str));
	}
		
	String reverseStr(String str)
	{ 
		String str1 = "";
		if(str.length()==1)
		return str;
		else
			str1 += str.charAt(str.length()-1)+reverseStr(str.substring(0, str.length()-1));
		return str1;
				}

}

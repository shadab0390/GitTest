import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EditFileNSave { 
     public static void main(String args[]) {
    	 try{
    		 File f = new File("harki.txt");
    		 System.out.println(f.exists());
    		 
	    	 FileReader file = new FileReader(f);
	//    	 BufferedReader reader =  new BufferedReader(file);
	//    	 
	//    	 String str1 = "";
	//    	 String str2 = reader.readLine();
	//    	 while(str2!=null)
	//    	 {
	//    		 str1+=str2;
	//    		 str2=reader.readLine();
	//    		 //System.out.println(str2);
	//    	 }
	//    	 reader.close();
	//    	 System.out.println(str1);
	    	 }catch(Exception e){
	    		 System.out.println(e.toString());
	    	 }
	    	 
     }
}

package file;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader; 
public class files {
	  
	    public static void main(String[] args) throws Exception {  
	        String line,message;  
	        int count = 0;
	        Scanner in=new Scanner(System.in);
	        String name;
	        System.out.println("Enter the file name");
	        name=in.nextLine();
	        System.out.println("Enter the message"); 
	        message=in.nextLine();
	        byte b[]=message.getBytes();   
	        FileOutputStream fout=new FileOutputStream(name);    
            fout.write(b);    
            fout.close();
	        //Opens a file in read mode  
	        FileReader file = new FileReader(name);  
	        BufferedReader br = new BufferedReader(file);  
	  
	        //Gets each line till end of file is reached  
	        while((line = br.readLine()) != null) {  
	            //Splits each line into words  
	            String words[] = line.split(" ");  
	            //Counts each word  
	            count = count + words.length;  
	  
	        }  
	  
	        System.out.println("Number of words present in given file: " + count);  
	        br.close();  

}
}

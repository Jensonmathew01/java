Program to write data into file.
********************************	
package file;
import java.io.FileOutputStream;
public class input { 
	    public static void main(String args[]){    
	           try{    
	             FileOutputStream fout=new FileOutputStream("D:\\jen.txt");    
	             fout.write(65);    
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	      } 
}

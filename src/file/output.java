package file;
import java.io.FileInputStream;
public class output { 
	     public static void main(String args[]){    
	          try{    
	            FileInputStream fin=new FileInputStream("D:\\jenson.txt");    
	            int i=fin.read();  
	            System.out.print((char)i);    
	  
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}    
	         }    
	        } 


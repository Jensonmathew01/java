Program to find sum of elements of a given list.
***********************************************	
package array;
import java.util.*;
public class sum {

	public static void main(String[] args) {
	   int a[]=new int[20];
	   int b[]=new int[20];
	   int num,i,j,sum=0;
	   Scanner in =new Scanner(System.in);
	   System.out.println("Enter the number of elements ");
	   num=in.nextInt();
	   if(num<=0)
		   System.out.println("Invalid input");
	   else
	   {
		   System.out.println("Enter elements");
		   for(i=0;i<num;i++)
		   {
			  a[i]=in.nextInt();
		   }
		   for(j=0;j<num;j++)
		   {
			   sum=sum+a[j];
			   b[j]=sum;
		   }
		   System.out.println("Sample output is");
		   for(i=0;i<num;i++)
		   {
			   System.out.print(b[i]+" ");
		   }
	   }
	   

 } 

}

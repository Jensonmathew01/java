Program to check whether given string is palindrome or not.
***********************************************************	
package array;
import java.util.*;
public class palindrome {
	public static void main(String args[])
	{
		String s,temp,sum="";
		int i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		s=in.nextLine();
		temp=s;
		for(i=s.length()-1;i>=0;i--)
		{
			sum=sum+s.charAt(i);
		}
		System.out.println("Reversal is "+sum);
		if(sum.equals(temp))
		{
			System.out.println("palindrome");
		
		}
		else
			System.out.println("not palindrome");
	}


}

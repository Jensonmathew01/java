Program to check whether a number is lucky or not.
***************************************************	
package array;

import java.util.Scanner;

public class lucky {
	public static void main(String args[])
	{
		int num,digit,count=0,flag1=0,flag2=0,flag3=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a four digit number ");
		num=in.nextInt();
		while(num!=0)
		{
		
			digit=num%10;
			if(digit==3)
				flag1=1;
			else if(digit==6)
				flag2=1;
			else if(digit==9)
				flag3=1;
			num=num/10;
			
         }
		if((flag1==1 && flag2==1 && flag3==1))
			System.out.println("lucky number");
		else
			System.out.println("not lucky number");


}
}

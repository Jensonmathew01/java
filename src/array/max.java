package array;
import java.util.*;

public class max {

	public static void main(String[] args) {
		int num,i,max;
		int a[]=new int[20];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of elements");
		num=in.nextInt();
		System.out.println("Enter elements");
		for(i=0;i<num;i++)
		{
			a[i]=in.nextInt();
		}
		max=a[0];
		for(i=1;i<num;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("maximum value is "+max);

	}

}

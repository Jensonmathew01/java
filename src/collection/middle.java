package collection;
import java.util.*;
public class middle {
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	LinkedList<Integer> list=new LinkedList<Integer>();
	int num,mid;
	int i;
	System.out.println("Enter size");
	num=in.nextInt();
	System.out.println("Enter elements");
	for(i=0;i<num;i++)
	{
		list.add(in.nextInt());
	}
	System.out.println(list);
	mid=num/2;
	if(num%2==0)
		{System.out.println(list.get(mid-1)+" "+list.get(mid));}
	else {	
		
	System.out.println("middle element is "+list.get(mid));
	}
}
}

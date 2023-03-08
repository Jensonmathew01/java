package collection;
import java.util.*;
public class target {
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	ArrayList<Integer> list=new ArrayList<Integer>();
	int num,i,j,flag=0;
	System.out.println("Enter size");
	num=in.nextInt();
	System.out.println("Enter elements");
	for(i=0;i<num;i++)
	{
		list.add(in.nextInt());
	}
	System.out.println(list);
	for(i=0;i<num;i++)
	{
		for(j=i+1;j<num;j++)
		{
			if(list.get(i)+list.get(j)==25)
			{
				System.out.println("Numbers are " +list.get(i)+" "+list.get(j));
				flag=1;
			}
		}
	}
	if(flag==0)
		System.out.println("No numbers");
		
		

	}	
}


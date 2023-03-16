Program to find common elements in two hashsets.
package collection;
import java.util.*;
public class common {
	public static void main(String args[])
	{
	  HashSet<String> a=new HashSet<String>();
	  HashSet<String> b=new HashSet<String>();
	  Scanner in=new Scanner(System.in);
	  int i,j,num;
	  System.out.println("Enter no of elements ");
	  num=in.nextInt();
	  System.out.println("Enter Elements of first set");
	  for(i=0;i<num;i++)
		  a.add(in.next());
	  System.out.println("first set is "+a);
	  System.out.println("Enter Elements of second set");
	  for(i=0;i<num;i++)
		  b.add(in.next());
	  System.out.println("second set is "+b);
	 // a.retainAll(b);
	  //System.out.println(a);
	 for(String l:a)
	 {
		 if(b.contains(l))
				 System.out.println(l);
	 }
	}

}

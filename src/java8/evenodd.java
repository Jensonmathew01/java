Java8 program to print even numbers in an arraylist.
****************************************************	
package java8;

import java.util.Arrays;
import java.util.List;

public class evenodd 
{
	public static void main(String args[])
	{
	List<Integer> s=Arrays.asList(23,45,33,44,66,77,88);
	s.stream().filter(t->t%2==0).forEach(t->System.out.println(t));
	}
}

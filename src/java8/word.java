Java8 program to print count of each words in the arraylist.
************************************************************	
package java8;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class word {
	public static void main(String args[])
	{
	 List<String> a=new ArrayList<String>();
	 a.add("jen");
	 a.add("jenson");
	 a.add("jenson");
	 a.add("mathew");
	 a.add("jen");
	 System.out.println(a);
	 Map<String,Long> count=a.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting() ));
	 System.out.println(count);
	}

}

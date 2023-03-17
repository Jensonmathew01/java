Java8 program to find square of arraylist elements.
***************************************************	
package java8;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Square {

	public static void main(String[] args) {
		List<Integer> s=Arrays.asList(1,2,3,4,5,6);
		List<Integer> squarelist=s.stream().map(t->t*t).collect(Collectors.toList());
		System.out.println(squarelist);

	}

}

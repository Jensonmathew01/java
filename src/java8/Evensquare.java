package java8;
import java.util.*;
import java.util.stream.Collector;
//public class evensquare {
import java.util.stream.Collectors;
	

	public class Evensquare {

		public static void main(String[] args) {
			List<Integer> s1=Arrays.asList(1,2,3,4,5,6);
			List<Integer> squarelist=s1.stream().filter(t->t%2==0).map(t->t*t).collect(Collectors.toList());
			System.out.println(squarelist);

		}

	}




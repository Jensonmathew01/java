package java8;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class filter {
	
		public static void main(String[] args) {
			List<String> s=Arrays.asList("tvm","thiruvalla","ernakulam");
			List<String> place=s.stream().filter(t->t.startsWith("t")).collect(Collectors.toList());
			System.out.println(place);

		}

	}



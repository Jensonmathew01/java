package java8;

import java.util.function.Predicate;

public class test{

	public static void main(String[] args) {
		Predicate<Integer> p=t->t%2==0;
		System.out.println(p.test(46));

	}



}

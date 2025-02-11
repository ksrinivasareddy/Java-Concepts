package com.codegnan.Java8Features;

import java.util.Date;
import java.util.function.Supplier;

public class FunctionExample {
	public static void main(String args[]) {
		/*
		 * Function<Integer,Integer> f = n -> n * n; System.out.println(f.apply(3));
		 * System.out.println(f.apply(4));
		 * 
		 * // String length Function<String,String> f1 = n -> n.length()+"";
		 * System.out.println(f1.apply("srinu"));
		 * 
		 * // function Chaining Function<Integer,Integer> f3 = n -> n * n;
		 * Function<Integer,Integer> f4= n -> n * n * n;
		 * System.out.println(f3.andThen(f4).apply(2));
		 * System.out.println(f3.compose(f4).apply(3));
		 * 
		 
		// consumer
		Consumer<String> c = s -> System.out.println(s);
		c.accept("srinu");
*/
		// Supplier
		Supplier<Date> s =()->new Date();
		System.out.println(s.get());
	}

}

package com.codegnan.Java8Features;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class predicate{
	public static void main(String args[]) {
		/*Predicate<Integer> p = i-> i > 10;
		System.out.println(p.test(5));
		System.out.println(p.test(11));
		// length using string
		Predicate<String> p1 = i-> i.length() > 3;
		System.out.println(p1.test("Srinu"));
		// is empty using collection
		Collection<String> c = List.of();
		Collection<String> c1 = List.of("Apple","Banana");
		Predicate<Collection> p2 = C -> C.isEmpty();
		System.out.println(p2.test(c));
		System.out.println(p2.test(c1));*/
		
		int arr[] = { 0, 5, 10, 15, 20, 25, 30 };
		Predicate<Integer> p1 = i-> i > 10;
		Predicate<Integer> p2 = i-> i % 2 == 0;
		System.out.println("Numbers greater than 10 : ");
		m1(p1,arr);
		System.out.println("Even numbers: ");
		m1(p2,arr);
		System.out.println("number less than 10");
		m1(p1.negate(),arr);
		System.out.println("number greater than 10 and even numbers: ");
		m1(p1.and(p2),arr);
		System.out.println("number greater than 10 or even numbers: ");
		m1(p1.or(p2),arr);
	}
	public static void m1(Predicate<Integer> p, int arr[]) {
		for(int x : arr) {
			if(p.test(x)) {
			System.out.println(x);
			}
		}
	}
}

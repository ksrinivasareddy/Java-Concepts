package com.codegnan.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingExampleUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<Integer> i1 = new ArrayList<>();
		for(int i = 0; i < 100; i++) {
			i1.add(i);
		}
		System.out.println(i1);
		ArrayList<Integer> i2 = new ArrayList<>();
		for(Integer i : i1) {
			if(i % 2 == 0) {
				i2.add(i);
			}
		}
		System.out.println(i2);*/
		
		// with stream
		ArrayList<Integer> l1 = new ArrayList<>();
		
		for(int i = 0; i < 20; i++) {
			l1.add(i);
		}
		System.out.println(l1);
		// filter with collect method.
		List<Integer> l = l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l);
		
		ArrayList<String> l2 = new ArrayList<>();
		l2.add("Srinu");
		l2.add("ravi");
		l2.add("mani");
		l2.add("venkat");
		l2.add("mahesh");
		System.out.println(l2);
		// using mapping function
		List<String> ll = l2.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ll);
		
	}

}

package com.codegnan.Java8Features;

import java.util.ArrayList;

public class ProcessingExampleUsingCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Srinu");
		l1.add("ravi");
		l1.add("mani");
		l1.add("venkat");
		l1.add("mahesh");
		System.out.println(l1);
		long count = l1.stream().filter(s->s.length()==5).count();
		System.out.println(count);

	}

}

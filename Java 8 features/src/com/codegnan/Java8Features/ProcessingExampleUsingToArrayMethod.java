package com.codegnan.Java8Features;

import java.util.ArrayList;

public class ProcessingExampleUsingToArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Srinu");
		l1.add("ravi");
		l1.add("mani");
		l1.add("venkat");
		l1.add("mahesh");
		
		String[] ir = l1.stream().toArray(String[]::new);
		for(String i : ir) {
			System.out.println(i);
		}
		
	}

}

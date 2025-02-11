package com.codegnan.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingExampleUsingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Srinu");
		l1.add("ravi");
		l1.add("mani");
		l1.add("venkat");
		l1.add("mahesh");
		System.out.println(l1);
		List<String> defaultSorting = l1.stream().sorted().collect(Collectors.toList());
		System.out.println(defaultSorting);
		
		// customized sorting method
		List<String> customOrder = l1.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(customOrder);
		
		// min and max values
		
		String min = l1.stream().min((s1,s2)->s1.compareTo(s2)).get();
		String max = l1.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println(max);
		System.out.println(min);
	}

}
